package com.alibaba.nacos.serviceB;


/**
 * Created by wangwei
 * All rights reserved.
 * <p>
 * Created on 2018/10/8 14:04
 * Created by wangwei
 */
public interface ApiInfo   {

    //当前版本
    String CURRENT_VERSION = "v1.0";

    //当前服务名称
    String SERVICE_NAME = "serviceB";
    String SERVICE_CN_NAME = "测试";

    //消费方调用的服务名称，默认为当前服务名称
    String TARGET_SERVICE_NAME = "${target.service." + SERVICE_NAME + ":" + SERVICE_NAME + "}";
}