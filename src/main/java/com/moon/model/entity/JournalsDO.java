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
 * 描述: JournalsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "journals")
public class JournalsDO implements Serializable {

    /**
     * ID主键自增
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
     * 内容
     */
    @Column(name ="content")
    private String content;

    /**
     * likes
     */
    @Column(name ="likes")
    private Long likes;

    /**
     * source_content
     */
    @Column(name ="source_content")
    private String sourceContent;

    /**
     * 类型
     */
    @Column(name ="type")
    private Long type;


}