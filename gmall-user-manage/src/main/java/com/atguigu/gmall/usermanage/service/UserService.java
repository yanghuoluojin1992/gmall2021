package com.atguigu.gmall.usermanage.service;

import com.atguigu.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * created by luogang on 2021-02-01 18:01
 */
public interface UserService {
    List<UserInfo> findAll();
}
