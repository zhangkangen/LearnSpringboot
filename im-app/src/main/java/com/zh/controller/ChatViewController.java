package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatViewController {

    @RequestMapping("/find")
    public ModelAndView find(){
        ModelAndView result = new ModelAndView();
        return result;
    }
}
