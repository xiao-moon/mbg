package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PostCategoriesVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("PostCategories")
public class PostCategoriesVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 文章分类ID
    */
    @ApiModelProperty("文章分类ID")
    private String categoriesId;

    /**
    * 文章ID
    */
    @ApiModelProperty("文章ID")
    private String postId;

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
