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
 * 创建时间: 2020-06-24 01:25:33
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
     * 地址
     */
    @Column(name ="url")
    private String url;

    /**
     * 状态:0正常;1停用
     */
    @Column(name ="status")
    private Long status;

    /**
     * 删除标志:0正常;1删除
     */
    @Column(name ="del_flag")
    private Long delFlag;

    /**
     * 关联文章分类标志:0关联;1不关联
     */
    @Column(name ="categories_flag")
    private Long categoriesFlag;

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
