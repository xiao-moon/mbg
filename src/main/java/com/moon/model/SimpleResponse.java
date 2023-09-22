package com.moon.model;

import com.moon.model.enums.ResponseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * 描述: 返回值
 * 创建人: 小月
 * 创建时间: 2020-06-15 01:38
 */
@Getter
@Setter
@ApiModel("响应模型")
public class SimpleResponse<T> implements Serializable {
    /**
     * 返回码
     */
    @ApiModelProperty("返回码")
    private Integer code;

    /**
     * 返回码注释
     */
    @ApiModelProperty("返回码注释")
    private String message;

    /**
     * 返回数据
     */
    @ApiModelProperty("返回数据")
    private T data;

    public static <T> SimpleResponse<T> success(T data) {
        SimpleResponse<T> response = new SimpleResponse<>();
        response.setCode(ResponseEnum.OK.code);
        response.setMessage(ResponseEnum.OK.msg);
        response.setData(data);
        return response;
    }

    public static <T> SimpleResponse<T> success() {
        SimpleResponse<T> response = new SimpleResponse<>();
        response.setCode(ResponseEnum.OK.code);
        response.setMessage(ResponseEnum.OK.msg);
        return response;
    }

    public static <T> SimpleResponse<T> fail(Integer code, String message) {
        Assert.notNull(code, "code can not be null");
        SimpleResponse<T> response = new SimpleResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> SimpleResponse<T> fail() {
        SimpleResponse<T> response = new SimpleResponse<>();
        response.setCode(ResponseEnum.ERROR.code);
        response.setMessage(ResponseEnum.ERROR.msg);
        return response;
    }

    public static <T> SimpleResponse<T> fail(String message) {
        SimpleResponse<T> response = new SimpleResponse<>();
        response.setCode(ResponseEnum.ERROR.code);
        response.setMessage(message);
        return response;
    }


}
