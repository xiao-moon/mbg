package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: AttachmentsCategories
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttachmentsCategories implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 附件ID
     */
    private Integer attachmentId;

    /**
     * 菜单ID
     */
    private Integer categoryId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 更新时间
     */
    private Date updateTime;












}
