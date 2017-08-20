package com.zh.service.Impl;

import com.zh.domain.Staff;
import com.zh.domain.UserInfo;
import com.zh.repository.StaffRepository;
import com.zh.repository.UserInfoRepository;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public Staff getStaff(Integer id) {
        return staffRepository.getByUid(id);
    }
    public UserInfo getUserInfo(Integer id){
        return userInfoRepository.getOne(id);
    }

    @Override
    public UserInfo getUserInfo(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        Example<UserInfo> example = Example.of(userInfo);
        return userInfoRepository.findOne(example);
    }
}
