package com.zd.springclould.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: ZD
 * @create: 2021-07-30 08:22
 * @description:
 **/

public interface LoadBalance {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
