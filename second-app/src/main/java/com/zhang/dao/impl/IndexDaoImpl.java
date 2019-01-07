package com.zhang.dao.impl;

import com.zhang.dao.IndexDao;
import org.springframework.stereotype.Component;

@Component
public class IndexDaoImpl implements IndexDao {
    public void query() {
        System.out.println("indexdao--query");
    }
}
