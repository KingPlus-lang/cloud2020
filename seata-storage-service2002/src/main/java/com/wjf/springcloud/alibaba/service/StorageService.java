package com.wjf.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface StorageService {
    /**
     * @author KingPlus
     * @date 2021/3/25  16:55
 * @param productId
 * @param count
     */
    //扣减库存
    void decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
