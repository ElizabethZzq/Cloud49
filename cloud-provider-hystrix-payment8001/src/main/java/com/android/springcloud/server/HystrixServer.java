package com.android.springcloud.server;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class HystrixServer {

    @GetMapping(value = "hystrix/payment/ok")
    public String okHystrix(){
        return "线程名："+Thread.currentThread().getName()+"/t"+ UUID.randomUUID();
    }
    @GetMapping(value = "hystrix/payment/no")
    public String noHystrix(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程名："+Thread.currentThread().getName()+"/t"+ UUID.randomUUID();
    }
}
