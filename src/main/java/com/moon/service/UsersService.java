package com.moon.service;

import com.moon.model.entity.Users;
import com.moon.model.vo.UsersVO;

/**
 * 描述: UsersService
 * 创建人: 小月
 * 创建时间: 2020/6/28 22:51
 **/
public interface UsersService{
    /**
     * 查询用户
     */
    UsersVO findUserVO();

    /**
     * 查询用户
     */
    Users findUser();

}
