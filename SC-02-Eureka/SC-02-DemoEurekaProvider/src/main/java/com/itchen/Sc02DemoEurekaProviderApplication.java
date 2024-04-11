package com.itchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc02DemoEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc02DemoEurekaProviderApplication.class, args);
    }

}
