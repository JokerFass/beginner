package com.beginner.beginproject.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.beginner.beginproject.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class BeginprojectProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginprojectProductApplication.class, args);
    }

}
