package com.qf.luntan_view.controller;

import com.qf.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/29 21:35
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("register")
    @ResponseBody
    public Result login(){
        Result result = new Result();

        return result;
    }

}
