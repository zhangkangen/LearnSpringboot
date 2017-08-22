package com.zh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class TMessage extends BaseEntity implements Serializable{
    /**
     * 内容
     */
    private String content;
    /**
     * 类型
     */
    private String emit;

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
