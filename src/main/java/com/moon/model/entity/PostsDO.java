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
 * 描述: PostsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class PostsDO implements Serializable {

    /**
     * 创建发布时间
     */
    @Column(name ="create_time")
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    @Column(name ="del_flag")
    private Long delFlag;

    /**
     * 不允许评论:0允许;1不允许
     */
    @Column(name ="disallow_comment")
    private Long disallowComment;

    /**
     * 首次编辑时间
     */
    @Column(name ="edit_time")
    private Date editTime;

    /**
     * 编辑类型:0markdown;1富文本
     */
    @Column(name ="editor_type")
    private Long editorType;

    /**
     * 导出文章顺序
     */
    @Column(name ="export_priority")
    private Long exportPriority;

    /**
     * 导出文章标题
     */
    @Column(name ="export_title")
    private String exportTitle;

    /**
     * 格式化后的文章
     */
    @Column(name ="format_content")
    private String formatContent;

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 点赞数量
     */
    @Column(name ="likes")
    private Long likes;

    /**
     * SEO优化:meta_description
     */
    @Column(name ="meta_description")
    private String metaDescription;

    /**
     * SEO优化:meta_keywords
     */
    @Column(name ="meta_keywords")
    private String metaKeywords;

    /**
     * 原始的文章
     */
    @Column(name ="original_content")
    private String originalContent;

    /**
     * 文章加密密码
     */
    @Column(name ="password")
    private String password;

    /**
     * 状态:0正常;1草稿,2停用
     */
    @Column(name ="status")
    private Long status;

    /**
     * SEO优化:文章标题
     */
    @Column(name ="title")
    private String title;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    @Column(name ="top_flag")
    private Long topFlag;

    /**
     * 置顶位置编号:越小排序位置越靠前
     */
    @Column(name ="top_priority")
    private Long topPriority;

    /**
     * 最近一次更新修改时间
     */
    @Column(name ="update_time")
    private Date updateTime;

    /**
     * 访客数量
     */
    @Column(name ="visits")
    private Long visits;


}
