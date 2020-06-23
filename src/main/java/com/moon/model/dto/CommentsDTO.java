package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: CommentsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "CommentsDTO")
public class CommentsDTO {

    /**
     * ID
     */
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    private String parentId;

    /**
     * 回复给的人的ID
     */
    @ApiModelProperty(value = "回复给的人的ID")
    private String responseId;

    /**
     * 评价人
     */
    @ApiModelProperty(value = "评价人")
    private String author;

    /**
     * 评价人个人站点URL
     */
    @ApiModelProperty(value = "评价人个人站点URL")
    private String authorUrl;

    /**
     * 评价内容
     */
    @ApiModelProperty(value = "评价内容")
    private String content;

    /**
     * email
     */
    @ApiModelProperty(value = "email")
    private String email;

    /**
     * ip地址
     */
    @ApiModelProperty(value = "ip地址")
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    @ApiModelProperty(value = "是否管理员:0是;1不是")
    private String isAdmin;

    /**
     * 文章ID
     */
    @ApiModelProperty(value = "文章ID")
    private String postId;

    /**
     * 置顶,值越小越靠前
     */
    @ApiModelProperty(value = "置顶,值越小越靠前")
    private String topPriority;

    /**
     * 浏览器信息
     */
    @ApiModelProperty(value = "浏览器信息")
    private String userAgent;

    /**
     * 允许通知:0允许;1不允许
     */
    @ApiModelProperty(value = "允许通知:0允许;1不允许")
    private String allowNotification;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty(value = "删除标志:0正常;1删除")
    private String delFlag;

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


}
