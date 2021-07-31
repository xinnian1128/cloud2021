package com.zd.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: ZD
 * @create: 2021-07-30 17:07
 * @description：TODO
 **/

@Component
public  class PaymentFallbackService implements  PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
