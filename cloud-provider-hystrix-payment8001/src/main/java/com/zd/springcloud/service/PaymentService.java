package com.zd.springcloud.service;

/**
 * @author: ZD
 * @create: 2021-07-30 11:10
 * @description:
 **/
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
