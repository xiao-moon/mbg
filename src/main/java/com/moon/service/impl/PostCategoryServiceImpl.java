package com.moon.service.impl;

import com.moon.model.entity.PhotoType;
import com.moon.model.entity.PostCategory;
import com.moon.service.PostCategoryService;
import com.moon.mapper.PostCategoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 菜单文章关联表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class PostCategoryServiceImpl implements PostCategoryService{

    @Autowired
    private PostCategoryMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public PostCategory findById(Integer id){
        PostCategory model = new PostCategory();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<PostCategory> findList(PostCategory postCategory){
        return mapper.selectListBy(postCategory);
    }

    /**
    * 新增
    */
    @Override
    public int insert(PostCategory postCategory){
        return mapper.insertSelective(postCategory);
    }

    /**
    * 修改
    */
    @Override
    public int update(PostCategory postCategory){
        return mapper.updateByIdSelective(postCategory);
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
    public int delete(PostCategory postCategory){
        return mapper.deleteBy(postCategory);
    }





}
