package com.xhh.springcloudeureka7000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka7000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka7000Application.class, args);
    }

}
