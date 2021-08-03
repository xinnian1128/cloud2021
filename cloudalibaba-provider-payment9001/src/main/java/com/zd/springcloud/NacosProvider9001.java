package com.zd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZD
 * @create: 2021-08-02 11:23
 * @description：TODO
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class,args);
    }
}
