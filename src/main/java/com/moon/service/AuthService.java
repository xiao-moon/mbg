package com.moon.service;

import com.moon.model.request.AuthUpdatePasswordRequest;
import com.moon.model.request.AuthUserUpdateRequest;
import com.moon.model.vo.UserVO;

/**
 * @author moon
 * @date 2023-09-25 13:47
 * @description
 */
public interface AuthService {

    /**
     * 登录
     */
    UserVO login(String username, String password);

    /**
     * 注冊
     */
    void register(String username, String password);

    /**
     * 更新用户信息
     */
    UserVO update(AuthUserUpdateRequest request);

    /**
     * 重置密码
     */
    void updatePassword(AuthUpdatePasswordRequest request);


}
