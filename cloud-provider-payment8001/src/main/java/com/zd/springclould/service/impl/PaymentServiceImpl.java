package com.zd.springclould.service.impl;

import com.zd.springclould.dao.PaymentDao;
import com.zd.springclould.entities.Payment;
import com.zd.springclould.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private  PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
