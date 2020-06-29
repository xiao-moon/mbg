package com.moon.mapper;

import com.moon.model.entity.Categories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: CategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Mapper
public interface CategoriesMapper{

    /**
    * 查询单个
    */
    Categories selectCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<Categories> selectCategoriesList(Categories categories);

    /**
    * 新增
    */
    int insertCategories(Categories categories);

    /**
    * 修改
    */
    int updateCategories(Categories categories);

    /**
    * 删除
    */
    int deleteCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deleteCategoriesByIds(String[] ids);
}
