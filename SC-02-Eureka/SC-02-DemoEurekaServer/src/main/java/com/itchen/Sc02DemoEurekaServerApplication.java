package com.itchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sc02DemoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc02DemoEurekaServerApplication.class, args);
    }

}
