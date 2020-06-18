package com.moon.model.enums;

/**
 * 描述: 返回值常亮
 * 创建人: 小月
 * 创建时间: 2020-06-15 21:20
 */
public enum ResponseEnum {
    SUCCESS(0,"SUCCESS","成功"),
    FAIL(1,"FAIL","失败");

    private Integer code;
    private String msg;
    private String desc;

    ResponseEnum() {
    }

    ResponseEnum(Integer code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
