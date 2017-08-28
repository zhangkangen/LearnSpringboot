package com.zh.service.Impl;

import com.zh.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract   class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private Mapper<T> mapper;

    @Override
    public Integer save(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public Integer delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public Integer updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public Integer updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public T selectOneByExample(Object example) {
        List<T> list = mapper.selectByExample(example);
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Integer selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }


}
