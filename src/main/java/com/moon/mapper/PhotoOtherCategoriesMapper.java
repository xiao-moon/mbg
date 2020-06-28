package com.moon.mapper;

import com.moon.model.entity.PhotoOtherCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PhotoOtherCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface PhotoOtherCategoriesMapper extends BaseMapper<PhotoOtherCategories> {

    /**
    * 查询单个
    */
    PhotoOtherCategories selectPhotoOtherCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<PhotoOtherCategories> selectPhotoOtherCategoriesList(PhotoOtherCategories photoOtherCategories);

    /**
    * 新增
    */
    int insertPhotoOtherCategories(PhotoOtherCategories photoOtherCategories);

    /**
    * 修改
    */
    int updatePhotoOtherCategories(PhotoOtherCategories photoOtherCategories);

    /**
    * 删除
    */
    int deletePhotoOtherCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deletePhotoOtherCategoriesByIds(String[] ids);
}
