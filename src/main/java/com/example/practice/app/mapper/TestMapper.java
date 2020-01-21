package com.example.practice.app.mapper;

import com.example.practice.app.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.practice.app.model.User;

@Mapper
public interface TestMapper {
    @Select("select * from user where user_id = 'usr00001'")
    User getUser();

    @Select("select * from city where id = 1")
    City getCity();

}
