package com.zhang.test;

import com.zhang.config.TestConfig;
import com.zhang.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
        IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
        indexDao.query();
    }
}
