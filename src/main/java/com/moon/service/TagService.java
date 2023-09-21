package com.moon.service;

import com.moon.model.entity.Tag;
import java.util.List;

/**
 * @description 标签表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface TagService {

    /**
    * 查询单个
    */
    Tag findById(Integer id);

    /**
    * 查询列表
    */
    List<Tag> findList(Tag tag);

    /**
    * 新增
    */
    int insert(Tag tag);

    /**
    * 修改
    */
    int update(Tag tag);

    /**
    * 删除
    */
    int deleteById(Integer id);

    /**
    * 批量删除
    */
    int deleteByIds(Integer[] ids);

    /**
    * 条件删除
    */
    int delete(Tag tag);


}