package com.itchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc04Provider8081Application {

	public static void main(String[] args) {
		SpringApplication.run(Sc04Provider8081Application.class, args);
	}

}