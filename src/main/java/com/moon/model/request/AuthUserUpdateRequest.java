package com.moon.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


/**
 * @description 用户表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("更新用户")
public class AuthUserUpdateRequest {

    /**
     * ID主键自增
     */
    @NotNull(message = "id can not be null")
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
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickname;


}
