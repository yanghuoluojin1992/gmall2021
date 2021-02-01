package com.atguigu.gmall.usermanage.controller;

import com.atguigu.gmall.usermanage.bean.UserInfo;
import com.atguigu.gmall.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by luogang on 2021-02-01 18:04
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> getAll(){
        System.out.println("云端修改");
        
        return userService.findAll();
    }

    @RequestMapping("findAllList")
    public List<UserInfo> findAllList(){
        
        System.out.println("云端修改");
        System.out.println("云端修改");

        return userService.findAll();
    }
}
