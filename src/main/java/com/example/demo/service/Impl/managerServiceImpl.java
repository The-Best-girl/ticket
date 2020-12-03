package com.example.demo.service.Impl;

import com.ticket.dao.managerMapper;
import com.ticket.pojo.manager;
import com.ticket.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class managerServiceImpl implements managerService {
    @Autowired
    private managerMapper managermapper;

    public managerMapper getManagermapper() {
        return managermapper;
    }

    public void setManagermapper(managerMapper managermapper) {
        this.managermapper = managermapper;
    }

    @Override
    public manager login(String mName,String mPassword) {
        return managermapper.login(mName,mPassword);
    }

    @Override
    public int addManager(manager manager) {
        return managermapper.addManager(manager);
    }

    @Override
    public List<manager> allManager() {
        return managermapper.allManager();
    }

    @Override
    public int deleteManager(String username) {
        return managermapper.deleteManager(username);
    }

    @Override
    public int updateManager(String username) {
        return managermapper.updateManager(username);
    }
}
