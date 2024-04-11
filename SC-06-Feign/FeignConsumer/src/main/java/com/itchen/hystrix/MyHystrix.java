package com.itchen.hystrix;

import com.itchen.domain.User;
import com.itchen.service.TestService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName MyHystrix
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@Component
public class MyHystrix implements TestService {
    @Override
    public String test() {
        return "完蛋";
    }

    @Override
    public List test01() {
        return null;
    }

    @Override
    public User test02(User user) {
        return null;
    }

    @Override
    public String test03() {
        return null;
    }
}
