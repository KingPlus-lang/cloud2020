package com.wjf.springcloud.service;

import com.wjf.springcloud.entities.CommonResult;
import com.wjf.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //作为feign使用的接口,value值指示寻找哪一个微服务
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/fegin/timeout")
    public String paymentFeginTimeout();
}
