package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PostTagsVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("PostTags")
public class PostTagsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 文章ID
    */
    @ApiModelProperty("文章ID")
    private String postId;

    /**
    * 标签ID
    */
    @ApiModelProperty("标签ID")
    private String tagId;

    /**
    * 标签排序,越小排序位置越靠前
    */
    @ApiModelProperty("标签排序,越小排序位置越靠前")
    private String priority;

    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;







}
