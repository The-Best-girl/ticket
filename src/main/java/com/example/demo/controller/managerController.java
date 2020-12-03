package com.example.demo.controller;

import com.ticket.pojo.manager;
import com.ticket.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class managerController {
    @Autowired
    @Qualifier("managerServiceImpl")
    private managerService managerService;

    public com.ticket.service.managerService getManagerService() {
        return managerService;
    }

    public void setManagerService(com.ticket.service.managerService managerService) {
        this.managerService = managerService;
    }

    //1、2、登录
    @RequestMapping("/loginManager")
    public String login(String mName,String mPassword){
        managerService.login(mName,mPassword);
        return "redirect:/manager/";
    }
    //2、注册
    public String addManager(manager manager){
        managerService.addManager(manager);
        return "";
    }
    //查询管路员id  通过给出的管理员类别得到id传到insert
    public String selectManager(manager manager){
        return "";
    }
    //1、查询全部管理员
    public String allManager(Model model){
        List<manager>list=managerService.allManager();
        model.addAttribute("list",list);
        return "";
    }
    //1、2、删除管理员
    public String deleteManager(String username){
        return "";
    }
    //1、2、修改管理员信息
    public String updateManager(String name){
        return "";
    }

}
