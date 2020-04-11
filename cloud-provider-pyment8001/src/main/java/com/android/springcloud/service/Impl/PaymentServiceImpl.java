package com.android.springcloud.service.Impl;

import com.android.springcloud.entities.Payment;
import com.android.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;


    public int create(Payment payment){
        return paymentMapper.insert(payment);
    }
    public Payment getPayment(Long id){
        return paymentMapper.selectByPrimaryKey(id);
    }

}
