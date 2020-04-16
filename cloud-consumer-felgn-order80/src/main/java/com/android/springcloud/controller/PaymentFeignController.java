package com.android.springcloud.controller;

import com.android.springcloud.entities.CommontResult;
import com.android.springcloud.entities.Payment;
import com.android.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "feign/payment/get/{id}")
    public CommontResult<Payment>getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }

    @GetMapping(value = "feign/payment/create")
    public CommontResult crtate(Payment payment){
        return paymentFeignService.crtate(payment);
    }

    @GetMapping(value = "feign/payment/timeout")
    public String FeginTimeoutDemo(){
        return paymentFeignService.FeginTimeoutDemo();
    }
}
