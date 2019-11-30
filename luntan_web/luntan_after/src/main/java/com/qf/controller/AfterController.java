package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Admin;
import com.qf.entity.User;
import com.qf.service.IAfterService;
import com.qf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    /*查询所有用户信息的方法*/
    @RequestMapping("/userList")
    public String userList( Model model){
        List<User> useelist = userService.userlist();
        model.addAttribute("userlist",useelist);
        return "after/adminlist";
    }

    /*修改用户信息的方法*/
    @RequestMapping("userUpdate/{id}")
    public String userUpdate(@PathVariable("id") Integer id,Model model){
        System.out.println("要修改的用户ID"+id);
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "after/adminupdate";
    }

    /*修改个人信息的提交方法*/
    @RequestMapping("userupdateById")
    public String userUpdateById(User user){
        System.out.println(user.getUsersex());
        System.out.println(user.getUid());
        System.out.println(user.getUsername());
        System.out.println(user.getUseremail());
        int count = userService.getUser(user);
        if(count>0){
            return "redirect:/after/userList";
        }
        return null;
    }

}
