package com.zh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class TMessage extends BaseEntity implements Serializable{

    private Integer uid;
    private Integer toId;
    /**
     * 内容
     */
    private String content;
    /**
     * 类型
     */
    private String emit;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmit() {
        return emit;
    }

    public void setEmit(String emit) {
        this.emit = emit;
    }
}
