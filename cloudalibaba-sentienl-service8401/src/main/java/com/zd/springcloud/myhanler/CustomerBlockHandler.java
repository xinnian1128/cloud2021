package com.zd.springcloud.myhanler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zd.springclould.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @author: ZD
 * @create: 2021-08-03 15:23
 * @description：TODO
 **/

@Component
public class CustomerBlockHandler {
    public static CommonResult hanlerException(BlockException exception){
        return  new CommonResult(404,"按客户自定义,global---1");
    }
    public static CommonResult hanlerException2(BlockException exception){
        return  new CommonResult(404,"按客户自定义,global----2");
    }
}
