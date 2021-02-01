package com.xhh.springcloudzuul6000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuul6000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuul6000Application.class, args);
    }

}
