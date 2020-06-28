package com.moon.mapper;

import com.moon.model.entity.Posts;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PostsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PostsMapper extends BaseMapper<Posts> {

    /**
    * 查询单个
    */
    public Posts selectPostsById(Integer id);


    /**
    * 查询列表
    */
    public List<Posts> selectPostsList(Posts posts);

    /**
    * 新增
    */
    public int insertPosts(Posts posts);

    /**
    * 修改
    */
    public int updatePosts(Posts posts);

    /**
    * 删除
    */
    public int deletePostsById(Integer id);

    /**
    * 批量删除
    */
    public int deletePostsByIds(String[] ids);
}
