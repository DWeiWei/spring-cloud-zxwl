package com.zxwl.controller;

import com.zxwl.client.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingww
 * @Date: 2018/12/6 14:58
 * @Description:
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;
    @GetMapping(value="/say")
    public String sayHello(){
        return helloService.hello();

    }
}
