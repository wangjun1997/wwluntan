package com.qf.luntan_after;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@DubboComponentScan("com.qf")
public class LuntanAfterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuntanAfterApplication.class, args);
    }

}
