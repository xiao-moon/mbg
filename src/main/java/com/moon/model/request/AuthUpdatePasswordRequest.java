package com.moon.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author moon
 * @date 2023-09-25 10:52
 * @description
 */
@Getter
@Setter
@ApiModel("更新密码")
public class AuthUpdatePasswordRequest {

    @ApiModelProperty("用户名")
    @NotBlank(message = "username can not be null")
    private String username;

    @ApiModelProperty("旧密码")
    @NotBlank(message = "oldPassword can not be null")
    private String oldPassword;

    @ApiModelProperty("新密码")
    @NotBlank(message = "newPassword can not be null")
    private String newPassword;

}
