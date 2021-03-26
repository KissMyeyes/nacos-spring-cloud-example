package com.alibaba.nacos.example.spring.cloud.controller;

import com.alibaba.nacos.example.spring.cloud.model.User;
import com.alibaba.nacos.example.spring.cloud.service.UserService;
import com.alibaba.nacos.serviceA.demo.api.DemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;

import static com.alibaba.nacos.serviceA.ApiInfo.CURRENT_VERSION;

@RestController
public class UserController {

    private final UserService userService;

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

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * http://localhost:8080/user?id=1
     */
    @GetMapping("user")
    public User get(@RequestParam long id) {
        return userService.findById(id);
    }

    @GetMapping("{version}/pv/serviceA/get")
    public String detail(@RequestParam("kid") Long kid) {
        return userService.findById(kid).getName();
    }
}