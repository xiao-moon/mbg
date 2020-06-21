package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: LogsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "LogsDTO")
public class LogsDTO {

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String createTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String ipAddress;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String updateTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String type;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String logKey;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String content;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String id;


}
