package com.qf.controller;

import com.qf.entity.Admin;
import com.qf.service.IAfterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("after")
public class AfterController {


    private IAfterService afterService;

    /**
     * 后台管理登录验证
     * @return
     */
    @RequestMapping("/login")
    public String Login(Admin admin){



        return null;
    }

}
