package com.wmr.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplicaiton.class, args);
    }
}
