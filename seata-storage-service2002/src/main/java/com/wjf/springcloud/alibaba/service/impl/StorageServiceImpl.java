package com.wjf.springcloud.alibaba.service.impl;

import com.wjf.springcloud.alibaba.dao.StorageDao;
import com.wjf.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KingPlus
 * @date 2021年03月25日  16:55
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------>storage-service中扣减库存开始");
        int result = storageDao.decrease(productId, count);
        System.out.println("result="+result);
        LOGGER.info("------>storage-service中扣减库存结束");
    }
}
