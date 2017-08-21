package com.zh.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lenovo on 2017/8/21.
 */
@Controller
public class LogonController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(String email, String pass) {

        String error = null;
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(email, pass);
        try {
            subject.login(token);
            return "redirect:/index";
        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (AuthenticationException e) {
            error = "其他错误" + e.getMessage();
        }
        return "/login";
    }

    @RequestMapping("/reg")
    public String reg() {
        return "reg";
    }
}
