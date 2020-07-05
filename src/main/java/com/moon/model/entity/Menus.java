package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: Menus
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menus implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 关联文章分类标志:0关联;1不关联
     */
    private Integer categoriesFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态:0正常;1停用
     */
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * 描述
     */
    private String desc;

    /**
     * 图标
     */
    private String icon;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 排序，数值越小位置越靠前，0表示不排序
     */
    private Integer priority;

    /**
     * 打开方式
     */
    private String target;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 地址
     */
    private String url;

    /**
     * 关联附件表
     */
    private Attachments attachments;


























}
