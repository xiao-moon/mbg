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
@TableName("journals")
public class Journals implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

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

    /**
     * 点赞数量
     */
    @TableField("likes")
    private Integer likes;












}
