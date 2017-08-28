package com.zh.controller;

import com.zh.domain.TStaff;
import com.zh.domain.TUserInfo;
import com.zh.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    private UserService userService;

    public TUserInfo getUserinfo(){
        return (TUserInfo) SecurityUtils.getSubject().getPrincipal();
    }

    public TStaff getStaff(){
        TUserInfo userInfo  = (TUserInfo) SecurityUtils.getSubject().getPrincipal();

        return userService.selectByUId(userInfo.getId());
    }
}
