package com.itchen.controller;

import com.itchen.domain.User;
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

    public ConsumerController() {
    }

    @RequestMapping("/test")
    public String test(){
        return "SpringCloud服务的消费者";
    }
    private User user;
    @RequestMapping("/getInfo")
    public String getInfo(User user){
//
        String URI = "http://SC-02-DemoEurekaProvider:8081/test?name={0}&age={1}";

        ResponseEntity<User> forEntity = restTemplate.getForEntity(URI, User.class,"itchen",19);
        User info = forEntity.getBody();
        return "获取到生产者信息" + info;

    }

}
