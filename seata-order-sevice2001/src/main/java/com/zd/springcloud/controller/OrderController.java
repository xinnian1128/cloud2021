package com.zd.springcloud.controller;

import com.zd.springcloud.domain.CommonResult;
import com.zd.springcloud.domain.Order;
import com.zd.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-08-03 21:13
 * @description：TODO
 **/
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return  new CommonResult(200,"订单创建成功");
    }
}
