package com.zd.springcloud.dao;

import com.zd.springclould.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ZD
 * @create: 2021-07-28 08:52
 * @description:
 **/
@Mapper
public interface PaymentDao8004 {
    //增删改查
    public Payment getPaymentById(@Param("id") long id);
    public int create(Payment payment);
}
