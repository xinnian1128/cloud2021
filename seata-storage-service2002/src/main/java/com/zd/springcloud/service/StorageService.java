package com.zd.springcloud.service;

/**
 * @author: ZD
 * @create: 2021-08-04 09:34
 * @description:
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
