package com.zxwl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Ding
 * @Date: 2018/11/29 14:50
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.zxwl.client"})
@EnableAutoConfiguration
@RestController
public class ServiceBootstrap {
    public static void main(String[] args){
        SpringApplication.run(ServiceBootstrap.class,args);
    }
}
