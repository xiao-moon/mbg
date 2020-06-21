package com.moon.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
 * 描述: PostsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class PostsDO implements Serializable {

    /**
     * 类型
     */
    @Column(name ="type")
    private Long type;

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long postsId;

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
     * 不允许评论
     */
    @Column(name ="disallow_comment")
    private Boolean disallowComment;

    /**
     * 编辑时间
     */
    @Column(name ="edit_time")
    private Timestamp editTime;

    /**
     * 编辑类型
     */
    @Column(name ="editor_type")
    private Long editorType;

    /**
     * 格式化后的文章
     */
    @Column(name ="format_content")
    private String formatContent;

    /**
     * 喜欢
     */
    @Column(name ="likes")
    private Long likes;

    /**
     * 
     */
    @Column(name ="meta_description")
    private String metaDescription;

    /**
     * 
     */
    @Column(name ="meta_keywords")
    private String metaKeywords;

    /**
     * 原始的文章
     */
    @Column(name ="original_content")
    private String originalContent;

    /**
     * 密码
     */
    @Column(name ="password")
    private String password;

    /**
     * slug
     */
    @Column(name ="slug")
    private String slug;

    /**
     * 状态
     */
    @Column(name ="status")
    private Long status;

    /**
     * 总结
     */
    @Column(name ="summary")
    private String summary;

    /**
     * 模板
     */
    @Column(name ="template")
    private String template;

    /**
     * 缩略图
     */
    @Column(name ="thumbnail")
    private String thumbnail;

    /**
     * 标题
     */
    @Column(name ="title")
    private String title;

    /**
     * top_priority
     */
    @Column(name ="top_priority")
    private Long topPriority;

    /**
     * 地址
     */
    @Column(name ="url")
    private String url;

    /**
     * 访客数量
     */
    @Column(name ="visits")
    private Long visits;

    /**
     * 图片ID
     */
    @Column(name ="photo_id")
    private Long photoId;

//    @OneToOne
//    @JoinColumn(name = "photo_id" , referencedColumnName = "id")
//    private PhotosDO photosDO;


}
