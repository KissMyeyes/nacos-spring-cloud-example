package com.alibaba.nacos.serviceB.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yryz.framework.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * <p>
 * 商品SKU
 * </p>
 *
 * @author wangwei
 * @since 2020-10-16
 */
@TableName("product_sku")
@ApiModel(description = "商品SKU")
public class ProductSku extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableField("product_id")
    @ApiModelProperty(value = "商品ID")
    private Long productId;
    /**
     * 积分价格
     */
    @TableField("point_price")
    @ApiModelProperty(value = "积分价格")
    private BigDecimal pointPrice;
    /**
     * 销售价格
     */
    @TableField("sale_price")
    @ApiModelProperty(value = "销售价格")
    private BigDecimal salePrice;
    /**
     * 库存
     */
    @TableField("stock")
    @ApiModelProperty(value = "库存")
    private Integer stock;
    /**
     * 销售规格
     */
    @TableField("spec")
    @ApiModelProperty(value = "销售规格")
    private String spec;
    /**
     * 销售规格属性名称
     */
    @TableField("spec_attr_name")
    @ApiModelProperty(value = "销售规格属性名称")
    private String specAttrName;
    /**
     * 销量
     */
    @TableField("sales")
    @ApiModelProperty(value = "销量")
    private Integer sales;
    /**
     * 删除标识 0:有效 1:删除
     */
    @TableField("del_flag")
    @ApiModelProperty(value = "删除标识 0:有效 1:删除")
    private Integer delFlag;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(BigDecimal pointPrice) {
        this.pointPrice = pointPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSpecAttrName() {
        return specAttrName;
    }

    public void setSpecAttrName(String specAttrName) {
        this.specAttrName = specAttrName;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
