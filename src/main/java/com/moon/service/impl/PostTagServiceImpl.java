package com.moon.service.impl;

import com.moon.model.entity.Post;
import com.moon.model.entity.PostTag;
import com.moon.service.PostTagService;
import com.moon.mapper.PostTagMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 文章标签关联表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class PostTagServiceImpl implements PostTagService{

    @Autowired
    private PostTagMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public PostTag findById(Integer id){
        PostTag model = new PostTag();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<PostTag> findList(PostTag postTag){
        return mapper.selectListBy(postTag);
    }

    /**
    * 新增
    */
    @Override
    public int insert(PostTag postTag){
        return mapper.insertSelective(postTag);
    }

    /**
    * 修改
    */
    @Override
    public int update(PostTag postTag){
        return mapper.updateByIdSelective(postTag);
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
    public int delete(PostTag postTag){
        return mapper.deleteBy(postTag);
    }





}
