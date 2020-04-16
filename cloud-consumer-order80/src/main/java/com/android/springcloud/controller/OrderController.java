package com.android.springcloud.controller;


import com.android.springcloud.entities.CommontResult;
import com.android.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
//负责消费8001端口


@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("consumer/payment/create")
    public CommontResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommontResult.class);
    }

    @GetMapping("consumer/payment/get/{id}")
    public CommontResult<Payment> getPayment(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommontResult.class);
    }

    @GetMapping("consumer/DiscvoeryClient")
    public Object getDiscovery(){
        List<String> services = discoveryClient.getServices();
        for (String service: services) {
            log.info(service);
        }
        List<ServiceInstance>instnces = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instnce: instnces) {
            log.info("Host:"+instnce.getHost()+"ID:"+instnce.getInstanceId()+"Port:"+instnce.getPort()+"URL:"+instnce.getUri());
        }
        return this.discoveryClient;
    }


}
