package com.wantrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by junfeng on 17-7-26.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AuthApplication {

    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, "--server.port=8081");
    }
}
