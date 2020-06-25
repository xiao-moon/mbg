package com.moon.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述: 记录日志
 * 创建人: 小月
 * 创建时间: 2020-06-25 22:10
 */
@Aspect
@Component
@Slf4j
@Order(0)
public class LogAspect {
    @Pointcut("execution(* com.moon.controller.*.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint jp) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info(request.getRequestURL() + ":请求开始执行...");
        log.info("请求的URL:{}", request.getRequestURL().toString());
        log.info("请求的方式:{}", request.getMethod());
        log.info("请求的IP:{}", request.getRemoteAddr());
        log.info("请求的参数:{}", jp.getArgs());
        Signature signature = jp.getSignature();
        String methodName = signature.getName();
        Object target = jp.getTarget();
        String clazzName = target.getClass().getName();
        log.info("执行的方法:{}", clazzName + "." + methodName);
    }

    @AfterReturning(returning = "ret", pointcut = "pointcut()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        log.info("返回的数据:{}", ret);
    }

    //后置异常通知
    @AfterThrowing(throwing = "ex", pointcut = "pointcut()")
    public void throwss(JoinPoint jp, Exception ex) {
        log.error("错误信息:", ex);
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("pointcut()")
    public void after(JoinPoint jp) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info(request.getRequestURL() + ":请求执行完毕...");
    }

}
