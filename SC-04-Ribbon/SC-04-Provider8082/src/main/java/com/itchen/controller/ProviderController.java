package com.itchen.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName ProviderController
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@RestController
public class ProviderController {
    @RequestMapping("/test")
    public String test(){
        return "Ribbon负载均衡的生产者8082";
    }
}
