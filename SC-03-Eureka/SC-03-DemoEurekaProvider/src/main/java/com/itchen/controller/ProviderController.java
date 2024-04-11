package com.itchen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProviderController
 * @Description: TODO
 * @Author: ice_wan@msn.cn
 */

@RestController
public class ProviderController {
    @RequestMapping("/test")
    public String test(){
        return "使用 Eureka 注册中心实现的服务提供者";
    }
}