package com.moon.service;

import com.moon.model.entity.PostCategory;
import java.util.List;

/**
 * @description 菜单文章关联表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface PostCategoryService {

    /**
    * 查询单个
    */
    PostCategory findById(Integer id);

    /**
    * 查询列表
    */
    List<PostCategory> findList(PostCategory postCategory);

    /**
    * 新增
    */
    int insert(PostCategory postCategory);

    /**
    * 修改
    */
    int update(PostCategory postCategory);

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
    int delete(PostCategory postCategory);


}