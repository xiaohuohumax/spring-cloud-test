package com.xhh.springcloudserverhello9000.service.impl;

import com.xhh.springcloudapi.model.TUser;
import com.xhh.springcloudserverhello9000.mapper.TUserMapper;
import com.xhh.springcloudserverhello9000.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    TUserMapper tUserMapper;

    @Override
    public List<TUser> findAll() {
        return tUserMapper.findAll();
    }
}
