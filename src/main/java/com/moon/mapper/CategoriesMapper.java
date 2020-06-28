package com.moon.mapper;

import com.moon.model.entity.Categories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: CategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface CategoriesMapper extends BaseMapper<Categories> {

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
