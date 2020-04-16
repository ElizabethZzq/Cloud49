package com.android.springcloud.controller;

import com.android.springcloud.server.HystrixServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HystrixController {

    @Resource
    private HystrixServer hystrixServer;

    @GetMapping(value = "hystrix/payment/ok")
    public String okHystrix(){
        return hystrixServer.okHystrix();
    }

    @GetMapping(value = "hystrix/payment/no")
    public String noHystrix(){
        return hystrixServer.noHystrix();
    }

}
