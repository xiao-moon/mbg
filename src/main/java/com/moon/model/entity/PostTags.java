package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述:
* 创建人: 小月
* 创建时间: 2020-06-28 20:59:24
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("post_tags")
public class PostTags implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 文章ID
     */
    @TableField("post_id")
    private Integer postId;

    /**
     * 标签ID
     */
    @TableField("tag_id")
    private Integer tagId;

    /**
     * 标签排序,越小排序位置越靠前
     */
    @TableField("priority")
    private Integer priority;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;














}
