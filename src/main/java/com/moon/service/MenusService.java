package com.moon.service;

import com.moon.model.dto.MenusDTO;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-15 00:34
 */
public interface MenusService {

    /**
     * 查询所有展示的顶级菜单
     */
    List<MenusDTO> findAllHeadMenus(Integer isShow,Long parentId);
}
