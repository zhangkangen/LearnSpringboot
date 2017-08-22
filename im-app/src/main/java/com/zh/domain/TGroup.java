package com.zh.domain;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;
import java.util.List;

/**
 * 分组
 * Created by lenovo on 2017/8/19.
 */
public class TGroup extends BaseEntity implements Serializable {

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
    private Integer owner;

    @Transient
    private List<TFriend> list;

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

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public List<TFriend> getList() {
        return list;
    }

    public void setList(List<TFriend> list) {
        this.list = list;
    }
}
