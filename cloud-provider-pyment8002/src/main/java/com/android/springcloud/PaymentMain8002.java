package com.android.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//表示当前是client端
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    //主启动类
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
