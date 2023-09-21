package com.moon.service;

import com.moon.model.entity.Comment;
import java.util.List;

/**
 * @description 评论表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface CommentService {

    /**
    * 查询单个
    */
    Comment findById(Integer id);

    /**
    * 查询列表
    */
    List<Comment> findList(Comment comment);

    /**
    * 新增
    */
    int insert(Comment comment);

    /**
    * 修改
    */
    int update(Comment comment);

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
    int delete(Comment comment);


}