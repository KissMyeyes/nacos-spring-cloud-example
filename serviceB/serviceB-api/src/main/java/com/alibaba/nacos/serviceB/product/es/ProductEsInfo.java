package com.alibaba.nacos.serviceB.product.es;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;


@ApiModel
@Document(indexName = ProductEsInfo.ES_PRODUCT_ALIAS, type = ProductEsInfo.ES_PRODUCT_TYPE, createIndex = false)
public class ProductEsInfo implements Serializable {

    public static final String ES_PRODUCT_ALIAS = "pointspay_market_product_alias";
    public static final String ES_PRODUCT_TYPE = "product";

    @Id
    private Long kid;

    @ApiModelProperty(value = "商品条形编码")
    private String productNo;
    /**
     * 商品名
     */
    @Field(searchAnalyzer = "ik_smart", analyzer = "ik_max_word", type = FieldType.Text)
    private String productName;
    @ApiModelProperty(value = "店铺ID")
    private Long shopId;
    @ApiModelProperty(value = "店铺商品分类")
    private Long shopProductCategoryId;
    @ApiModelProperty(value = "推荐排序")
    private Integer recommandSort;

    public Integer getRecommandSort() {
        return recommandSort;
    }

    public void setRecommandSort(Integer recommandSort) {
        this.recommandSort = recommandSort;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
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

    public Long getShopProductCategoryId() {
        return shopProductCategoryId;
    }

    public void setShopProductCategoryId(Long shopProductCategoryId) {
        this.shopProductCategoryId = shopProductCategoryId;
    }
}
