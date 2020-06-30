package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: Users
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 描述
     */
    private String description;

    /**
     * email
     */
    private String email;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 登录名
     */
    private String username;






















}
