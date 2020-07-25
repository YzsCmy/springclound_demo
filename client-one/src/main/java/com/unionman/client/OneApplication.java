package com.unionman.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringCloudApplication
@ComponentScan(basePackages={"com.unionman.api","com.unionman.client"})
public class OneApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class);
    }
}
