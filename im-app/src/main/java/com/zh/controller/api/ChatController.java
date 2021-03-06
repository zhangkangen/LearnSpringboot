package com.zh.controller.api;

import com.zh.common.ResponseMsg;
import com.zh.common.response.InitResponseModel;
import com.zh.common.response.MemberResponseModel;
import com.zh.controller.BaseController;
import com.zh.domain.TStaff;
import com.zh.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/20.
 */
@RestController
@RequestMapping("/api/im")
public class ChatController extends BaseController{

    @Autowired
    private UserService userService;

    /**
     * LayIM初始化信息接口
     *
     * @return
     */
    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ResponseMsg<InitResponseModel> getList() {
        ResponseMsg<InitResponseModel> res = new ResponseMsg<InitResponseModel>();
        res.setCode(0);
        res.setMsg("未获取到信息");

        InitResponseModel resModel = new InitResponseModel();

        TStaff staff = getStaff();
        resModel.setMine(staff);
        res.setData(resModel);

        return res;
    }

    /**
     * 获取群组群员
     *
     * @param id
     * @return
     */
    @RequestMapping("/getMembers")
    public ResponseMsg<MemberResponseModel> getMembers(Integer id) {
        ResponseMsg<MemberResponseModel> res = new ResponseMsg<MemberResponseModel>();

        return res;
    }

    /**
     * 在线状态切换
     *
     * @param online
     */
    @RequestMapping("/onlineChange")
    public boolean onlineChange(String online) {
        return true;
    }

    @RequestMapping("/searchFriend")
    public void searchFriend(String key){

    }
}