package com.itchen.controller;

import com.domain.User;
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
    public Object test(User user){
        return user;
    }
}