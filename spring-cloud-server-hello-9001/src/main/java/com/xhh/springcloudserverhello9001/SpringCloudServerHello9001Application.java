package com.xhh.springcloudserverhello9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServerHello9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerHello9001Application.class, args);
    }

}
