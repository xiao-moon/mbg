package com.moon.service.impl;

import com.moon.model.entity.Post;
import com.moon.model.entity.PostCategory;
import com.moon.service.PostService;
import com.moon.mapper.PostMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 文章表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Post findById(Integer id){
        Post model = new Post();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Post> findList(Post post){
        return mapper.selectListBy(post);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Post post){
        return mapper.insertSelective(post);
    }

    /**
    * 修改
    */
    @Override
    public int update(Post post){
        return mapper.updateByIdSelective(post);
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
    public int delete(Post post){
        return mapper.deleteBy(post);
    }





}
