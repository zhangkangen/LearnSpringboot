package com.zh.common.response;

import com.zh.domain.TGroup;
import com.zh.domain.TStaff;

import java.security.acl.Group;
import java.util.List;

/**
 *
 * Created by lenovo on 2017/8/20.
 */
public class InitResponseModel {
    private TStaff mine;
    private List<TGroup> friend;
    private List<TGroup> group;

    public TStaff getMine() {
        return mine;
    }

    public void setMine(TStaff mine) {
        this.mine = mine;
    }

    public List<TGroup> getFriend() {
        return friend;
    }

    public void setFriend(List<TGroup> friend) {
        this.friend = friend;
    }

    public List<TGroup> getGroup() {
        return group;
    }

    public void setGroup(List<TGroup> group) {
        this.group = group;
    }
}
