package com.zd.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ZD
 * @create: 2021-08-03 22:07
 * @description：TODO
 **/
@Configuration
@MapperScan("com.zd.springcloud.dao")
public class MyBatisConfig {
}
