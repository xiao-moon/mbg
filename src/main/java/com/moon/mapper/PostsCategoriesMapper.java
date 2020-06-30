package com.moon.mapper;

import com.moon.model.entity.PostsCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: PostsCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface PostsCategoriesMapper{

    /**
    * 查询单个
    */
    PostsCategories selectPostsCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<PostsCategories> selectPostsCategoriesList(PostsCategories postsCategories);

    /**
    * 新增
    */
    int insertPostsCategories(PostsCategories postsCategories);

    /**
    * 修改
    */
    int updatePostsCategories(PostsCategories postsCategories);

    /**
    * 删除
    */
    int deletePostsCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deletePostsCategoriesByIds(String[] ids);
}
