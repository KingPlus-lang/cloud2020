package com.wjf.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author KingPlus
 * @date 2021/3/25  17:23
 */
public interface AccountService {

    void decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
