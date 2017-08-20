package com.zh.repository;

import com.zh.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
