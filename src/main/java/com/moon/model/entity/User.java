package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 用户表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("用户表")
public class User {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 头像地址
     */
    @ApiModelProperty("头像地址")
    private String avatar;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;

    /**
     * email
     */
    @ApiModelProperty("email")
    private String email;

    /**
     * 过期时间
     */
    @ApiModelProperty("过期时间")
    private LocalDateTime expireTime;

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickname;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 登录名
     */
    @ApiModelProperty("登录名")
    private String username;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;












}
