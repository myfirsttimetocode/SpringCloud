package com.itchen.controller;

import com.itchen.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FeignController
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@RestController
public class FeignProviderController {

    @RequestMapping("/test")
    public String test(){
        int num = 1/0;
        return "我是生产者";
    }

    @RequestMapping("test01")
    public List test01(){
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("itchen",20));
        userList.add(new User("jack",22));
        userList.add(new User("milk",23));
        return userList;
    }
    @RequestMapping("test02")
    public User test02(@RequestBody User user){
        return user;
    }
    @RequestMapping("test03")
    public String test03(){
        return "我是zuul生产者";
    }
}
