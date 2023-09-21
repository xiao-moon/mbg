package com.moon.service.impl;

import com.moon.model.entity.Attachment;
import com.moon.model.entity.Category;
import com.moon.service.CategoryService;
import com.moon.mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 文章分类表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Category findById(Integer id){
        Category model = new Category();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Category> findList(Category category){
        return mapper.selectListBy(category);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Category category){
        return mapper.insertSelective(category);
    }

    /**
    * 修改
    */
    @Override
    public int update(Category category){
        return mapper.updateByIdSelective(category);
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
    public int delete(Category category){
        return mapper.deleteBy(category);
    }





}
