package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述:
* 创建人: 小月
* 创建时间: 2020-06-28 20:59:24
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("menus")
public class Menus implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 父ID
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * 位置
     */
    @TableField("priority")
    private Integer priority;

    /**
     * 打开方式
     */
    @TableField("target")
    private String target;

    /**
     * 地址
     */
    @TableField("url")
    private String url;

    /**
     * 状态:0正常;1停用
     */
    @TableField("status")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * 关联文章分类标志:0关联;1不关联
     */
    @TableField("categories_flag")
    private Integer categoriesFlag;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


























}