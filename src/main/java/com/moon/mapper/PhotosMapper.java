package com.moon.mapper;

import com.moon.model.entity.Photos;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PhotosMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PhotosMapper extends BaseMapper<Photos> {

    /**
    * 查询单个
    */
    public Photos selectPhotosById(Integer id);


    /**
    * 查询列表
    */
    public List<Photos> selectPhotosList(Photos photos);

    /**
    * 新增
    */
    public int insertPhotos(Photos photos);

    /**
    * 修改
    */
    public int updatePhotos(Photos photos);

    /**
    * 删除
    */
    public int deletePhotosById(Integer id);

    /**
    * 批量删除
    */
    public int deletePhotosByIds(String[] ids);
}
