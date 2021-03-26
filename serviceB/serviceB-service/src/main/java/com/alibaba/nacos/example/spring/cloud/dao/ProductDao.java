package com.alibaba.nacos.example.spring.cloud.dao;

import com.alibaba.nacos.serviceB.product.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@Repository
public interface ProductDao extends BaseMapper<Product> {

}
