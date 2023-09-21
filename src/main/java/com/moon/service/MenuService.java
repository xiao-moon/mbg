package com.moon.service;

import com.moon.model.entity.Menu;
import java.util.List;

/**
 * @description 菜单表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface MenuService {

    /**
    * 查询单个
    */
    Menu findById(Integer id);

    /**
    * 查询列表
    */
    List<Menu> findList(Menu menu);

    /**
    * 新增
    */
    int insert(Menu menu);

    /**
    * 修改
    */
    int update(Menu menu);

    /**
    * 删除
    */
    int deleteById(Integer id);

    /**
    * 批量删除
    */
    int deleteByIds(Integer[] ids);

    /**
    * 条件删除
    */
    int delete(Menu menu);


}