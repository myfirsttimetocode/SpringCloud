package com.itchen.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MyHystrix
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
public class MyHystrix extends HystrixCommand<String> {
    private String uri;
    private RestTemplate restTemplate;
    public MyHystrix(String uri, RestTemplate restTemplate){
        this(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")));
        this.uri = uri;
        this.restTemplate = restTemplate;
    }
    protected MyHystrix(Setter setter) {
        super(setter);
    }



    @Override
    protected String getFallback() {

        return "完蛋";
    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForObject(uri,String.class);
    }
}
