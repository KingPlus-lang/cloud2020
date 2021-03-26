package com.wjf.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author KingPlus
 * @date 2021年03月25日  17:01
 */
@Configuration
@MapperScan({"com.wjf.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
