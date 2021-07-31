package com.zd.springclould.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: ZD
 * @create: 2021-07-27 09:48
 * @description: Payment实体
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    private  Long id;
    private String  serial;
}
