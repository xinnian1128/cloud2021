package com.zd.springclould.dao;

import com.zd.springclould.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ZD
 * @create: 2021-07-27 09:59
 * @description: PaymentDao
 **/


@Mapper
public interface PaymentDao {

    //增删改查
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);

}
