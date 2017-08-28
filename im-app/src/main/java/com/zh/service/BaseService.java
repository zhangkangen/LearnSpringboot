package com.zh.service;

import java.util.List;

public interface BaseService<T> {

    Integer save(T entity);

    T selectByKey(Object key);

    Integer delete(Object key);

    Integer updateAll(T entity);

    Integer updateNotNull(T entity);

    List<T> selectByExample(Object example);

    T selectOne(T entity);

    T selectOneByExample(Object example);

    Integer selectCountByExample(Object example);
}
