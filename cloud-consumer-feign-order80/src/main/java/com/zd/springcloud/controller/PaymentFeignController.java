package com.zd.springcloud.controller;

import com.zd.springcloud.service.PaymentFeignService;
import com.zd.springclould.entities.CommonResult;
import com.zd.springclould.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-07-30 09:38
 * @description:
 **/
@RestController
@Slf4j
public class PaymentFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> paymentById = paymentFeignService.getPaymentById(id);
        return  paymentById;
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-- ribbon 客户端一般等待1秒钟

        return paymentFeignService.paymentFeignTimeout();
    }

}
