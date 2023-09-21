package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 评论表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("评论表")
public class Comment {

    /**
     * ID
     */
    @ApiModelProperty("ID")
    private Integer id;

    /**
     * 父ID
     */
    @ApiModelProperty("父ID")
    private Integer parentId;

    /**
     * 回复给的人的ID
     */
    @ApiModelProperty("回复给的人的ID")
    private Integer responseId;

    /**
     * 评价人
     */
    @ApiModelProperty("评价人")
    private String author;

    /**
     * 评价人个人站点URL
     */
    @ApiModelProperty("评价人个人站点URL")
    private String authorUrl;

    /**
     * 评价内容
     */
    @ApiModelProperty("评价内容")
    private String content;

    /**
     * email
     */
    @ApiModelProperty("email")
    private String email;

    /**
     * ip地址
     */
    @ApiModelProperty("ip地址")
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    @ApiModelProperty("是否管理员:0是;1不是")
    private Integer isAdmin;

    /**
     * 文章ID
     */
    @ApiModelProperty("文章ID")
    private Integer postId;

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
     * 浏览器信息
     */
    @ApiModelProperty("浏览器信息")
    private String userAgent;

    /**
     * 允许通知:0允许;1不允许
     */
    @ApiModelProperty("允许通知:0允许;1不允许")
    private Integer allowNotification;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private Integer delFlag;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;



















}
