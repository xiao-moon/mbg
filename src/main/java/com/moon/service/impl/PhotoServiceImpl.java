package com.moon.service.impl;

import com.moon.model.entity.Menu;
import com.moon.model.entity.Photo;
import com.moon.service.PhotoService;
import com.moon.mapper.PhotoMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 图片表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Photo findById(Integer id){
        Photo model = new Photo();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Photo> findList(Photo photo){
        return mapper.selectListBy(photo);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Photo photo){
        return mapper.insertSelective(photo);
    }

    /**
    * 修改
    */
    @Override
    public int update(Photo photo){
        return mapper.updateByIdSelective(photo);
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
    public int delete(Photo photo){
        return mapper.deleteBy(photo);
    }





}
