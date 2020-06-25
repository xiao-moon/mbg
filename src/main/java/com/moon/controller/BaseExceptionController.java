package com.moon.controller;

import com.moon.model.SimpleResponse;
import com.moon.model.enums.ResponseEnum;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 描述: 全局异常处理
 * 创建人: 小月
 * 创建时间: 2020-06-24 19:40
 */
public class BaseExceptionController {

    @ExceptionHandler(Exception.class)
    public Object defaultErrorHandler(Exception e) {
        e.printStackTrace();
        return new SimpleResponse(ResponseEnum.INTERNAL_SERVER_ERROR.code, ResponseEnum.INTERNAL_SERVER_ERROR.msg, e.getMessage(), ResponseEnum.INTERNAL_SERVER_ERROR.desc);
    }

    /**
     * 405
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Object httpRequestMethodNotSupportedExceptionHandler(Exception e) {
        return new SimpleResponse(ResponseEnum.METHOD_NOT_ALLOWED.code, ResponseEnum.METHOD_NOT_ALLOWED.msg, e.getMessage(), ResponseEnum.METHOD_NOT_ALLOWED.desc);
    }

    /**
     * 404
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Object noHandlerFoundExceptionHandler(Exception e) {
        return new SimpleResponse(ResponseEnum.NOT_FOUND.code, ResponseEnum.NOT_FOUND.msg, e.getMessage(), ResponseEnum.NOT_FOUND.desc);
    }

}
