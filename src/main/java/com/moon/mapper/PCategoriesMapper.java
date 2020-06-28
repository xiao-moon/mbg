package com.moon.mapper;

import com.moon.model.entity.PCategories;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PCategoriesMapper extends BaseMapper<PCategories> {

    /**
    * 查询单个
    */
    public PCategories selectPCategoriesById(Integer id);


    /**
    * 查询列表
    */
    public List<PCategories> selectPCategoriesList(PCategories pCategories);

    /**
    * 新增
    */
    public int insertPCategories(PCategories pCategories);

    /**
    * 修改
    */
    public int updatePCategories(PCategories pCategories);

    /**
    * 删除
    */
    public int deletePCategoriesById(Integer id);

    /**
    * 批量删除
    */
    public int deletePCategoriesByIds(String[] ids);
}
