package com.wmr.springcloud.menuDemo.controller;

import com.wmr.springcloud.menuDemo.entity.Menu;
import com.wmr.springcloud.menuDemo.repository.MenuRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Value("${server.port}")
    public String port;

    @Autowired
    private MenuRepositpry menuRepositpry;

    @GetMapping("/index")
    public String index(){
        return "menu端口号：" + this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        return menuRepositpry.findAll(index, limit);
    }

}
