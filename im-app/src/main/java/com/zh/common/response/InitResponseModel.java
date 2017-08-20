package com.zh.common.response;

import com.zh.domain.Staff;

import java.security.acl.Group;
import java.util.List;

/**
 *
 * Created by lenovo on 2017/8/20.
 */
public class InitResponseModel {
    private Staff mine;
    private List<Group> friend;
    private List<Group> group;

    public Staff getMine() {
        return mine;
    }

    public void setMine(Staff mine) {
        this.mine = mine;
    }

    public List<Group> getFriend() {
        return friend;
    }

    public void setFriend(List<Group> friend) {
        this.friend = friend;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}
