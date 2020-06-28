package com.moon.mapper;

import com.moon.model.entity.PCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface PCategoriesMapper extends BaseMapper<PCategories> {

    /**
    * 查询单个
    */
    PCategories selectPCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<PCategories> selectPCategoriesList(PCategories pCategories);

    /**
    * 新增
    */
    int insertPCategories(PCategories pCategories);

    /**
    * 修改
    */
    int updatePCategories(PCategories pCategories);

    /**
    * 删除
    */
    int deletePCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deletePCategoriesByIds(String[] ids);
}
