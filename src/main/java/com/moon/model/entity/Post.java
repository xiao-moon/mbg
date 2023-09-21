package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 文章表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("文章表")
public class Post {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

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
     * 缩略展示最多70文字
     */
    @ApiModelProperty("缩略展示最多70文字")
    private String showContent;

    /**
     * 点赞数量
     */
    @ApiModelProperty("点赞数量")
    private Integer likes;

    /**
     * 排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private Integer priority;

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
     * 导出文章顺序,按照从小到大排序
     */
    @ApiModelProperty("导出文章顺序,按照从小到大排序")
    private Integer exportPriority;

    /**
     * 访客数量
     */
    @ApiModelProperty("访客数量")
    private Integer visits;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    @ApiModelProperty("是否置顶:0不置顶;1置顶")
    private Integer topFlag;

    /**
     * 置顶位置排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("置顶位置排序，数值越大位置越靠前，0表示不排序")
    private Integer topPriority;

    /**
     * 编辑类型:0markdown;1富文本
     */
    @ApiModelProperty("编辑类型:0markdown;1富文本")
    private Integer editorType;

    /**
     * 不允许评论:0允许;1不允许
     */
    @ApiModelProperty("不允许评论:0允许;1不允许")
    private Integer disallowComment;

    /**
     * 状态:0正常;1草稿,2停用
     */
    @ApiModelProperty("状态:0正常;1草稿,2停用")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private Integer delFlag;

    /**
     * 首次编辑时间
     */
    @ApiModelProperty("首次编辑时间")
    private LocalDateTime editTime;

    /**
     * 创建发布时间
     */
    @ApiModelProperty("创建发布时间")
    private LocalDateTime createTime;

    /**
     * 最近一次更新修改时间
     */
    @ApiModelProperty("最近一次更新修改时间")
    private LocalDateTime updateTime;
























}
