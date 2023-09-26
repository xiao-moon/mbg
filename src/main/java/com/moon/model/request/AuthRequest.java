package com.moon.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author moon
 * @date 2023-09-25 10:52
 * @description
 */
@Getter
@Setter
@ApiModel("登录请求")
public class AuthRequest {

    @ApiModelProperty("用户名")
    @NotBlank(message = "username can not be null")
    private String username;

    @ApiModelProperty("密码")
    @NotBlank(message = "password can not be null")
    private String password;

}
