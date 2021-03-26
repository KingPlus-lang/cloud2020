package com.wjf.springcloud.alibaba.service.impl;

import com.wjf.springcloud.alibaba.dao.AccountDao;
import com.wjf.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author KingPlus
 * @date 2021年03月25日  17:25
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------>account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        try{
            TimeUnit.SECONDS.sleep(20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //暂停几秒中线程

        accountDao.decrease(userId,money);
        LOGGER.info("------>account-service中扣减账户余额结束");

    }
}
