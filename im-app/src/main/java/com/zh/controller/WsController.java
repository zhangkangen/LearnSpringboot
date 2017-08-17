package com.zh.controller;

import com.zh.domain.WiselyMessage;
import com.zh.domain.WiselyResponse;
import com.zh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private MessageService messageService;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) {
        return new WiselyResponse("Welcome," + message.getName());
    }

    @MessageMapping("/chat")
    public void handleChat() {
        messagingTemplate.convertAndSendToUser("", "/queue/notifications", "");
    }

    @RequestMapping("/ws")
    public String ws() {
        return "ws";
    }
}
