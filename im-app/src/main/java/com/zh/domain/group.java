package com.zh.domain;

import java.util.List;

/**
 * 分组
 * Created by lenovo on 2017/8/19.
 */
public class group {
    private  Integer id;
    private String groupname;
    private String avatar;

    /**
     * 类型
     * friend 好友分组
     * group 群分组
     */
    private String type;

    /**
     * 群主
     */
    private Staff owner;
    /**
     * 群成员
     */
    private List<Staff> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
