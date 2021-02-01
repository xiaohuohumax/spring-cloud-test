package com.xhh.springcloudclienthello8000.controller;

import com.alibaba.fastjson.JSON;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xhh.springcloudapi.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;

    @Value("${book.name}")
    String bookName;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model) {

        Application application = eurekaClient.getApplication("SPRING-CLOUD-SERVER-HELLO");
        System.out.println(application.getInstances());
        TUser[] tUsers = restTemplate.getForObject("http://spring-cloud-zuul/serverHello/selectAll", TUser[].class);

        assert tUsers != null;
        List<TUser> list = Arrays.asList(tUsers);
        model.addAttribute("list", JSON.toJSONString(list));

        return "index";
    }


    @RequestMapping(value = "/config", method = RequestMethod.GET)
    @ResponseBody
    public String config() {
        return bookName;
    }


    @RequestMapping(value = "/hystrix", method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hystrix() {

        if (new Random().nextInt(100) < 50) {
            throw new RuntimeException("崩啦");
        }
        TUser[] forObject = restTemplate.getForObject("http://spring-cloud-zuul/serverHello/selectAll", TUser[].class);
        return JSON.toJSONString(forObject);
    }

    public String hystrixError() {
        return "hystrixError";
    }

}
