package com.moon.service.impl;

import com.moon.model.entity.Tag;
import com.moon.model.entity.User;
import com.moon.service.UserService;
import com.moon.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 用户表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public User findById(Integer id){
        User model = new User();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<User> findList(User user){
        return mapper.selectListBy(user);
    }

    /**
    * 新增
    */
    @Override
    public int insert(User user){
        return mapper.insertSelective(user);
    }

    /**
    * 修改
    */
    @Override
    public int update(User user){
        return mapper.updateByIdSelective(user);
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
    public int delete(User user){
        return mapper.deleteBy(user);
    }





}
