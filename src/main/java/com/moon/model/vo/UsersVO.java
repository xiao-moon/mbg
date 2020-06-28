package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: UsersVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Users")
public class UsersVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

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
    private String expireTime;

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
    private String createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;











}