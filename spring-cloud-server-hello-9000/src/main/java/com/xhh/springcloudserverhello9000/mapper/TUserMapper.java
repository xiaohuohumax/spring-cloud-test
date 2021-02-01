package com.xhh.springcloudserverhello9000.mapper;

import com.xhh.springcloudapi.model.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TUserMapper {

    @Select("select * from t_user")
    List<TUser> findAll();
}
