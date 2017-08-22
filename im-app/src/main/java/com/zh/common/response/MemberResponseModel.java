package com.zh.common.response;

import com.zh.domain.TStaff;

import java.util.List;

/**
 * Created by lenovo on 2017/8/20.
 */
public class MemberResponseModel {
    /**
     * 群组
     */
    private TStaff owner;
    /**
     * 群成员
     */
    private List<TStaff> list;

    public TStaff getOwner() {
        return owner;
    }

    public void setOwner(TStaff owner) {
        this.owner = owner;
    }

    public List<TStaff> getList() {
        return list;
    }

    public void setList(List<TStaff> list) {
        this.list = list;
    }
}
