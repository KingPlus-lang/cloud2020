package com.wjf.springcloud.alibaba.controller;

import com.wjf.springcloud.alibaba.domain.CommonResult;
import com.wjf.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author KingPlus
 * @date 2021年03月25日  17:02
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long prodectId,@RequestParam("count") Integer count){
        storageService.decrease(prodectId,count);
        return new CommonResult(200,"扣减库存成功!");
    }
}
