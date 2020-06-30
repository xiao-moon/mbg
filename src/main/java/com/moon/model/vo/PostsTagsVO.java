package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PostsTagsVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("PostsTags")
public class PostsTagsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

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
    * 排序，数值越大位置越靠前，0表示不排序
    */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private String priority;

    /**
    * 标签ID
    */
    @ApiModelProperty("标签ID")
    private String tagId;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;







}
