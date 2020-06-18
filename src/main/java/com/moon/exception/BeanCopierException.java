package com.moon.exception;

/**
 * 描述: 领域模型转换异常
 * 创建人: 小月
 * 创建时间: 2020-06-15 01:26
 */
public class BeanCopierException extends RuntimeException{

    private Object msg;

    public BeanCopierException(String message) {
        super(message);
    }

    public BeanCopierException(String message, Throwable cause) {
        super(message, cause);
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
