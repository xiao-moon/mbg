package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PostsCategoriesVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("PostsCategories")
public class PostsCategoriesVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 文章分类ID
    */
    @ApiModelProperty("文章分类ID")
    private String categoryId;

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
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;






}
