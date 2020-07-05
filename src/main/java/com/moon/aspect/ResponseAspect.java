package com.moon.aspect;

import com.github.pagehelper.PageInfo;
import com.moon.model.SimpleResponse;
import com.moon.model.enums.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述: 统一返回处理
 * 创建人: 小月
 * 创建时间: 2020-06-25 17:02
 */
@Aspect
@Component
@Slf4j
@Order(1)
public class ResponseAspect {

    @Around("execution(* com.moon.controller.*.*.*(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = pjp.proceed();
        Object data;
        Integer total = null;
        Integer size = null;
        //转换
        if (proceed instanceof PageInfo) {
            long t = ((PageInfo) proceed).getTotal();
            total = ((Long) t).intValue();
            size = ((PageInfo) proceed).getSize();
            List list = ((PageInfo) proceed).getList();
            data = list;
        } else {
            data = proceed;
        }

        SimpleResponse simpleResponse = new SimpleResponse(ResponseEnum.OK.code, ResponseEnum.OK.msg, total, size, data);
        return simpleResponse;
    }

}
