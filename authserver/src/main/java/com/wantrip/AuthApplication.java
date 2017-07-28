package com.wantrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by junfeng on 17-7-26.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, "--server.port=8081");
    }
}
