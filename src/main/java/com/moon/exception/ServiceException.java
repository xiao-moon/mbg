package com.moon.exception;

/**
 * 描述: Service层异常
 * 创建人: 小月
 * 创建时间: 2020-06-15 20:26
 */
public class ServiceException extends RuntimeException {


    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}