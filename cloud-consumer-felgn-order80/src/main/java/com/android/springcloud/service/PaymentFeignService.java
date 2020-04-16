package com.android.springcloud.service;

import com.android.springcloud.entities.CommontResult;
import com.android.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommontResult getPayment(@PathVariable("id") Long id);

    @PostMapping(value = "/payment/create")
    public CommontResult crtate(@RequestBody Payment payment);

    @GetMapping(value = "payment/mentpay/timeout")
    public String FeginTimeoutDemo();
}
