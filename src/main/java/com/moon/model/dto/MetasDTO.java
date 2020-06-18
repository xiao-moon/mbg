package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: MetasDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "MetasDTO")
public class MetasDTO {

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String id;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String metaKey;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String type;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String postId;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String createTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String metaValue;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String updateTime;


}
