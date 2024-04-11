package com.itchen.controller;

import com.itchen.hystrix.MyHystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
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
//    @RequestMapping("fail")
    public String error(Throwable throwable){
        System.out.println(throwable.getClass());
        System.out.println(throwable.getMessage());
        return "完啦，芭比Q啦";
    }

    @HystrixCommand(
            fallbackMethod = "error",
            commandProperties={
            @HystrixProperty(
            name="execution.isolation.thread.timeoutInMilliseconds",
            value="10000")
            }
    )
    @RequestMapping("/test")
    public String test(){
        String URI = "http://Provider/test?";
        MyHystrix myHystrix = new MyHystrix(URI,restTemplate);
        String info = myHystrix.execute();
        return "我是消费者,接收到生产者信息 " + info;
    }

}
