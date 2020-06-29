package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: Comments
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 允许通知:0允许;1不允许
     */
    private Integer allowNotification;

    /**
     * 评价人
     */
    private String author;

    /**
     * 评价人个人站点URL
     */
    private String authorUrl;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * email
     */
    private String email;

    /**
     * ID
     */
    private Integer id;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    private Integer isAdmin;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 文章ID
     */
    private Integer postId;

    /**
     * 回复给的人的ID
     */
    private Integer responseId;

    /**
     * 置顶,值越小越靠前
     */
    private Integer topPriority;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 浏览器信息
     */
    private String userAgent;


































}
