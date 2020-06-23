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
 * 描述: PostTagsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:45:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_tags")
public class PostTagsDO implements Serializable {

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 文章ID
     */
    @Column(name ="post_id")
    private Long postId;

    /**
     * 标签ID
     */
    @Column(name ="tag_id")
    private Long tagId;

    /**
     * 标签排序,越小排序位置越靠前
     */
    @Column(name ="priority")
    private Long priority;

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


}
