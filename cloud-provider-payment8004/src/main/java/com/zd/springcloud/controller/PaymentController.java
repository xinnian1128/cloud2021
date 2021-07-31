package com.zd.springcloud.controller;

import com.zd.springcloud.service.PaymentService;
import com.zd.springclould.entities.CommonResult;
import com.zd.springclould.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author: ZD
 * @create: 2021-07-28 08:52
 * @description:
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入成功--" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功serverPort:"+serverPort, result);
        } else {
            return new CommonResult(404, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(  @PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询成功" + payment);
        if (payment !=null) {
            return new CommonResult(200, "查询数据库成功serverPort"+serverPort, payment);
        } else {
            return new CommonResult(404, "查询数据库失败", null);
        }
    }

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
