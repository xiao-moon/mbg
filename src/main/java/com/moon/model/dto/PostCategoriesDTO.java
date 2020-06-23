package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: PostCategoriesDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "PostCategoriesDTO")
public class PostCategoriesDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 文章分类ID
     */
    @ApiModelProperty(value = "文章分类ID")
    private String categoriesId;

    /**
     * 文章ID
     */
    @ApiModelProperty(value = "文章ID")
    private String postId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;


}
