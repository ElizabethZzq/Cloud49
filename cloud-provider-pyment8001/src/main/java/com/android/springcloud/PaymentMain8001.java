package com.android.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//表示当前是client端
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    //主启动类
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
