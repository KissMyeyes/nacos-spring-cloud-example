package com.alibaba.nacos.serviceA;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangwei
 * All rights reserved.
 * <p>
 * Created by wangwei
 * Created by wangwei
 */
@EnableFeignClients(basePackages = "com.alibaba.nacos.serviceA")
@Configuration
@ConditionalOnExpression("!'${spring.application.name}'.startsWith('serviceA')")
public class ServiceAApiAutoConfiguration {
}
