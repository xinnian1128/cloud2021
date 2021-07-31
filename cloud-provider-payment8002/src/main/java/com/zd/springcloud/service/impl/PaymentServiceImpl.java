package com.zd.springcloud.service.impl;

import com.zd.springcloud.dao.PaymentDao;
import com.zd.springcloud.service.PaymentService;
import com.zd.springclould.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-07-27 10:19
 * @description:
 **/

@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
