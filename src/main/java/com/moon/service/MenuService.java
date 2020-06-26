package com.moon.service;

import com.moon.model.dto.MenusDTO;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:03
 */
public interface MenuService {
    /**
     *获取菜单
     */
    public List<MenusDTO> findMenus();

}
