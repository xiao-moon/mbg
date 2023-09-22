package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 标签表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("标签表")
public class Tag {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 标签名称
     */
    @ApiModelProperty("标签名称")
    private String name;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String desc;

    /**
     * 排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private Integer priority;

    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty("状态:0正常;1停用")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private Integer deleted;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;










}
