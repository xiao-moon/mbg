package com.moon.mapper;

import com.moon.model.entity.Menus;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: MenusMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface MenusMapper extends BaseMapper<Menus> {

    /**
    * 查询单个
    */
    public Menus selectMenusById(Integer id);


    /**
    * 查询列表
    */
    public List<Menus> selectMenusList(Menus menus);

    /**
    * 新增
    */
    public int insertMenus(Menus menus);

    /**
    * 修改
    */
    public int updateMenus(Menus menus);

    /**
    * 删除
    */
    public int deleteMenusById(Integer id);

    /**
    * 批量删除
    */
    public int deleteMenusByIds(String[] ids);
}
