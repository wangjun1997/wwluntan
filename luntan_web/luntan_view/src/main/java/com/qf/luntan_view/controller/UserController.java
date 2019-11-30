package com.qf.luntan_view.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Result;
import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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

    /**
     * 用户登陆
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("login")
    @ResponseBody
    public Result login(User user, HttpSession session){
        Result result = new Result();

        User res =  userService.login(user);
        if(res!=null) {
            result.setRes(true);
            session.setAttribute("user",res);
        }else{
            result.setRes(false);
            result.setData("用户名或密码错误");
        }
        return result;
    }

    @RequestMapping("changeInfo")
    @ResponseBody
    public Result changeInfo(User user,HttpSession session){
        Result result = new Result();
        System.out.println(user);
        int u =  userService.changeInfo(user);
        if(u>0){
             result.setRes(true);
             session.invalidate();
        }else{
            result.setRes(false);
            result.setData("出现未知错误！");
        }
        return result;
    }
}
