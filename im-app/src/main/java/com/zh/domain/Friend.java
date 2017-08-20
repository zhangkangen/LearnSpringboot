package com.zh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/21.
 */
@Entity
public class Friend implements Serializable {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer fid;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 好友id
     */
    private Integer id;
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
}
