package com.zxwl.client;

import org.springframework.stereotype.Component;

/**
 * @Author: dingww
 * @Date: 2018/12/6 14:20
 * @Description:
 */
@Component
public class FeignClientFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }
}
