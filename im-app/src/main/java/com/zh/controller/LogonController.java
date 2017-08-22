package com.zh.controller;

import com.zh.common.response.ResMsg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        System.out.println(subject);
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

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String reg() {
        return "reg";
    }

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    @ResponseBody
    public ResMsg doReg(@RequestParam String username, @RequestParam String password, @RequestParam String repeat_password){

        ResMsg res = new ResMsg();
        res.setMsg("ok");
        res.setCode(0);
        res.setAction("/index/");
        res.setStatus(0);
        return res;

    }
}
