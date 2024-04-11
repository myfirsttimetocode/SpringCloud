package com.itchen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName ConsumerController
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/test")
    public String test(){
        return "SpringCloud服务的消费者";
    }
    @RequestMapping("/getInfo")
    public String getInfo(){
//
        String URI = "http://SC-02-DemoEurekaProvider:8081/test";


        ResponseEntity<String> forEntity = restTemplate.getForEntity(URI, String.class);
        String info = forEntity.getBody();
        return "获取到生产者信息" + info;
    }

}
