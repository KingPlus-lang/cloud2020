package com.wjf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //还需在主启动类中添加@RibbonClient，来告诉主启动类使用哪一个
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();  //定义为随机
    }
}
