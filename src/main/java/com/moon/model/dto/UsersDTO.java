package com.moon.model.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: UsersDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "UsersDTO")
public class UsersDTO {

    public interface SimpleUserInfo extends SimpleView.ReturnDataView {}

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 描述
     */
    @JsonView(SimpleUserInfo.class)
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
     * 昵称
     */
    @JsonView(SimpleUserInfo.class)
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
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;


}
