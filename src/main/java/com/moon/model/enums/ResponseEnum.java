package com.moon.model.enums;

/**
 * 描述: 返回值常亮
 * 创建人: 小月
 * 创建时间: 2020-06-15 21:20
 */
public enum ResponseEnum {
    OK(0,"SUCCESS","成功"),
    FOUND(302,"Moved Temporarily","对象已移动"),
    BAD_REQUEST(400,"Bad Request","错误的请求"),
    UNAUTHORIZED(401,"Unauthorized","访问被拒绝"),
    FORBIDDEN(403,"Forbidden","禁止访问"),
    NOT_FOUND(404,"Not Found","404 NOT FOUND"),
    METHOD_NOT_ALLOWED(405,"Method Not Allowed","请使用正确的请求方式"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error","服务器内部错误"),
    ERROR(1,"系统异常,请稍后重试","系统异常,请稍后重试");


    public Integer code;
    public String msg;
    public String desc;

    ResponseEnum() {
    }

    ResponseEnum(Integer code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }
}
