package com.qf.luntan_view.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/30 9:43
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("userReg.html").setViewName("userReg");
        registry.addViewController("userlogin.html").setViewName("userlogin");
        registry.addViewController("userChange.html").setViewName("userChange");
        registry.addViewController("topic.html").setViewName("topic");
       // registry.addViewController("balck.html").setViewName("http://10.36.140.131:8080/login");
        registry.addRedirectViewController("balck.html","http://10.36.140.131/after/login.html");
    }
}
