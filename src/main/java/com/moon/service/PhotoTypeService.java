package com.moon.service;

import com.moon.model.entity.PhotoType;
import java.util.List;

/**
 * @description 图片分类表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface PhotoTypeService {

    /**
    * 查询单个
    */
    PhotoType findById(Integer id);

    /**
    * 查询列表
    */
    List<PhotoType> findList(PhotoType photoType);

    /**
    * 新增
    */
    int insert(PhotoType photoType);

    /**
    * 修改
    */
    int update(PhotoType photoType);

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
    int delete(PhotoType photoType);


}