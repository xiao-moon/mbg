package com.moon.mapper;

import com.moon.model.entity.PostsTags;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: PostsTagsMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface PostsTagsMapper{

    /**
    * 查询单个
    */
    PostsTags selectPostsTagsById(Integer id);


    /**
    * 查询列表
    */
    List<PostsTags> selectPostsTagsList(PostsTags postsTags);

    /**
    * 新增
    */
    int insertPostsTags(PostsTags postsTags);

    /**
    * 修改
    */
    int updatePostsTags(PostsTags postsTags);

    /**
    * 删除
    */
    int deletePostsTagsById(Integer id);

    /**
    * 批量删除
    */
    int deletePostsTagsByIds(String[] ids);
}
