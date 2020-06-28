package com.moon.mapper;

import com.moon.model.entity.PostCategories;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PostCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PostCategoriesMapper extends BaseMapper<PostCategories> {

    /**
    * 查询单个
    */
    public PostCategories selectPostCategoriesById(Integer id);


    /**
    * 查询列表
    */
    public List<PostCategories> selectPostCategoriesList(PostCategories postCategories);

    /**
    * 新增
    */
    public int insertPostCategories(PostCategories postCategories);

    /**
    * 修改
    */
    public int updatePostCategories(PostCategories postCategories);

    /**
    * 删除
    */
    public int deletePostCategoriesById(Integer id);

    /**
    * 批量删除
    */
    public int deletePostCategoriesByIds(String[] ids);
}
