package com.moon.mapper;

import com.moon.model.entity.PostTags;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PostTagsMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface PostTagsMapper extends BaseMapper<PostTags> {

    /**
    * 查询单个
    */
    PostTags selectPostTagsById(Integer id);


    /**
    * 查询列表
    */
    List<PostTags> selectPostTagsList(PostTags postTags);

    /**
    * 新增
    */
    int insertPostTags(PostTags postTags);

    /**
    * 修改
    */
    int updatePostTags(PostTags postTags);

    /**
    * 删除
    */
    int deletePostTagsById(Integer id);

    /**
    * 批量删除
    */
    int deletePostTagsByIds(String[] ids);
}
