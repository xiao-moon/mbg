package com.moon.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述: 返回值
 * 创建人: 小月
 * 创建时间: 2020-06-15 01:38
 */
@Data
@NoArgsConstructor
@ApiModel("响应模型")
public class SimpleResponse implements Serializable {
    //返回码
    @JsonView(SimpleView.CommonView.class)
    @ApiModelProperty("返回码")
    private Integer status;

    //返回码注释
    @JsonView(SimpleView.CommonView.class)
    @ApiModelProperty("返回码注释")
    private String message;

    //详解
    @JsonView(SimpleView.CommonView.class)
    @ApiModelProperty("返回信息详解")
    private String details;

    //详解
    @JsonView(SimpleView.CommonView.class)
    @ApiModelProperty("总记录数")
    private Integer total;

    //详解
    @JsonView(SimpleView.CommonView.class)
    @ApiModelProperty("查询结果数")
    private Integer size;

    //返回体
    @JsonView(SimpleView.ReturnDataView.class)
    @ApiModelProperty("返回体")
    private Object data;


    public SimpleResponse(Integer status, String message, String details, Object data) {
        this.status = status;
        this.message = message;
        this.details = details;
        this.data = data;
    }

    public SimpleResponse(Integer status, String message, Integer total, Integer size, Object data) {
        this.status = status;
        this.message = message;
        this.total = total;
        this.size = size;
        this.data = data;
    }
}
