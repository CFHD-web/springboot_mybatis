package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.dao.PeopleDao;
import com.example.springboot_mybatis.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyBatisController {

    @Autowired
    private PeopleDao peopleDao;

    @RequestMapping("/demo")
    public People demo(){
		System.out.println("访问成功");
        return peopleDao.findById(1);
    }
}
