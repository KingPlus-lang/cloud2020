package com.wjf.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced //开启负载均衡功能  ,如果注释掉则使用自己的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//applicationContext.xml  <bean id="" class="">