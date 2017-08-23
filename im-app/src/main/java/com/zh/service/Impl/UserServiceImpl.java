package com.zh.service.Impl;

import com.zh.domain.TUserInfo;
import com.zh.mapper.UserMapper;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TUserInfo selectByUsername(String username) {

        TUserInfo userInfo = new TUserInfo();
        userInfo.setUsername(username);
        return userMapper.selectOne(userInfo);
    }

    @Override
    public Integer selectCount(TUserInfo userInfo) {
        return userMapper.selectCount(userInfo);
    }

    @Override
    public Integer save(TUserInfo userInfo) {
        return userMapper.insert(userInfo);
    }
}
