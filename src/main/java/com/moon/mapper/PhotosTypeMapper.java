package com.moon.mapper;

import com.moon.model.entity.PhotosType;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: PhotosTypeMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface PhotosTypeMapper{

    /**
    * 查询单个
    */
    PhotosType selectPhotosTypeById(Integer id);


    /**
    * 查询列表
    */
    List<PhotosType> selectPhotosTypeList(PhotosType photosType);

    /**
    * 新增
    */
    int insertPhotosType(PhotosType photosType);

    /**
    * 修改
    */
    int updatePhotosType(PhotosType photosType);

    /**
    * 删除
    */
    int deletePhotosTypeById(Integer id);

    /**
    * 批量删除
    */
    int deletePhotosTypeByIds(String[] ids);
}
