package com.moon.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 描述: Posts
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建发布时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * 不允许评论:0允许;1不允许
     */
    private Integer disallowComment;

    /**
     * 首次编辑时间
     */
    private Date editTime;

    /**
     * 编辑类型:0markdown;1富文本
     */
    private Integer editorType;

    /**
     * 导出文章顺序
     */
    private Integer exportPriority;

    /**
     * 导出文章标题
     */
    private String exportTitle;

    /**
     * 格式化后的文章
     */
    private String formatContent;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 点赞数量
     */
    private Integer likes;

    /**
     * SEO优化:meta_description
     */
    private String metaDescription;

    /**
     * SEO优化:meta_keywords
     */
    private String metaKeywords;

    /**
     * 原始的文章
     */
    private String originalContent;

    /**
     * 文章加密密码
     */
    private String password;

    /**
     * 排序，数值越小位置越靠前，0表示不排序
     */
    private Integer priority;

    /**
     * 缩略展示最多70文字
     */
    private String showContent;

    /**
     * 状态:0正常;1草稿,2停用
     */
    private Integer status;

    /**
     * SEO优化:文章标题
     */
    private String title;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    private Integer topFlag;

    /**
     * 置顶位置排序，数值越小位置越靠前，0表示不排序
     */
    private Integer topPriority;

    /**
     * 最近一次更新修改时间
     */
    private Date updateTime;

    /**
     * 访客数量
     */
    private Integer visits;

    /**
     * 关联附件表
     */
    private Attachments attachment;

    /**
     * 关联文章分类表
     */
    private Categories category;

    /**
     * 关联标签表
     */
    private List<Tags> tags;

    /**
     * 关联标签表
     */
    private Tags tag;

    /**
     * 关联评价表
     */
    private Comments comments;

    private Object temp;
}
