package com.wjf.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wjf.springcloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult hanlerException(BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException---1");
    }
    public static CommonResult hanlerException2(BlockException exception){
        return new CommonResult(444,"按客户自定义,global handlerException---2");
    }

}
