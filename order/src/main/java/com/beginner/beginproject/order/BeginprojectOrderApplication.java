package com.beginner.beginproject.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BeginprojectOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginprojectOrderApplication.class, args);
    }

}
