package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: LinksDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "LinksDTO")
public class LinksDTO {

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String team;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String updateTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String priority;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String logo;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String createTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String description;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String url;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String id;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String name;


}
