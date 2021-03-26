package com.alibaba.nacos.serviceB;

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
@EnableFeignClients(basePackages = "com.alibaba.nacos.serviceB")
@Configuration
@ConditionalOnExpression("!'${spring.application.name}'.startsWith('serviceB')")
public class ServiceApiAutoConfiguration {
}
