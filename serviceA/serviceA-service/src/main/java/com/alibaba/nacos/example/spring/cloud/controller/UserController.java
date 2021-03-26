package com.alibaba.nacos.example.spring.cloud.controller;

import com.alibaba.nacos.example.spring.cloud.model.User;
import com.alibaba.nacos.example.spring.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

import static com.alibaba.nacos.serviceA.ApiInfo.CURRENT_VERSION;

@RestController
public class UserController {

    private final UserService userService;

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