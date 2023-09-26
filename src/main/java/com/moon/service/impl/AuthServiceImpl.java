package com.moon.service.impl;

import com.moon.exception.ServiceException;
import com.moon.model.entity.User;
import com.moon.model.request.AuthUpdatePasswordRequest;
import com.moon.model.request.AuthUserUpdateRequest;
import com.moon.model.vo.UserVO;
import com.moon.service.AuthService;
import com.moon.service.UserService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @author moon
 * @date 2023-09-25 13:48
 * @description
 */
@Service
public class AuthServiceImpl implements AuthService {

    private static final String PATTERN = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,}";


    @Resource
    private UserService userService;

    @Override
    public UserVO login(String username, String password) {
        Assert.isTrue(StringUtils.isNotBlank(username), "username can not be null");
        Assert.isTrue(StringUtils.isNotBlank(password), "password can not be null");
        User user = userService.findByUsernameAndPassword(username, password);
        if (Objects.isNull(user)) {
            throw new ServiceException("用户名密码错误");
        }

        UserVO vo = new UserVO();
        BeanUtils.copyProperties(user, vo);
        return vo;
    }

    @Override
    public void register(String username, String password) {
        password = new String(Base64.decodeBase64(password), StandardCharsets.UTF_8);
        Assert.isTrue(StringUtils.isNotBlank(username), "username can not be null");
        Assert.isTrue(StringUtils.isNotBlank(password), "password can not be null");
        if (!Pattern.matches(PATTERN, password)) {
            throw new ServiceException("密码由字母和数字组成，且大于等于8个字符");
        }

        if (userService.exist()) {
            throw new ServiceException("用户已存在");
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.insert(user);
    }

    @Override
    public UserVO update(AuthUserUpdateRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        userService.update(user);

        UserVO vo = new UserVO();
        User userInfo = userService.findById(request.getId());
        BeanUtils.copyProperties(userInfo, vo);
        return vo;
    }

    @Override
    public void updatePassword(AuthUpdatePasswordRequest request) {
        User user = userService.findByUsernameAndPassword(request.getUsername(), request.getOldPassword());
        if (Objects.isNull(user)) {
            throw new ServiceException("旧密码错误");
        }

        String plaintext = new String(Base64.decodeBase64(request.getNewPassword()), StandardCharsets.UTF_8);
        if (!Pattern.matches(PATTERN, plaintext)) {
            throw new ServiceException("密码由字母和数字组成，且大于等于8个字符");
        }

        User update = new User();
        update.setId(user.getId());
        update.setPassword(request.getNewPassword());
    }
}
