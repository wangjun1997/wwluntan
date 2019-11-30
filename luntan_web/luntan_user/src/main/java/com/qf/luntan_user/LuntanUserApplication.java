package com.qf.luntan_user;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.luntan_user.mapper")
@DubboComponentScan("com.qf.luntan_user.serviceimpl")
public class LuntanUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuntanUserApplication.class, args);
    }

}
