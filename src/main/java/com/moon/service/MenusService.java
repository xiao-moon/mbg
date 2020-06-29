package com.moon.service;

import com.moon.model.dto.MenusDTO;
import com.moon.model.vo.MenusVO;

import java.util.List;

/**
 * 描述: MenusService
 * 创建人: 小月
 * 创建时间: 2020/6/28 22:51
 **/
public interface MenusService {
    List<MenusVO> findAll();
}
