package com.alibaba.nacos.serviceB.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品SKU
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@TableName("product_sku_temp")
@ApiModel(description = "商品SKU")
public class ProductSkuTemp extends ProductSku {
    /**
     * 库存
     */
    @TableField("stock_old")
    @ApiModelProperty(value = "库存")
    private Integer stockOld;

    public Integer getStockOld() {
        return stockOld;
    }

    public void setStockOld(Integer stockOld) {
        this.stockOld = stockOld;
    }
}
