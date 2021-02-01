package com.atguigu.gmall.usermanage.service.impl;

import com.atguigu.gmall.usermanage.bean.UserInfo;
import com.atguigu.gmall.usermanage.mapper.UserMapper;
import com.atguigu.gmall.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by luogang on 2021-02-01 18:02
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfoList = userMapper.selectAll();
        return userInfoList;
    }
}
