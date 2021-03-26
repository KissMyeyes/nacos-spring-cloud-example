package com.alibaba.nacos.example.spring.cloud.service.impl;


import com.alibaba.nacos.example.spring.cloud.dao.ProductDao;
import com.alibaba.nacos.example.spring.cloud.service.IProductService;
import com.alibaba.nacos.serviceB.product.entity.Product;
import com.alibaba.nacos.serviceB.product.es.ProductEsInfo;
import com.yryz.framework.component.elasticsearch.increment.DefaultServiceWithSyncEs;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@Service
public class ProductServiceImpl extends DefaultServiceWithSyncEs<ProductDao, Product, ProductEsInfo> implements IProductService {


}
