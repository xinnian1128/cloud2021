package com.zd.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author: ZD
 * @create: 2021-08-03 20:46
 * @description：TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long prodectId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
