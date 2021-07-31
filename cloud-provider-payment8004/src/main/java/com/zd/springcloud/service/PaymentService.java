package com.zd.springcloud.service;

import com.zd.springclould.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ZD
 * @create: 2021-07-28 08:52
 * @description:
 **/

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
