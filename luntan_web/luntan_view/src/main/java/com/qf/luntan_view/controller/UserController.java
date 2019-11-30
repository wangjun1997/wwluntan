package com.qf.luntan_view.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Result;
import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/29 21:35
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Reference
    private IUserService userService;

    @RequestMapping("toregister")
    public String toregister(){
        return "userReg";
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping("register")
    @ResponseBody
    public Result register(User user){
        Result result = new Result();
        user.setUserbirthday(new Date(System.currentTimeMillis()));
        user.setUserclass(2);
        user.setUserregdate(new Date(System.currentTimeMillis()));
        user.setUserpoint(3);
        user.setUsersex(true);
        user.setUserstatement("OK");
        System.out.println(user);

        Integer register = userService.register(user);
        if(register>0){
            result.setRes(true);
        }
        return result;
    }

}
