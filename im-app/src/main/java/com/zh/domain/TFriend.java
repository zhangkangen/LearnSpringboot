package com.zh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/21.
 */
public class TFriend extends BaseEntity implements Serializable {
    /**
     * 好友id
     */
    private Integer fid;
    /**
     * 类型 friend：好友 group ：群友
     */
    private String type;
    private String username;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 好友签名
     */
    private String sign;
    /**
     * 好友分组
     */
    private Integer groupid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}
