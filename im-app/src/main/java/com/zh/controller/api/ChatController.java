package com.zh.controller.api;

import com.zh.common.ResponseMsg;
import com.zh.common.response.InitResponseModel;
import com.zh.common.response.MemberResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/20.
 */
@RestController
@RequestMapping("/api/im")
public class ChatController {

    /**
     * LayIM初始化信息接口
     *
     * @return
     */
    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ResponseMsg<InitResponseModel> getList() {
        ResponseMsg<InitResponseModel> res = new ResponseMsg<InitResponseModel>();
        res.setCode(0);

        InitResponseModel resModel = new InitResponseModel();

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
}