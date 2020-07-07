package com.moon.mapper;

import com.moon.model.entity.Posts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述: PostsMapper
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Mapper
public interface PostsMapper {

    /**
     * 查询单个
     */
    Posts selectPostsById(Integer id);


    /**
     * 查询列表
     */
    List<Posts> selectPostsList(Posts posts);

    /**
     * 新增
     */
    int insertPosts(Posts posts);

    /**
     * 修改
     */
    int updatePosts(Posts posts);

    /**
     * 删除
     */
    int deletePostsById(Integer id);

    /**
     * 批量删除
     */
    int deletePostsByIds(String[] ids);

    /**
     * 查询首页展示信息
     */
    List<Posts> selectIndexPosts();

    /**
     * 查询简单文章信息
     */
    List<Posts> selectSimplePostsList();

    /**
     * 查询文章信息，按标签查询
     */
    List<Posts> selectSimplePostsByTags(Integer id);

    /**
     * 查询文章信息，按分类查询
     */
    List<Posts> selectPostsByCategory(Integer id);

    /**
     * 根据文章分类查询文章详情
     */
    Posts selectDetailPostById(Integer id);

}
