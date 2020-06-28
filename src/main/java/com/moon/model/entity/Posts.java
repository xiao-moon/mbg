package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;
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
@TableName("posts")
public class Posts implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 格式化后的文章
     */
    @TableField("format_content")
    private String formatContent;

    /**
     * 原始的文章
     */
    @TableField("original_content")
    private String originalContent;

    /**
     * 点赞数量
     */
    @TableField("likes")
    private Integer likes;

    /**
     * SEO优化:meta_description
     */
    @TableField("meta_description")
    private String metaDescription;

    /**
     * SEO优化:meta_keywords
     */
    @TableField("meta_keywords")
    private String metaKeywords;

    /**
     * 文章加密密码
     */
    @TableField("password")
    private String password;

    /**
     * SEO优化:文章标题
     */
    @TableField("title")
    private String title;

    /**
     * 导出文章标题
     */
    @TableField("export_title")
    private String exportTitle;

    /**
     * 导出文章顺序
     */
    @TableField("export_priority")
    private Integer exportPriority;

    /**
     * 访客数量
     */
    @TableField("visits")
    private Integer visits;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    @TableField("top_flag")
    private Integer topFlag;

    /**
     * 置顶位置编号:越小排序位置越靠前
     */
    @TableField("top_priority")
    private Integer topPriority;

    /**
     * 编辑类型:0markdown;1富文本
     */
    @TableField("editor_type")
    private Integer editorType;

    /**
     * 不允许评论:0允许;1不允许
     */
    @TableField("disallow_comment")
    private Integer disallowComment;

    /**
     * 状态:0正常;1草稿,2停用
     */
    @TableField("status")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * 首次编辑时间
     */
    @TableField("edit_time")
    private Date editTime;

    /**
     * 创建发布时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 最近一次更新修改时间
     */
    @TableField("update_time")
    private Date updateTime;










































}
