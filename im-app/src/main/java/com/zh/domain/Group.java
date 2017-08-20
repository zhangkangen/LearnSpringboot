package com.zh.domain;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;
import java.util.List;

/**
 * 分组
 * Created by lenovo on 2017/8/19.
 */
@Entity
@Table(name = "t_group")
public class Group implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String groupname;
    private String avatar;
    @ManyToMany
    @JoinTable(name = "T_FriendGroup",joinColumns = {@JoinColumn(name = "groupId")},inverseJoinColumns = {@JoinColumn(name = "friendId")})
    private List<Friend> list;

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

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public List<Friend> getList() {
        return list;
    }

    public void setList(List<Friend> list) {
        this.list = list;
    }
}
