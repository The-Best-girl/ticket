package com.example.demo.dao;


import com.ticket.pojo.manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface managerMapper {
    /**
     * 1.超级管理员的操作
     * 2.普通管理员操作
     */
    //1、2、登录
    public manager login(String mName, String mPassword);
    //2、注册
    public int addManager(manager manager);
    //查询管路员id  通过给出的管理员类别得到id传到insert
    public int selectManager(manager manager);
    //1、查询全部管理员
    public List<manager> allManager();
    //1、2、删除管理员
    public int deleteManager(String username);
    //1、2、修改管理员信息
    public int updateManager(String name);
}
