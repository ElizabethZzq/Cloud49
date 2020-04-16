package com.android.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZk80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerZk80.class,args);
    }
}
