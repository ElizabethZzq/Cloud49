package com.android.springcloud.controller;

import com.android.springcloud.entities.CommontResult;
import com.android.springcloud.entities.Payment;
import com.android.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommontResult crtate(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******结果:"+result);
        if (result>0){
            return new CommontResult(200,"成功",result);
        }else {
            return new CommontResult(400,"失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommontResult crtate(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        log.info("*******结果:"+payment);
        if (payment != null){
            return new CommontResult(200,"成功",payment);
        }else {
            return new CommontResult(400,"失败",null);
        }
    }

}
