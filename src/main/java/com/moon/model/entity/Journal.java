package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 日记表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("日记表")
public class Journal {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 内容
     */
    @ApiModelProperty("内容")
    private String content;

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

    /**
     * 点赞数量
     */
    @ApiModelProperty("点赞数量")
    private Integer likes;









}
