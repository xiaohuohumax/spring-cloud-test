package com.xhh.springcloudconfig10000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig10000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig10000Application.class, args);
    }

}
