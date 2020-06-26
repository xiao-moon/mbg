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
 * 描述: PhotoOtherCategoriesDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "photo_other_categories")
public class PhotoOtherCategoriesDO implements Serializable {

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Date createTime;

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 其他ID
     */
    @Column(name ="other_id")
    private Long otherId;

    /**
     * 图片ID
     */
    @Column(name ="photo_id")
    private Long photoId;

    /**
     * 类型:0表示分类引用的图片;1表示文章封面图片
     */
    @Column(name ="type")
    private Long type;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Date updateTime;


}
