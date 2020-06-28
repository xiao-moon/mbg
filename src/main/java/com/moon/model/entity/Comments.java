package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述:
* 创建人: 小月
* 创建时间: 2020-06-28 20:59:24
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("comments")
public class Comments implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 父ID
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * 回复给的人的ID
     */
    @TableField("response_id")
    private Integer responseId;

    /**
     * 评价人
     */
    @TableField("author")
    private String author;

    /**
     * 评价人个人站点URL
     */
    @TableField("author_url")
    private String authorUrl;

    /**
     * 评价内容
     */
    @TableField("content")
    private String content;

    /**
     * email
     */
    @TableField("email")
    private String email;

    /**
     * ip地址
     */
    @TableField("ip_address")
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    @TableField("is_admin")
    private Integer isAdmin;

    /**
     * 文章ID
     */
    @TableField("post_id")
    private Integer postId;

    /**
     * 置顶,值越小越靠前
     */
    @TableField("top_priority")
    private Integer topPriority;

    /**
     * 浏览器信息
     */
    @TableField("user_agent")
    private String userAgent;

    /**
     * 允许通知:0允许;1不允许
     */
    @TableField("allow_notification")
    private Integer allowNotification;

    /**
     * 删除标志:0正常;1删除
     */
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


































}
