package com.moon.mapper;

import com.moon.model.entity.PhotoPCategories;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PhotoPCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface PhotoPCategoriesMapper extends BaseMapper<PhotoPCategories> {

    /**
    * 查询单个
    */
    public PhotoPCategories selectPhotoPCategoriesById(Integer id);


    /**
    * 查询列表
    */
    public List<PhotoPCategories> selectPhotoPCategoriesList(PhotoPCategories photoPCategories);

    /**
    * 新增
    */
    public int insertPhotoPCategories(PhotoPCategories photoPCategories);

    /**
    * 修改
    */
    public int updatePhotoPCategories(PhotoPCategories photoPCategories);

    /**
    * 删除
    */
    public int deletePhotoPCategoriesById(Integer id);

    /**
    * 批量删除
    */
    public int deletePhotoPCategoriesByIds(String[] ids);
}
