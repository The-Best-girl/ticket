package com.example.demo.service;

import com.ticket.pojo.manager;

import java.util.List;

public interface managerService {
    //1、2、登录
    public manager login(String mName, String mPassword);
    //2、注册
    public int addManager(manager manager);
    //1、查询全部管理员
    public List<manager> allManager();
    //1、2、删除管理员
    public int deleteManager(String username);
    //1、2、修改管理员信息
    public int updateManager(String name);
}
