package com.moon.mapper;

import com.moon.model.entity.Menus;
import java.util.List;

import com.moon.model.vo.MenusVO;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: MenusMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface MenusMapper{

    /**
    * 查询单个
    */
    Menus selectMenusById(Integer id);


    /**
    * 查询列表
    */
    List<Menus> selectMenusList(Menus menus);

    /**
    * 新增
    */
    int insertMenus(Menus menus);

    /**
    * 修改
    */
    int updateMenus(Menus menus);

    /**
    * 删除
    */
    int deleteMenusById(Integer id);

    /**
    * 批量删除
    */
    int deleteMenusByIds(String[] ids);

    /**
     * 查询首页菜单
     */
    List<Menus> selectIndexMenus();
}
