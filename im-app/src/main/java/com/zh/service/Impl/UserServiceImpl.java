package com.zh.service.Impl;

import com.zh.domain.Staff;
import com.zh.repository.StaffRepository;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff getStaff(Integer id) {
        return staffRepository.getByUid(id);
    }
}
