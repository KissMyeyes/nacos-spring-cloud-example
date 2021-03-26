package com.alibaba.nacos.serviceB.product.yb;

/**
 * @author wangwei
 * @since 2021/3/12 14:32
 */
public class YbProduct {
    /**
     * uid : 1366004607492564649
     * categoryUid : 813701230071893827
     * name : 翠玉白菜
     * barcode : 1001
     * buyPrice : 10000
     * sellPrice : 15000
     * stock : 0
     * pinyin : CYBC
     * customerPrice : 15000
     * isCustomerDiscount : 1
     * description : 尺寸:长18.7公分，宽9.1公分，厚5.07公分
     * attribute1 : y
     * attribute2 :
     * attribute3 :
     * attribute4 :
     */

    private long uid;
    private long categoryUid;
    private String name;
    private String barcode;
    private int buyPrice;
    private int sellPrice;
    private int stock;
    private String pinyin;
    private int customerPrice;
    private int isCustomerDiscount;
    private String description;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getCategoryUid() {
        return categoryUid;
    }

    public void setCategoryUid(long categoryUid) {
        this.categoryUid = categoryUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public int getCustomerPrice() {
        return customerPrice;
    }

    public void setCustomerPrice(int customerPrice) {
        this.customerPrice = customerPrice;
    }

    public int getIsCustomerDiscount() {
        return isCustomerDiscount;
    }

    public void setIsCustomerDiscount(int isCustomerDiscount) {
        this.isCustomerDiscount = isCustomerDiscount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }
}
