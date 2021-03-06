package com.zh.controller;

import com.zh.common.response.ResMsg;
import com.zh.domain.TUserInfo;
import com.zh.service.UserService;
import com.zh.util.Md5;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2017/8/21.
 */
@Controller
public class LogonController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        Subject subject = SecurityUtils.getSubject();
        TUserInfo userInfo = (TUserInfo) subject.getPrincipal();
        if (userInfo != null) {
            return "redirect:/index";
        }
        return "/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView doLogin(String username, String password) {

        ModelAndView result = new ModelAndView();

        String error = null;
        Subject subject = SecurityUtils.getSubject();
        System.out.println(subject);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            error = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            error = "用户名/密码错误";
        } catch (AuthenticationException e) {
            error = "其他错误" + e.getMessage();
        }
        if (error != null) {
            result.addObject("error", error);
        }
        return result;
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg() {
        return "reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    @ResponseBody
    public ResMsg doReg(@RequestParam String username, @RequestParam String password, @RequestParam String repeat_password) {

        ResMsg res = new ResMsg();

        TUserInfo userInfo = new TUserInfo();
        userInfo.setUsername(username);
        if (userService.selectCount(userInfo) > 0) {
            res.setStatus(1);
            res.setMsg("用户名已存在");
            return res;
        }
        userInfo.setPassword(Md5.encode(password));
        userInfo.setSalt(String.valueOf(Math.random()));
        userService.save(userInfo);

        res.setCode(0);
        res.setAction("/login/");
        res.setStatus(0);
        return res;
    }
}
