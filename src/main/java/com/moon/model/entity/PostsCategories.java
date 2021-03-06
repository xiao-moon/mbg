package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: PostsCategories
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostsCategories implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 文章分类ID
     */
    private Integer categoryId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 文章ID
     */
    private Integer postId;

    /**
     * 更新时间
     */
    private Date updateTime;












}
