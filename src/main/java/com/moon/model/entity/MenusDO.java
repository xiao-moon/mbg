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
 * 描述: MenusDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menus")
public class MenusDO implements Serializable {

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
     * 图标
     */
    @Column(name ="icon")
    private String icon;

    /**
     * 名称
     */
    @Column(name ="name")
    private String name;

    /**
     * 父ID
     */
    @Column(name ="parent_id")
    private Long parentId;

    /**
     * 位置
     */
    @Column(name ="priority")
    private Long priority;

    /**
     * 打开方式
     */
    @Column(name ="target")
    private String target;

    /**
     * 团队
     */
    @Column(name ="team")
    private String team;

    /**
     * 地址
     */
    @Column(name ="url")
    private String url;

    /**
     * 是否显示
     */
    @Column(name ="is_show")
    private Integer isShow;

    /**
     * 图片id
     */
    @Column(name ="photo_id")
    private Long photoId;
}
