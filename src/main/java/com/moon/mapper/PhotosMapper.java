package com.moon.mapper;

import com.moon.model.entity.Photos;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: PhotosMapper
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Mapper
public interface PhotosMapper{

    /**
    * 查询单个
    */
    Photos selectPhotosById(Integer id);


    /**
    * 查询列表
    */
    List<Photos> selectPhotosList(Photos photos);

    /**
    * 新增
    */
    int insertPhotos(Photos photos);

    /**
    * 修改
    */
    int updatePhotos(Photos photos);

    /**
    * 删除
    */
    int deletePhotosById(Integer id);

    /**
    * 批量删除
    */
    int deletePhotosByIds(String[] ids);
}
