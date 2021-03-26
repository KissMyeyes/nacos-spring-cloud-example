package com.alibaba.nacos.example.spring.cloud.handler;


import com.alibaba.nacos.example.spring.cloud.service.IProductService;
import com.alibaba.nacos.serviceB.product.entity.Product;
import com.alibaba.nacos.serviceB.product.es.ProductEsInfo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yryz.framework.component.elasticsearch.increment.EsIncrementInfo;
import com.yryz.framework.component.elasticsearch.increment.EsIncrementTypeEnum;
import com.yryz.framework.component.elasticsearch.sync.EsAliasHandler;
import com.yryz.framework.core.base.BaseConstants;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * @author wangwei
 * @since 2020/4/10 10:48
 */
@Service
public class ProductSyncService implements EsAliasHandler<Product, ProductEsInfo> {
    @Autowired
    private IProductService productService;

    @Override
    public boolean support(String s) {
        return aliasName().equals(s);
    }

    @Override
    public String aliasName() {
        return ProductEsInfo.ES_PRODUCT_ALIAS;
    }

    @Override
    public String indexType() {
        return ProductEsInfo.ES_PRODUCT_TYPE;
    }

    @Override
    public Function<IPage<Product>, IPage<Product>> functionPageSource() {
        return page -> productService.page(page, new LambdaQueryWrapper<Product>()
                .eq(Product::getShelveFlag, BaseConstants.Shelve.UP)
                .eq(Product::getDelFlag, BaseConstants.DelFlag.UN_DELETE)
                .orderByAsc(Product::getKid));
    }

    @Override
    public Function<Product, ProductEsInfo> functionEntityParse() {
        return e -> {
            ProductEsInfo esInfo = new ProductEsInfo();
            BeanUtils.copyProperties(e, esInfo);
            return esInfo;
        };
    }

    @Override
    public Function<Set<Long>, Collection<EsIncrementInfo<Product>>> functionIncrementSource() {
        return kids -> {
            List<EsIncrementInfo<Product>> list = new ArrayList<>();
            Collection<Product> listByIds = productService.listByIds(kids);
            listByIds.forEach(item -> {
                if (item.getDelFlag().equals(BaseConstants.DelFlag.UN_DELETE)
                        && item.getShelveFlag().equals(BaseConstants.Shelve.UP)) {
                    list.add(new EsIncrementInfo<>(EsIncrementTypeEnum.SAVE_OR_UPDATE, item));
                } else {
                    list.add(new EsIncrementInfo<>(EsIncrementTypeEnum.DELETE, item));
                }
            });
            return list;
        };
    }
}