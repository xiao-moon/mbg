package com.moon.mapper;

import com.moon.model.entity.Tags;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: TagsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface TagsMapper extends BaseMapper<Tags> {

    /**
    * 查询单个
    */
    public Tags selectTagsById(Integer id);


    /**
    * 查询列表
    */
    public List<Tags> selectTagsList(Tags tags);

    /**
    * 新增
    */
    public int insertTags(Tags tags);

    /**
    * 修改
    */
    public int updateTags(Tags tags);

    /**
    * 删除
    */
    public int deleteTagsById(Integer id);

    /**
    * 批量删除
    */
    public int deleteTagsByIds(String[] ids);
}
