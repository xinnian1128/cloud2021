package com.zd.springcloud.service.Impl;


import com.zd.springcloud.dao.PaymentDao8004;
import com.zd.springcloud.service.PaymentService;
import com.zd.springclould.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-07-28 08:53
 * @description:
 **/
@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao8004 paymentDao8004;


    public int create(Payment payment) {
        return paymentDao8004.create(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentDao8004.getPaymentById(id);
    }
}
