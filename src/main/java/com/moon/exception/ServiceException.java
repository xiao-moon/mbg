package com.moon.exception;

/**
 * 描述: Service层异常
 * 创建人: 小月
 * 创建时间: 2020-06-15 20:26
 */
public class ServiceException extends RuntimeException {

    private Object msg;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}