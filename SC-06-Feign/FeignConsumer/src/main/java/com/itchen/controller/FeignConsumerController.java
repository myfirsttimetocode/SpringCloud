package com.itchen.controller;

import com.itchen.domain.User;
import com.itchen.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName FeignConsumerController
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@RestController
public class FeignConsumerController {
    @Resource
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
        String info = testService.test();
        return "我是消费者,接收到生产者信息" + info;
    }
    @RequestMapping("/test01")
    public String test01(){
        List<User> userList = testService.test01();
        return "我是消费者,接收到生产者信息" + userList;
    }
    @RequestMapping("/test02")
    public String test02(){
        User user = testService.test02(new User("itchen",20));
        return "我是消费者,接收到生产者信息" + user;
    }
    @RequestMapping("/test03")
    public String test03(){
        String info = testService.test03();
        return "zuul消费者 接收到 ==> " + info;
    }
}
