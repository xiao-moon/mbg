package com.moon.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;

/**
 * 描述: CommentsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class CommentsDO implements Serializable {

    /**
     * 类型
     */
    @Column(name ="type")
    private Long type;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Timestamp updateTime;

    /**
     * 允许通知
     */
    @Column(name ="allow_notification")
    private Boolean allowNotification;

    /**
     * 评价人
     */
    @Column(name ="author")
    private String author;

    /**
     * 评价人地址
     */
    @Column(name ="author_url")
    private String authorUrl;

    /**
     * 内容
     */
    @Column(name ="content")
    private String content;

    /**
     * email
     */
    @Column(name ="email")
    private String email;

    /**
     * gravatar_md5
     */
    @Column(name ="gravatar_md5")
    private String gravatarMd5;

    /**
     * ip地址
     */
    @Column(name ="ip_address")
    private String ipAddress;

    /**
     * 是否管理员
     */
    @Column(name ="is_admin")
    private Boolean isAdmin;

    /**
     * 父ID
     */
    @Column(name ="parent_id")
    private Long parentId;

    /**
     * 文章ID
     */
    @Column(name ="post_id")
    private Long postId;

    /**
     * 状态
     */
    @Column(name ="status")
    private Long status;

    /**
     * top_priority
     */
    @Column(name ="top_priority")
    private Long topPriority;

    /**
     * 浏览器信息
     */
    @Column(name ="user_agent")
    private String userAgent;


}
