package com.alibaba.nacos.serviceB.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品信息-副本
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@TableName("product_temp")
@ApiModel(description = "商品信息-副本")
public class ProductTemp extends Product {

    private static final long serialVersionUID = 1L;

    /**
     * 来源商品ID
     */
    @TableField("product_id")
    @ApiModelProperty(value = "来源商品ID")
    private Long productId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
