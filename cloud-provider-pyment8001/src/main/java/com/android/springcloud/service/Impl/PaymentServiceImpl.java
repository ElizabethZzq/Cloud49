package com.android.springcloud.service.Impl;

import com.android.springcloud.dao.PaymentExample;
import com.android.springcloud.entities.Payment;
import com.android.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private Payment paymentExample;


    public int create(Payment payment){
        return paymentExample.createCriteria()
    }
    public Payment getPayment(Long id){
        return paymentDao.getPayment(id);
    }

}
