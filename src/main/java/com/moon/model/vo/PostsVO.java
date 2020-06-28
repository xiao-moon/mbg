package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PostsVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Posts")
public class PostsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 格式化后的文章
    */
    @ApiModelProperty("格式化后的文章")
    private String formatContent;

    /**
    * 原始的文章
    */
    @ApiModelProperty("原始的文章")
    private String originalContent;

    /**
    * 点赞数量
    */
    @ApiModelProperty("点赞数量")
    private String likes;

    /**
    * SEO优化:meta_description
    */
    @ApiModelProperty("SEO优化:meta_description")
    private String metaDescription;

    /**
    * SEO优化:meta_keywords
    */
    @ApiModelProperty("SEO优化:meta_keywords")
    private String metaKeywords;

    /**
    * 文章加密密码
    */
    @ApiModelProperty("文章加密密码")
    private String password;

    /**
    * SEO优化:文章标题
    */
    @ApiModelProperty("SEO优化:文章标题")
    private String title;

    /**
    * 导出文章标题
    */
    @ApiModelProperty("导出文章标题")
    private String exportTitle;

    /**
    * 导出文章顺序
    */
    @ApiModelProperty("导出文章顺序")
    private String exportPriority;

    /**
    * 访客数量
    */
    @ApiModelProperty("访客数量")
    private String visits;

    /**
    * 是否置顶:0不置顶;1置顶
    */
    @ApiModelProperty("是否置顶:0不置顶;1置顶")
    private String topFlag;

    /**
    * 置顶位置编号:越小排序位置越靠前
    */
    @ApiModelProperty("置顶位置编号:越小排序位置越靠前")
    private String topPriority;

    /**
    * 编辑类型:0markdown;1富文本
    */
    @ApiModelProperty("编辑类型:0markdown;1富文本")
    private String editorType;

    /**
    * 不允许评论:0允许;1不允许
    */
    @ApiModelProperty("不允许评论:0允许;1不允许")
    private String disallowComment;

    /**
    * 状态:0正常;1草稿,2停用
    */
    @ApiModelProperty("状态:0正常;1草稿,2停用")
    private String status;

    /**
    * 删除标志:0正常;1删除
    */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
    * 首次编辑时间
    */
    @ApiModelProperty("首次编辑时间")
    private String editTime;

    /**
    * 创建发布时间
    */
    @ApiModelProperty("创建发布时间")
    private String createTime;

    /**
    * 最近一次更新修改时间
    */
    @ApiModelProperty("最近一次更新修改时间")
    private String updateTime;





















}
