package com.wmr.springcloud.eurekaDeme;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
public class EurekasServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekasServerApplication.class, args);
    }
}
