package com.zuihuibao.pagemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.zuihuibao.pagemanage.dao")
@SpringBootApplication
public class PageManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageManageApplication.class, args);
    }

}
