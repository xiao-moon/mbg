package com.moon.service;

import com.moon.model.entity.Category;
import java.util.List;

/**
 * @description 文章分类表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface CategoryService {

    /**
    * 查询单个
    */
    Category findById(Integer id);

    /**
    * 查询列表
    */
    List<Category> findList(Category category);

    /**
    * 新增
    */
    int insert(Category category);

    /**
    * 修改
    */
    int update(Category category);

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
    int delete(Category category);


}