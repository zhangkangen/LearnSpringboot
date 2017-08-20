package com.zh.service;

import com.zh.domain.Staff;
import com.zh.domain.UserInfo;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface UserService {

    Staff getStaff(Integer id);

    UserInfo getUserInfo(Integer id);

    UserInfo getUserInfo(String username);
}
