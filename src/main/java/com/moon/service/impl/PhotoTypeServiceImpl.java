package com.moon.service.impl;

import com.moon.model.entity.Photo;
import com.moon.model.entity.PhotoType;
import com.moon.service.PhotoTypeService;
import com.moon.mapper.PhotoTypeMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 图片分类表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class PhotoTypeServiceImpl implements PhotoTypeService{

    @Autowired
    private PhotoTypeMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public PhotoType findById(Integer id){
        PhotoType model = new PhotoType();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<PhotoType> findList(PhotoType photoType){
        return mapper.selectListBy(photoType);
    }

    /**
    * 新增
    */
    @Override
    public int insert(PhotoType photoType){
        return mapper.insertSelective(photoType);
    }

    /**
    * 修改
    */
    @Override
    public int update(PhotoType photoType){
        return mapper.updateByIdSelective(photoType);
    }

    /**
    * 删除
    */
    @Override
    public int deleteById(Integer id){
        return mapper.deleteById(id);
    }

    /**
    * 批量删除
    */
    @Override
    public int deleteByIds(Integer[] ids){
        return mapper.deleteByIds(ids);
    }

    /**
    * 条件删除
    */
    @Override
    public int delete(PhotoType photoType){
        return mapper.deleteBy(photoType);
    }





}
