package com.zxwl.conrotller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingww
 * @Date: 2018/11/29 15:36
 * @Description:
 */

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping(value="/say")
    public String sayHello(){
        return "hello";
    }

}
