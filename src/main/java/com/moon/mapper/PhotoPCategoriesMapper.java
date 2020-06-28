package com.moon.mapper;

import com.moon.model.entity.PhotoPCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: PhotoPCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface PhotoPCategoriesMapper extends BaseMapper<PhotoPCategories> {

    /**
    * 查询单个
    */
    PhotoPCategories selectPhotoPCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<PhotoPCategories> selectPhotoPCategoriesList(PhotoPCategories photoPCategories);

    /**
    * 新增
    */
    int insertPhotoPCategories(PhotoPCategories photoPCategories);

    /**
    * 修改
    */
    int updatePhotoPCategories(PhotoPCategories photoPCategories);

    /**
    * 删除
    */
    int deletePhotoPCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deletePhotoPCategoriesByIds(String[] ids);
}
