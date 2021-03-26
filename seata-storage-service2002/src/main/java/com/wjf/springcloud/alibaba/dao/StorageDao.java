package com.wjf.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    //扣减库存
    int decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
