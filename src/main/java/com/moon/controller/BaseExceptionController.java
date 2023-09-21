package com.moon.controller;

import com.moon.model.SimpleResponse;
import com.moon.model.enums.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

/**
 * 描述: 全局异常处理
 * 创建人: 小月
 * 创建时间: 2020-06-24 19:40
 */
@Slf4j
public class BaseExceptionController {

    @ExceptionHandler(Exception.class)
    public Object defaultErrorHandler(HttpServletRequest request, Exception e) {
        String path = request.getServletPath();
        log.error("Exception,path:{}", path, e);
        return SimpleResponse.fail(ResponseEnum.ERROR.code, ResponseEnum.ERROR.msg);
    }

    /**
     * 405
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Object httpRequestMethodNotSupportedExceptionHandler(HttpServletRequest request, Exception e) {
        String path = request.getServletPath();
        log.error("MethodArgumentNotValidException,path:{}", path, e);
        return SimpleResponse.fail(ResponseEnum.METHOD_NOT_ALLOWED.code, ResponseEnum.METHOD_NOT_ALLOWED.msg);
    }

    /**
     * 404
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Object noHandlerFoundExceptionHandler(HttpServletRequest request, NoHandlerFoundException e) {
        String path = request.getServletPath();
        log.error("NoHandlerFoundException,path:{}", path, e);
        return SimpleResponse.fail(ResponseEnum.NOT_FOUND.code, ResponseEnum.NOT_FOUND.msg);
    }

    /**
     * 校验参数异常 ValidationUtils
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public SimpleResponse<String> exception(HttpServletRequest request,
                                            ConstraintViolationException e) {
        String path = request.getServletPath();
        log.error("ConstraintViolationException,path:{}", path, e);
        return SimpleResponse.fail(e.getMessage());
    }

    /**
     * 校验参数异常 ValidationUtils
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public SimpleResponse<String> exception(HttpServletRequest request,
                                            MethodArgumentNotValidException e) {
        String path = request.getServletPath();
        log.error("MethodArgumentNotValidException,path:{}", path, e);
        return SimpleResponse.fail(e.getMessage());
    }

}
