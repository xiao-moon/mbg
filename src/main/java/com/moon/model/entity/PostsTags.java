package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: PostsTags
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostsTags implements Serializable{

    private static final long serialVersionUID = 1L;

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
     * 排序，数值越小位置越靠前，0表示不排序
     */
    private Integer priority;

    /**
     * 标签ID
     */
    private Integer tagId;

    /**
     * 更新时间
     */
    private Date updateTime;














}
