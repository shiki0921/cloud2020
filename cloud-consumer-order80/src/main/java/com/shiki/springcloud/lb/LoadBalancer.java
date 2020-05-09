package com.shiki.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author shiki
 * @title:
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/5/10 0:04
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
