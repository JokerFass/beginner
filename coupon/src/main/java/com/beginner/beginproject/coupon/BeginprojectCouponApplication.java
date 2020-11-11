package com.beginner.beginproject.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BeginprojectCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeginprojectCouponApplication.class, args);
    }

}
