package com.wjf.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    //获取在服务注册中心存活的服务
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
