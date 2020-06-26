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
 * 描述: PhotoPCategoriesDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "photo_p_categories")
public class PhotoPCategoriesDO implements Serializable {

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
     * 分类ID
     */
    @Column(name ="p_categories_id")
    private Long pCategoriesId;

    /**
     * 图片ID
     */
    @Column(name ="photo_id")
    private Long photoId;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Date updateTime;


}
