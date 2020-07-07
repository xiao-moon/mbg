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
 * 描述: CommentsVO
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Comments")
public class CommentsVO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 允许通知:0允许;1不允许
     */
    @ApiModelProperty("允许通知:0允许;1不允许")
    private String allowNotification;

    /**
     * 评价人
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("评价人")
    private String author;

    /**
     * 评价人个人站点URL
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("评价人个人站点URL")
    private String authorUrl;

    /**
     * 评价内容
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("评价内容")
    private String content;

    /**
     * 创建时间
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
     * email
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("email")
    private String email;

    /**
     * ID
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("ID")
    private String id;

    /**
     * ip地址
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("ip地址")
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("是否管理员:0是;1不是")
    private String isAdmin;

    /**
     * 父ID
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("父ID")
    private String parentId;

    /**
     * 文章ID
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("文章ID")
    private String postId;

    /**
     * 回复给的人的ID
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("回复给的人的ID")
    private String responseId;


    /**
     * 回复给的人的名称
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("回复给的人的名称")
    private String responseAuthor;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    @ApiModelProperty("是否置顶:0不置顶;1置顶")
    private String topFlag;

    /**
     * 置顶位置排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("置顶位置排序，数值越大位置越靠前，0表示不排序")
    private String topPriority;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
     * 浏览器信息
     */
    @JsonView(SimpleView.CommentsView.class)
    @ApiModelProperty("浏览器信息")
    private String userAgent;

    /**
     * 评价数量
     */
    @JsonView(SimpleView.PostsView.class)
    private String count;

    /**
     * 子评价
     */
    @JsonView(SimpleView.CommentsView.class)
    private List<CommentsVO> subCList;


}
