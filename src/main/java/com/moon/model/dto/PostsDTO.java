package com.moon.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述: PostsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "PostsDTO")
public class PostsDTO {

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String postsId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;

    /**
     * 不允许评论
     */
    @ApiModelProperty(value = "不允许评论")
    private String disallowComment;

    /**
     * 编辑时间
     */
    @ApiModelProperty(value = "编辑时间")
    private String editTime;

    /**
     * 编辑类型
     */
    @ApiModelProperty(value = "编辑类型")
    private String editorType;

    /**
     * 格式化后的文章
     */
    @ApiModelProperty(value = "格式化后的文章")
    private String formatContent;

    /**
     * 喜欢
     */
    @ApiModelProperty(value = "喜欢")
    private String likes;

    /**
     *
     */
    @ApiModelProperty(value = "")
    private String metaDescription;

    /**
     *
     */
    @ApiModelProperty(value = "")
    private String metaKeywords;

    /**
     * 原始的文章
     */
    @ApiModelProperty(value = "原始的文章")
    private String originalContent;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * slug
     */
    @ApiModelProperty(value = "slug")
    private String slug;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * 总结
     */
    @ApiModelProperty(value = "总结")
    private String summary;

    /**
     * 模板
     */
    @ApiModelProperty(value = "模板")
    private String template;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnail;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * top_priority
     */
    @ApiModelProperty(value = "top_priority")
    private String topPriority;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String url;

    /**
     * 访客数量
     */
    @ApiModelProperty(value = "访客数量")
    private String visits;

    /**
     * 图片ID
     */
    @ApiModelProperty(value = "图片ID")
    private String photoId;

    private PhotosDTO photosDTO;


}
