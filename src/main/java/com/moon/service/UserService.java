package com.moon.service;

import com.moon.model.dto.UsersDTO;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-25 01:25
 */
public interface UserService {
    /**
     * 查询首页用户信息
     */
    UsersDTO findUserInfo();
}
