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
import java.sql.Time;
import java.util.Date;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;

/**
 * 描述: CommentsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class CommentsDO implements Serializable {

    /**
     * 允许通知:0允许;1不允许
     */
    @Column(name ="allow_notification")
    private Long allowNotification;

    /**
     * 评价人
     */
    @Column(name ="author")
    private String author;

    /**
     * 评价人个人站点URL
     */
    @Column(name ="author_url")
    private String authorUrl;

    /**
     * 评价内容
     */
    @Column(name ="content")
    private String content;

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    @Column(name ="del_flag")
    private Long delFlag;

    /**
     * email
     */
    @Column(name ="email")
    private String email;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * ip地址
     */
    @Column(name ="ip_address")
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    @Column(name ="is_admin")
    private Long isAdmin;

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
     * 回复给的人的ID
     */
    @Column(name ="response_id")
    private Long responseId;

    /**
     * 置顶,值越小越靠前
     */
    @Column(name ="top_priority")
    private Long topPriority;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Date updateTime;

    /**
     * 浏览器信息
     */
    @Column(name ="user_agent")
    private String userAgent;


}
