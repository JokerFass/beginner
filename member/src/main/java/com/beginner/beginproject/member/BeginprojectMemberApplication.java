package com.beginner.beginproject.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.beginner.beginproject.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class BeginprojectMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginprojectMemberApplication.class, args);
    }

}
