package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: UsersDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "UsersDTO")
public class UsersDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * email
     */
    @ApiModelProperty(value = "email")
    private String email;

    /**
     * 过期时间
     */
    @ApiModelProperty(value = "过期时间")
    private String expireTime;

    /**
     * mfa_key
     */
    @ApiModelProperty(value = "mfa_key")
    private String mfaKey;

    /**
     * mfa_type
     */
    @ApiModelProperty(value = "mfa_type")
    private String mfaType;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 登录名
     */
    @ApiModelProperty(value = "登录名")
    private String username;

    /**
     * 当前连接
     */
    @ApiModelProperty(value = "当前连接")
    private String currentConnections;

    /**
     * 总连接
     */
    @ApiModelProperty(value = "总连接")
    private String totalConnections;

    /**
     * user
     */
    @ApiModelProperty(value = "user")
    private String user;


}
