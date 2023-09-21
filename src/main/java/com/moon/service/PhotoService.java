package com.moon.service;

import com.moon.model.entity.Photo;
import java.util.List;

/**
 * @description 图片表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface PhotoService {

    /**
    * 查询单个
    */
    Photo findById(Integer id);

    /**
    * 查询列表
    */
    List<Photo> findList(Photo photo);

    /**
    * 新增
    */
    int insert(Photo photo);

    /**
    * 修改
    */
    int update(Photo photo);

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
    int delete(Photo photo);


}