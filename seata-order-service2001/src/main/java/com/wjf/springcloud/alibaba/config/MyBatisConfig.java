package com.wjf.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wjf.springcloud.alibaba.dao")
public class MyBatisConfig {
}
