package com.alibaba.nacos.serviceB.product.yb;

/**
 * @author wangwei
 * @since 2021/3/12 14:32
 */
public class YbProductCategory {

    /**
     * uid : 813701230071893827
     * parentUid : 0
     * name : 工艺品
     */

    private long uid;
    private int parentUid;
    private String name;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getParentUid() {
        return parentUid;
    }

    public void setParentUid(int parentUid) {
        this.parentUid = parentUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
