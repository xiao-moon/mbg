package com.moon.mapper;

import com.moon.model.entity.Categories;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: CategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface CategoriesMapper extends BaseMapper<Categories> {

    /**
    * 查询单个
    */
    public Categories selectCategoriesById(Integer id);


    /**
    * 查询列表
    */
    public List<Categories> selectCategoriesList(Categories categories);

    /**
    * 新增
    */
    public int insertCategories(Categories categories);

    /**
    * 修改
    */
    public int updateCategories(Categories categories);

    /**
    * 删除
    */
    public int deleteCategoriesById(Integer id);

    /**
    * 批量删除
    */
    public int deleteCategoriesByIds(String[] ids);
}
