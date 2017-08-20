package com.zh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 内容
     */
    private String content;
    /**
     * 类型
     */
    private String emit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
