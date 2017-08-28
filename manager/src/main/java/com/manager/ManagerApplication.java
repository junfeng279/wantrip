package com.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by junfeng on 17-7-26.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ManagerApplication {

    public static void main(String[] args){
        SpringApplication.run(ManagerApplication.class, "--server.port=8082");
    }
}
