package com.zh.common.response;

import com.zh.domain.Staff;

import java.util.List;

/**
 * Created by lenovo on 2017/8/20.
 */
public class MemberResponseModel {
    /**
     * 群组
     */
    private Staff owner;
    /**
     * 群成员
     */
    private List<Staff> list;

    public Staff getOwner() {
        return owner;
    }

    public void setOwner(Staff owner) {
        this.owner = owner;
    }

    public List<Staff> getList() {
        return list;
    }

    public void setList(List<Staff> list) {
        this.list = list;
    }
}
