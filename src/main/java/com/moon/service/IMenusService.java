package com.moon.service;

import com.moon.model.dto.MenusDTO;
import com.moon.model.entity.Menus;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author moon
 * @since 2020-06-27
 */
public interface IMenusService extends IService<Menus> {
    List<MenusDTO> findAll();
}
