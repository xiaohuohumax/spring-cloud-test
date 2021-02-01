package com.xhh.springcloudserverhello9000.controller;


import com.xhh.springcloudapi.model.TUser;
import com.xhh.springcloudserverhello9000.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    TUserService tUserService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String msg) {
        return msg;
    }

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<TUser> selectAll() {
        return tUserService.findAll();
    }
}
