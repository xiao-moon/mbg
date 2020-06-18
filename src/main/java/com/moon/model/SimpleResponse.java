package com.moon.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述: 返回值
 * 创建人: 小月
 * 创建时间: 2020-06-15 01:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("响应模型")
public class SimpleResponse {
    //返回码
    @ApiModelProperty("返回码")
    private Integer retCode;
    //返回码注释
    @ApiModelProperty("返回码注释")
    private String retMsg;
    //返回体
    @ApiModelProperty("返回体")
    private Object content;

}
