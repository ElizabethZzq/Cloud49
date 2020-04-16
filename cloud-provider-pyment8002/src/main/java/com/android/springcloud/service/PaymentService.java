package com.android.springcloud.service;

import com.android.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPayment(@Param("id") Long id);
}
