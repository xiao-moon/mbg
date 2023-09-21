package com.moon.service;

import com.moon.model.entity.Post;
import java.util.List;

/**
 * @description 文章表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface PostService {

    /**
    * 查询单个
    */
    Post findById(Integer id);

    /**
    * 查询列表
    */
    List<Post> findList(Post post);

    /**
    * 新增
    */
    int insert(Post post);

    /**
    * 修改
    */
    int update(Post post);

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
    int delete(Post post);


}