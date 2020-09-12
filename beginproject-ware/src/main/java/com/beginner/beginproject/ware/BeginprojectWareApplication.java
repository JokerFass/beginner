package com.beginner.beginproject.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BeginprojectWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginprojectWareApplication.class, args);
    }

}
