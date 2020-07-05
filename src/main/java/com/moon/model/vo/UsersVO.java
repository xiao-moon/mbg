package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: UsersVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Users")
public class UsersVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 头像地址
    */
    @ApiModelProperty("头像地址")
    private String avatar;

    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * 描述
    */
    @JsonView(SimpleView.PostsView.class)
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
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 昵称
    */
    @JsonView(SimpleView.PostsView.class)
    @ApiModelProperty("昵称")
    private String nickname;

    /**
    * 密码
    */
    @ApiModelProperty("密码")
    private String password;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
    * 登录名
    */
    @ApiModelProperty("登录名")
    private String username;











}
