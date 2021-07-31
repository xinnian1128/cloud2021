package com.zd.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-07-28 15:35
 * @description:
 **/
@RestController
@Slf4j
public class ComsumerController {
    public static final String INVOKE_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value ="/consumer/consul" )
    public String paymentInfo(){
        String result= restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
