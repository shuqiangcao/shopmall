package com.csq.shopmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.csq.shopmall.user.mapper")
public class ShopUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserManageApplication.class, args);
    }

}
