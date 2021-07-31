package com.zd.springclould.service;

import com.zd.springclould.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author: ZD
 * @create: 2021-07-27 10:18
 * @description:
 **/

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
