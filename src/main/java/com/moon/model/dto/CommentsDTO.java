package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: CommentsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "CommentsDTO")
public class CommentsDTO {

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * ID
     */
    @ApiModelProperty(value = "ID")
    private String id;

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
     * 允许通知
     */
    @ApiModelProperty(value = "允许通知")
    private String allowNotification;

    /**
     * 评价人
     */
    @ApiModelProperty(value = "评价人")
    private String author;

    /**
     * 评价人地址
     */
    @ApiModelProperty(value = "评价人地址")
    private String authorUrl;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String content;

    /**
     * email
     */
    @ApiModelProperty(value = "email")
    private String email;

    /**
     * gravatar_md5
     */
    @ApiModelProperty(value = "gravatar_md5")
    private String gravatarMd5;

    /**
     * ip地址
     */
    @ApiModelProperty(value = "ip地址")
    private String ipAddress;

    /**
     * 是否管理员
     */
    @ApiModelProperty(value = "是否管理员")
    private String isAdmin;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    private String parentId;

    /**
     * 文章ID
     */
    @ApiModelProperty(value = "文章ID")
    private String postId;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * top_priority
     */
    @ApiModelProperty(value = "top_priority")
    private String topPriority;

    /**
     * 浏览器信息
     */
    @ApiModelProperty(value = "浏览器信息")
    private String userAgent;


}
