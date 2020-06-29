package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: PhotoOtherCategories
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhotoOtherCategories implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 其他ID
     */
    private Integer otherId;

    /**
     * 图片ID
     */
    private Integer photoId;

    /**
     * 类型:0表示分类引用的图片;1表示文章封面图片
     */
    private Integer type;

    /**
     * 更新时间
     */
    private Date updateTime;














}
