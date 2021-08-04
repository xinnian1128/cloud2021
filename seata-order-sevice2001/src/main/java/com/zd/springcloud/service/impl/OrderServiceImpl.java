package com.zd.springcloud.service.impl;

import com.zd.springcloud.dao.OrderDao;
import com.zd.springcloud.domain.Order;
import com.zd.springcloud.service.AccountService;
import com.zd.springcloud.service.OrderService;
import com.zd.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ZD
 * @create: 2021-08-03 21:13
 * @description：TODO
 **/
@Service
@Slf4j
public  class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    @Override
    public void create(Order order) {
        //新建订单
        log.info("开始新建订单");
        orderDao.create(order);
        //减库存
        log.info("订单微服务调用库存,做扣减数量");
        storageService.decrease(order.getProdectId(),order.getCount());
        log.info("订单微服务调用库存，做扣减数量end");
        //减余额
        log.info("订单微服务调用账户，做扣减金钱");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("订单微服务调用账户，做扣减金钱end");
        //修改订单的状态 从0 到1
        log.info("修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("下订单结束");
    }
}
