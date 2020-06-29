package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: Photos
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Photos implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * 描述
     */
    private String description;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 存储的位置--本地OR远程
     */
    private String location;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态:0正常;1停用
     */
    private Integer status;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 地址
     */
    private String url;




















}
