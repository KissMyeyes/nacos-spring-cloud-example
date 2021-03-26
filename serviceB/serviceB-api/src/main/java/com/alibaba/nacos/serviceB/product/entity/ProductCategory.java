package com.alibaba.nacos.serviceB.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yryz.framework.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品类目
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@TableName("product_category")
@ApiModel(description = "商品类目")
public class ProductCategory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父级kid
     */
    @TableField("parent_kid")
    @ApiModelProperty(value = "父级kid")
    private Long parentKid;
    /**
     * 商品品类类型 0 实物商品 1 课程
     */
    @TableField("category_type")
    @ApiModelProperty(value = "商品品类类型 0 实物商品 1 课程")
    private Integer categoryType;
    /**
     * 类目名称
     */
    @TableField("category_name")
    @ApiModelProperty(value = "类目名称")
    private String categoryName;
    /**
     * 排序编号
     */
    @TableField("sort_num")
    @ApiModelProperty(value = "排序编号")
    private Integer sortNum;
    /**
     * 图标url
     */
    @TableField("icon")
    @ApiModelProperty(value = "图标url")
    private String icon;
    /**
     * 是否删除
     */
    @TableField("del_flag")
    @ApiModelProperty(value = "是否删除")
    private Integer delFlag;


    public Long getParentKid() {
        return parentKid;
    }

    public void setParentKid(Long parentKid) {
        this.parentKid = parentKid;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
