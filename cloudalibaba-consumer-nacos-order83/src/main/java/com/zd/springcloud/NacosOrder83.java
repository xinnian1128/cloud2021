package com.zd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZD
 * @create: 2021-08-02 14:50
 * @description：TODO
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class NacosOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrder83.class,args);
    }
}
