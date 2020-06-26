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
 * 描述: PhotosDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "photos")
public class PhotosDO implements Serializable {

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
     * 描述
     */
    @Column(name ="description")
    private String description;

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 存储的位置--本地OR远程
     */
    @Column(name ="location")
    private String location;

    /**
     * 名称
     */
    @Column(name ="name")
    private String name;

    /**
     * 状态:0正常;1停用
     */
    @Column(name ="status")
    private Long status;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Date updateTime;

    /**
     * 地址
     */
    @Column(name ="url")
    private String url;


}
