package com.itchen.controller;

import com.itchen.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String test() throws InterruptedException {
//        Thread.sleep(5000);
        return "Hystrix中的生产者";
    }
    @PostMapping("/test01")
    public void test(User user){
        System.out.println(user.getName() + "被成功插入");
    }
}
