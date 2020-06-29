package com.moon.mapper;

import com.moon.model.entity.PostCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: PostCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Mapper
public interface PostCategoriesMapper{

    /**
    * 查询单个
    */
    PostCategories selectPostCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<PostCategories> selectPostCategoriesList(PostCategories postCategories);

    /**
    * 新增
    */
    int insertPostCategories(PostCategories postCategories);

    /**
    * 修改
    */
    int updatePostCategories(PostCategories postCategories);

    /**
    * 删除
    */
    int deletePostCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deletePostCategoriesByIds(String[] ids);
}
