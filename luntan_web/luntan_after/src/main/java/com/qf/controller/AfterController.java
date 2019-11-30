package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Admin;
import com.qf.entity.User;
import com.qf.service.IAfterService;
import com.qf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("after")
public class AfterController {

    @Reference
    private IAfterService afterService;

    @Reference
    private IUserService userService;

    /**
     * 后台管理登录验证
     * @return
     */
    @RequestMapping("/login")
    public String Login(Admin admin,HttpSession session){

        /*System.out.println(admin.getAdminname());
        System.out.println(admin.getAdminpassword());*/
        Admin admin1 = afterService.getLogin(admin);
        /*System.out.println(admin1);*/
        if(admin1!=null){
            session.setAttribute("admin",admin1);
            return "after/index";
        }
        return "after/login";
    }


    @RequestMapping("/userList")
    public String userList( Model model){
        List<User> useelist = userService.userlist();
        model.addAttribute("userlist",useelist);
        return "after/adminlist";
    }

}
