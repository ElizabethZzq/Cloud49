package com.android.springcloud.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "cloud-provider-hystrix-payment")
public interface HystrixServer {

    @GetMapping(value = "hystrix/payment/ok")
    public String okHystrix();

    @GetMapping(value = "hystrix/payment/no")
    public String noHystrix();
}
