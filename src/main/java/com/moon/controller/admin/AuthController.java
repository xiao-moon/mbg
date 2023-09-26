package com.moon.controller.admin;

import com.moon.model.SimpleResponse;
import com.moon.model.entity.User;
import com.moon.model.request.AuthRequest;
import com.moon.model.request.AuthUpdatePasswordRequest;
import com.moon.model.request.AuthUserUpdateRequest;
import com.moon.model.vo.UserVO;
import com.moon.service.AuthService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author moon
 * @date 2023-09-25 10:49
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/admin/auth")
@ApiModel("认证相关")
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public SimpleResponse<UserVO> login(@RequestBody @Valid AuthRequest request) {
        return SimpleResponse.success(authService.login(request.getUsername(), request.getPassword()));
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public SimpleResponse<Void> register(@RequestBody @Valid AuthRequest request) {
        authService.register(request.getUsername(), request.getPassword());
        return SimpleResponse.success();
    }

    @PutMapping("/update")
    @ApiOperation("更新用户信息")
    public SimpleResponse<UserVO> update(@RequestBody @Valid AuthUserUpdateRequest request) {
        return SimpleResponse.success(authService.update(request));
    }

    @PutMapping("/update-password")
    @ApiOperation("重置密码")
    public SimpleResponse<Void> updatePassword(@RequestBody @Valid AuthUpdatePasswordRequest request) {
        authService.updatePassword(request);
        return SimpleResponse.success();
    }

    @GetMapping("/user")
    @ApiOperation("获取用户信息")
    public SimpleResponse<UserVO> getUser(User user) {
        Assert.notNull(user, "user can not be null");
        UserVO vo = new UserVO();
        BeanUtils.copyProperties(user, vo);
        return SimpleResponse.success(vo);
    }


}
