package com.moon.mapper;

import com.moon.model.entity.PostTags;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PostTagsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PostTagsMapper extends BaseMapper<PostTags> {

    /**
    * 查询单个
    */
    public PostTags selectPostTagsById(Integer id);


    /**
    * 查询列表
    */
    public List<PostTags> selectPostTagsList(PostTags postTags);

    /**
    * 新增
    */
    public int insertPostTags(PostTags postTags);

    /**
    * 修改
    */
    public int updatePostTags(PostTags postTags);

    /**
    * 删除
    */
    public int deletePostTagsById(Integer id);

    /**
    * 批量删除
    */
    public int deletePostTagsByIds(String[] ids);
}
