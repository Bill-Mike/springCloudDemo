package com.wmr.springcloud.menuDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wmr.springcloud.menuDemo.repository")
public class MenuServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuServerApplication.class, args);
    }
}
