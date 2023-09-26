package com.moon.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * @author moon
 * @description 用户表
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("用户表")
public class UserVO {

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
     * 登录名
     */
    @ApiModelProperty("登录名")
    private String username;


    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickname;

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
