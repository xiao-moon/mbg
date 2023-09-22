package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 菜单文章关联表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("菜单文章关联表")
public class PostCategory {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 文章分类ID
     */
    @ApiModelProperty("文章分类ID")
    private Integer categoryId;

    /**
     * 文章ID
     */
    @ApiModelProperty("文章ID")
    private Integer postId;

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
