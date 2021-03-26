package com.wjf.springcloud.alibaba.dao;

import com.wjf.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    //1、新建订单
    void create(Order order);
    //2、修改订单状态，从零该1
    void update (@Param("userId") Long userId,@Param("stauts") Integer stauts);
}
