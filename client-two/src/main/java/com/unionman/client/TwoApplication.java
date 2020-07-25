package com.unionman.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"com.unionman.api","com.unionman.client"})
public class TwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class);
    }
}
