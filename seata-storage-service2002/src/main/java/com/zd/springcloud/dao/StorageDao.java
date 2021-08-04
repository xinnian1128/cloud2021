package com.zd.springcloud.dao;

/**
 * @author: ZD
 * @create: 2021-08-04 09:32
 * @description：TODO
 **/

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
