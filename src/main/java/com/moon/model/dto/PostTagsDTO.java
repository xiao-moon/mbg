package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: PostTagsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "PostTagsDTO")
public class PostTagsDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

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

    /**
     * 文章ID
     */
    @ApiModelProperty(value = "文章ID")
    private String postId;

    /**
     * 标签ID
     */
    @ApiModelProperty(value = "标签ID")
    private String tagId;


}
