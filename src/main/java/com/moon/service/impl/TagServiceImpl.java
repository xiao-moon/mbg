package com.moon.service.impl;

import com.moon.model.entity.PostTag;
import com.moon.model.entity.Tag;
import com.moon.service.TagService;
import com.moon.mapper.TagMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 标签表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Tag findById(Integer id){
        Tag model = new Tag();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Tag> findList(Tag tag){
        return mapper.selectListBy(tag);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Tag tag){
        return mapper.insertSelective(tag);
    }

    /**
    * 修改
    */
    @Override
    public int update(Tag tag){
        return mapper.updateByIdSelective(tag);
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
    public int delete(Tag tag){
        return mapper.deleteBy(tag);
    }





}
