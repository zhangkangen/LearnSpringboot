package com.zh.repository;

import com.zh.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    Staff getByUid(Integer id);
}
