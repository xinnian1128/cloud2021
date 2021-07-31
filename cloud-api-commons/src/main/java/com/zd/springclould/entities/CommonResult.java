package com.zd.springclould.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZD
 * @create: 2021-07-27 09:55
 * @description: CommonResult
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private  Integer code;
    private  String message;
    private  T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
