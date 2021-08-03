package com.zd.springcloud.controller;

import com.zd.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-08-01 16:17
 * @description：TODO
 **/

@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider iMessageProvider;


    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }

}
