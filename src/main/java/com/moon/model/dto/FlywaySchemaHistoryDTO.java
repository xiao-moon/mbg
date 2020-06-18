package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: FlywaySchemaHistoryDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "FlywaySchemaHistoryDTO")
public class FlywaySchemaHistoryDTO {

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String installedRank;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String version;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String description;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String type;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String script;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String checksum;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String installedBy;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String installedOn;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String executionTime;

    /**
     * 
     */
    @ApiModelProperty(value = "")
    private String success;


}
