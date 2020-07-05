package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 描述: PostsVO
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Posts")
public class PostsVO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 创建发布时间
     */
    @JsonView({SimpleView.IndexVIew.class})
    @ApiModelProperty("创建发布时间")
    private String createTime;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
     * 不允许评论:0允许;1不允许
     */
    @ApiModelProperty("不允许评论:0允许;1不允许")
    private String disallowComment;

    /**
     * 首次编辑时间
     */
    @ApiModelProperty("首次编辑时间")
    private String editTime;

    /**
     * 编辑类型:0markdown;1富文本
     */
    @ApiModelProperty("编辑类型:0markdown;1富文本")
    private String editorType;

    /**
     * 导出文章顺序
     */
    @ApiModelProperty("导出文章顺序")
    private String exportPriority;

    /**
     * 导出文章标题
     */
    @ApiModelProperty("导出文章标题")
    private String exportTitle;

    /**
     * 格式化后的文章
     */
    @ApiModelProperty("格式化后的文章")
    private String formatContent;

    /**
     * ID主键自增
     */
    @JsonView({SimpleView.IndexVIew.class})
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
     * 点赞数量
     */
    @JsonView(SimpleView.IndexVIew.class)
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
     * 原始的文章
     */
    @ApiModelProperty("原始的文章")
    private String originalContent;

    /**
     * 文章加密密码
     */
    @ApiModelProperty("文章加密密码")
    private String password;

    /**
     * 排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private String priority;

    /**
     * 缩略展示最多70文字
     */
    @JsonView(SimpleView.IndexVIew.class)
    @ApiModelProperty("缩略展示最多70文字")
    private String showContent;

    /**
     * 状态:0正常;1草稿,2停用
     */
    @ApiModelProperty("状态:0正常;1草稿,2停用")
    private String status;

    /**
     * SEO优化:文章标题
     */
    @JsonView(SimpleView.IndexVIew.class)
    @ApiModelProperty("SEO优化:文章标题")
    private String title;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    @ApiModelProperty("是否置顶:0不置顶;1置顶")
    private String topFlag;

    /**
     * 置顶位置排序，数值越小位置越靠前，0表示不排序
     */
    @ApiModelProperty("置顶位置排序，数值越小位置越靠前，0表示不排序")
    private String topPriority;

    /**
     * 最近一次更新修改时间
     */
    @ApiModelProperty("最近一次更新修改时间")
    private String updateTime;

    /**
     * 访客数量
     */
    @JsonView(SimpleView.IndexVIew.class)
    @ApiModelProperty("访客数量")
    private String visits;

    /**
     * 分类id
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String categoryId;

    /**
     * 分类名称
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String categoryName;

    /**
     * 图片地址
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String attachmentUrl;

    /**
     * 图片名称
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String attachmentName;

    /**
     * 标签id
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String tagId;

    /**
     * 主标签名称
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String tagName;

    /**
     * 月份
     */
    @JsonView(SimpleView.TimeAxisView.class)
    private String monthData;

    /**
     * 按月份进行排序
     */
    @JsonView(SimpleView.TimeAxisView.class)
    private List<SubPostsVO> posts;

    /**
     * 评价表
     */
    @JsonView(SimpleView.IndexVIew.class)
    private String commentCount;
    /**
     * 临时使用
     */
    private Object temp;

}
