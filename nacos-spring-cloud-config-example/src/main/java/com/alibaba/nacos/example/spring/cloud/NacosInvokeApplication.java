package com.alibaba.nacos.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Document: https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosInvokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosInvokeApplication.class, args);
    }
}


