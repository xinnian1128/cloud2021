package com.zd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZD
 * @create: 2021-07-28 15:18
 * @description:
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderConsulMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulMain8006.class,args);
    }
}
