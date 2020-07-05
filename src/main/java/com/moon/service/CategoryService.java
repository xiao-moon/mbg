package com.moon.service;

import com.github.pagehelper.PageInfo;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 01:16
 */
public interface CategoryService {

    /**
     * 查询所有分类信息
     */
    PageInfo findCategoriesAndPosts(int pageNum, int pageSize);

    /**
     * 根据分类id，查询分页信息
     */
    PageInfo findCategoriesAndPostsByPage(int id, int pageNum, int pageSize);
}
