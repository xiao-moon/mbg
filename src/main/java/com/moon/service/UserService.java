package com.moon.service;

import com.moon.model.entity.User;
import java.util.List;

/**
 * @description 用户表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface UserService {

    /**
    * 查询单个
    */
    User findById(Integer id);

    /**
    * 查询列表
    */
    List<User> findList(User user);

    /**
     * 根据用户名查询
     */
    User findByUsername(String username);

    /**
     * 查询用户是否存在
     */
    boolean exist();

    /**
     * 根据用户名+密码查询
     */
    User findByUsernameAndPassword(String username, String password);

    /**
    * 新增
    */
    int insert(User user);

    /**
    * 修改
    */
    int update(User user);

    /**
    * 删除
    */
    int deleteById(Integer id);

    /**
    * 批量删除
    */
    int deleteByIds(Integer[] ids);

    /**
    * 条件删除
    */
    int delete(User user);


}