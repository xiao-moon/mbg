package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;

import java.io.Serializable;

/**
* 描述:
* 创建人: 小月
* 创建时间: 2020-06-28 20:59:24
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("flyway_schema_history")
public class FlywaySchemaHistory implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableField("installed_rank")
    private Integer installedRank;

    /**
     * 
     */
    @TableField("version")
    private String version;

    /**
     * 
     */
    @TableField("description")
    private String description;

    /**
     * 
     */
    @TableField("type")
    private String type;

    /**
     * 
     */
    @TableField("script")
    private String script;

    /**
     * 
     */
    @TableField("checksum")
    private Integer checksum;

    /**
     * 
     */
    @TableField("installed_by")
    private String installedBy;

    /**
     * 
     */
    @TableField("installed_on")
    private Date installedOn;

    /**
     * 
     */
    @TableField("execution_time")
    private Integer executionTime;

    /**
     * 
     */
    @TableField("success")
    private Integer success;






















}
