package com.moon.service;

import com.moon.model.dto.UsersDTO;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-15 20:15
 */
public interface UsersService {

    /**
     *获取用户昵称和描述
     */
    UsersDTO findAll();

}
