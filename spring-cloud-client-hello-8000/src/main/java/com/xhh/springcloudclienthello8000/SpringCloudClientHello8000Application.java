package com.xhh.springcloudclienthello8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class SpringCloudClientHello8000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientHello8000Application.class, args);
    }

}
