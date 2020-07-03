package com.moon.mapper;

import com.moon.model.entity.Tags;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: TagsMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface TagsMapper{

    /**
    * 查询单个
    */
    Tags selectTagsById(Integer id);


    /**
    * 查询列表
    */
    List<Tags> selectTagsList(Tags tags);

    /**
    * 新增
    */
    int insertTags(Tags tags);

    /**
    * 修改
    */
    int updateTags(Tags tags);

    /**
    * 删除
    */
    int deleteTagsById(Integer id);

    /**
    * 批量删除
    */
    int deleteTagsByIds(String[] ids);


    /**
     * 按照时间和位置排序
     */
    List<Tags> selectTagsOrderByPriorityAndTime();

}
