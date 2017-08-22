package com.zh.domain;

import com.sun.xml.internal.rngom.parse.host.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/21.
 */
public class TUserInfo extends BaseEntity implements Serializable {

    @Column(unique = true)
    private String username;
    private String name;
    private String password;
    private String salt;//加密密码的盐
    private byte state;//用户状态

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    /**
     * 密码加盐
     *
     * @return
     */
    public String getCredentialsSalt() {
        return this.username + this.salt;
    }
}
