package com.moon.service;

import com.github.pagehelper.PageInfo;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-01 03:37
 */
public interface PostService {

    /**
     * 查询首页文章
     */
    PageInfo findIndexPosts(int pageNum, int pageSize);

    /**
     * 查询所有文章简略信息，按照时间排序
     */
    PageInfo findAllPostsByTime();

    /**
     * 查看详情
     */
    PageInfo findSimplePostsByTags(Integer id, int pageNum, int pageSize);

}
