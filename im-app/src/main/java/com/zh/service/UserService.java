package com.zh.service;

import com.zh.domain.TStaff;
import com.zh.domain.TUserInfo;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface UserService extends BaseService<TUserInfo> {

    TUserInfo selectByUsername(String username);

    Integer selectCount(TUserInfo userInfo);

    TStaff selectByUId(Integer uid);

}
