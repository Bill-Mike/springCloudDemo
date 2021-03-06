package com.wmr.springcloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Value("${server.port}")
    public String port;

    @GetMapping("/index")
    public String index(){
        return "order端口号：" + this.port;
    }
}
