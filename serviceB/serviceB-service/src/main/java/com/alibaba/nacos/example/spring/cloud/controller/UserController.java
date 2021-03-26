package com.alibaba.nacos.example.spring.cloud.controller;

import com.alibaba.nacos.example.spring.cloud.service.IProductService;
import com.alibaba.nacos.serviceA.demo.api.DemoApi;
import com.alibaba.nacos.serviceB.product.entity.Product;
import com.yryz.framework.core.util.ResponseUtils;
import com.yryz.framework.core.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private IProductService productService;

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private DemoApi demoApi;
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/feign/{str}")
    public String feign(@PathVariable String str) {
        return restTemplate.getForObject("http://serviceA/1.0/pv/serviceA/get?kid=" + str, String.class);
    }

    @RequestMapping(value = "/openFeign/{str}")
    public String feign(@PathVariable Long str) {
        return demoApi.detail(str);
    }

    @RequestMapping(value = "{version}/pv/products/action/detail")
    public Response<Product> detail(@PathVariable Long str) {
        return ResponseUtils.returnObjectSuccess(productService.getById(str));
    }

    /**
     * http://localhost:8080/user?id=1
     */
//    @GetMapping("user")
//    public User get(@RequestParam long id) {
//        return userService.findById(id);
//    }
//
//    @GetMapping("{version}/pv/serviceA/get")
//    public String detail(@RequestParam("kid") Long kid) {
//        return userService.findById(kid).getName();
//    }
}