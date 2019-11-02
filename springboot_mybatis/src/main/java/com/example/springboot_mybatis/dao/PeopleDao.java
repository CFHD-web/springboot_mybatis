package com.example.springboot_mybatis.dao;


import com.example.springboot_mybatis.pojo.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleDao {

    public People findById(int id);


}
