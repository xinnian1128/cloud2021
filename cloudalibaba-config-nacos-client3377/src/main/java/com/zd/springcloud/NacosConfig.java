package com.zd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZD
 * @create: 2021-08-02 15:41
 * @description：TODO
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfig {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig.class,args);
    }
}
