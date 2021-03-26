package com.wjf.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients   //开启OpenFegin
@EnableEurekaClient
public class OrderFeginMain80 {

    public static void main(String[] args){
        SpringApplication.run(OrderFeginMain80.class,args);
    }
}
