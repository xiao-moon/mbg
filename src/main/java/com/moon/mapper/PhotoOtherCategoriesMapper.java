package com.moon.mapper;

import com.moon.model.entity.PhotoOtherCategories;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PhotoOtherCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PhotoOtherCategoriesMapper extends BaseMapper<PhotoOtherCategories> {

    /**
    * 查询单个
    */
    public PhotoOtherCategories selectPhotoOtherCategoriesById(Integer id);


    /**
    * 查询列表
    */
    public List<PhotoOtherCategories> selectPhotoOtherCategoriesList(PhotoOtherCategories photoOtherCategories);

    /**
    * 新增
    */
    public int insertPhotoOtherCategories(PhotoOtherCategories photoOtherCategories);

    /**
    * 修改
    */
    public int updatePhotoOtherCategories(PhotoOtherCategories photoOtherCategories);

    /**
    * 删除
    */
    public int deletePhotoOtherCategoriesById(Integer id);

    /**
    * 批量删除
    */
    public int deletePhotoOtherCategoriesByIds(String[] ids);
}
