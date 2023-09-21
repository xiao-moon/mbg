package com.moon.service;

import com.moon.model.entity.PostTag;
import java.util.List;

/**
 * @description 文章标签关联表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface PostTagService {

    /**
    * 查询单个
    */
    PostTag findById(Integer id);

    /**
    * 查询列表
    */
    List<PostTag> findList(PostTag postTag);

    /**
    * 新增
    */
    int insert(PostTag postTag);

    /**
    * 修改
    */
    int update(PostTag postTag);

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
    int delete(PostTag postTag);


}