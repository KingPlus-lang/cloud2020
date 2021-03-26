package com.wjf.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{tt}")
    public String getPayment(@PathVariable("tt") Integer id){
        return "nacos registry,serverPort: "+ serverPort+"\t id: "+id;
    }
}
