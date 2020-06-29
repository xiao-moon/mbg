package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: PostTags
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostTags implements Serializable{

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
     * 标签排序,越小排序位置越靠前
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
