package com.xhh.springcloudserverhello9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServerHello9000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerHello9000Application.class, args);
    }

}
