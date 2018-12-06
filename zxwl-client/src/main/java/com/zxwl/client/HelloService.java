package com.zxwl.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: dingww
 * @Date: 2018/12/6 14:08
 * @Description:
 */
@FeignClient(value = "zxwl-service",fallback = FeignClientFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hello/say")
    String hello();
}
