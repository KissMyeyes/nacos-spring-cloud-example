package com.alibaba.nacos.serviceB.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yryz.framework.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author wangwei
 * @since 2021-03-12
 */
@TableName("product")
@ApiModel(description = "商品信息")
public class Product extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品条形编码
     */
    @TableField("product_no")
    @ApiModelProperty(value = "商品条形编码")
    private String productNo;
    /**
     * 配送方式：0 所有 2 自提 1 快递
     */
    @TableField("distribution_type")
    @ApiModelProperty(value = "配送方式：0 所有 2 自提 1 快递")
    private Integer distributionType;
    /**
     * 商品名
     */
    @TableField("product_name")
    @ApiModelProperty(value = "商品名")
    private String productName;
    /**
     * 店铺ID
     */
    @TableField("shop_id")
    @ApiModelProperty(value = "店铺ID")
    private Long shopId;
    /**
     * 企业ID
     */
    @TableField("enterprise_id")
    @ApiModelProperty(value = "企业ID")
    private Long enterpriseId;
    /**
     * 店铺商品分类
     */
    @TableField("shop_product_category_id")
    @ApiModelProperty(value = "店铺商品分类")
    private Long shopProductCategoryId;
    /**
     * 运费模板id
     */
    @TableField("shipping_template_id")
    @ApiModelProperty(value = "运费模板id")
    private Long shippingTemplateId;
    /**
     * 展示图片
     */
    @TableField("detail_show_pic")
    @ApiModelProperty(value = "展示图片")
    private String detailShowPic;
    /**
     * 描述
     */
    @TableField("description")
    @ApiModelProperty(value = "描述")
    private String description;
    /**
     * 积分价格(分)【冗余SKU最低价】
     */
    @TableField("point_price")
    @ApiModelProperty(value = "积分价格(分)【冗余SKU最低价】")
    private BigDecimal pointPrice;
    /**
     * 促销价格(分)【冗余SKU最低价】
     */
    @TableField("sale_price")
    @ApiModelProperty(value = "促销价格(分)【冗余SKU最低价】")
    private BigDecimal salePrice;
    /**
     * 商品折扣率 8.88折记8.88
     */
    @TableField("commission_rate")
    @ApiModelProperty(value = "商品折扣率 8.88折记8.88")
    private BigDecimal commissionRate;
    /**
     * 推荐排序
     */
    @TableField("recommand_sort")
    @ApiModelProperty(value = "推荐排序")
    private Integer recommandSort;
    /**
     * 有效状态 0 没有审核通过过 1 审核通过一次 
     */
    @TableField("disable_status")
    @ApiModelProperty(value = "有效状态 0 没有审核通过过 1 审核通过一次 ")
    private Integer disableStatus;
    /**
     * 审核状态 1.待审 2.审核中 3.通过 4.驳回 5.撤回
     */
    @TableField("audit_status")
    @ApiModelProperty(value = "审核状态 1.待审 2.审核中 3.通过 4.驳回 5.撤回")
    private Integer auditStatus;
    /**
     * 上架状态：0->上架；1->下架
     */
    @TableField("shelve_flag")
    @ApiModelProperty(value = "上架状态：0->上架；1->下架")
    private Integer shelveFlag;
    /**
     * 删除标识 0:有效 1:删除
     */
    @TableField("del_flag")
    @ApiModelProperty(value = "删除标识 0:有效 1:删除")
    private Integer delFlag;
    /**
     * 销量
     */
    @TableField("sales")
    @ApiModelProperty(value = "销量")
    private Integer sales;
    /**
     * 版本号
     */
    @TableField("version_code")
    @ApiModelProperty(value = "版本号")
    private Integer versionCode;


    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Long getShopProductCategoryId() {
        return shopProductCategoryId;
    }

    public void setShopProductCategoryId(Long shopProductCategoryId) {
        this.shopProductCategoryId = shopProductCategoryId;
    }

    public Long getShippingTemplateId() {
        return shippingTemplateId;
    }

    public void setShippingTemplateId(Long shippingTemplateId) {
        this.shippingTemplateId = shippingTemplateId;
    }

    public String getDetailShowPic() {
        return detailShowPic;
    }

    public void setDetailShowPic(String detailShowPic) {
        this.detailShowPic = detailShowPic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getRecommandSort() {
        return recommandSort;
    }

    public void setRecommandSort(Integer recommandSort) {
        this.recommandSort = recommandSort;
    }

    public Integer getDisableStatus() {
        return disableStatus;
    }

    public void setDisableStatus(Integer disableStatus) {
        this.disableStatus = disableStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getShelveFlag() {
        return shelveFlag;
    }

    public void setShelveFlag(Integer shelveFlag) {
        this.shelveFlag = shelveFlag;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

}
