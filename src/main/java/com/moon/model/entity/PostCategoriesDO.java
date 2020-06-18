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
 * 描述: PostCategoriesDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_categories")
public class PostCategoriesDO implements Serializable {

    /**
     * 
     */
    @Column(name ="update_time")
    private Timestamp updateTime;

    /**
     * 
     */
    @Column(name ="category_id")
    private Long categoryId;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 
     */
    @Column(name ="create_time")
    private Timestamp createTime;

    /**
     * 
     */
    @Column(name ="post_id")
    private Long postId;


}
