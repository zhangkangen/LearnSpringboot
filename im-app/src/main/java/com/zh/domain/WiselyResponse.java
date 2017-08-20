package com.zh.domain;

import java.io.Serializable;

public class WiselyResponse implements Serializable{

    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString() {
        return "WiselyResponse{" +
                "responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
