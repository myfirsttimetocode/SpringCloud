package com.itchen.service;

import com.itchen.domain.User;
import com.itchen.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName TestService
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@FeignClient(name="ZuulGetWay/api-zuul",fallback = MyHystrix.class)
public interface TestService {
    @RequestMapping("/test")
    String test();

    @RequestMapping("/test01")
    List test01();

    @RequestMapping("/test02")
    User test02(@RequestBody User user);

    @RequestMapping("/test03?token=9527")
    String test03();


}
