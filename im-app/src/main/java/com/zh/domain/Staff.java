package com.zh.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lenovo on 2017/8/19.
 */
@Entity
public class Staff {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer uid;
    /**
     * 昵称
     */
    private String username;
    /**
     * 在线状态 online：在线 hide:隐身 离线：offline
     */
    private String status;
    /**
     * 签名
     */
    private String sign;
    /**
     * 头像
     */
    private String avatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
