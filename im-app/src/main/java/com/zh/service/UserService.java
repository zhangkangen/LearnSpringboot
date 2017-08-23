package com.zh.service;

import com.zh.domain.TUserInfo;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface UserService {

    TUserInfo selectByUsername(String username);

    Integer selectCount(TUserInfo userInfo);

    Integer save(TUserInfo userInfo);
}
