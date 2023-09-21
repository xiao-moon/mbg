package com.moon.service.impl;

import com.moon.mapper.CommentMapper;
import com.moon.model.entity.Comment;
import com.moon.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author moon
 * @description 评论表
 * @date 2023-09-21 17:37:23
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper mapper;

    /**
     * 查询单个
     */
    @Override
    public Comment findById(Integer id) {
        Comment model = new Comment();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
     * 查询列表
     */
    @Override
    public List<Comment> findList(Comment comment) {
        return mapper.selectListBy(comment);
    }

    /**
     * 新增
     */
    @Override
    public int insert(Comment comment) {
        return mapper.insertSelective(comment);
    }

    /**
     * 修改
     */
    @Override
    public int update(Comment comment) {
        return mapper.updateByIdSelective(comment);
    }

    /**
     * 删除
     */
    @Override
    public int deleteById(Integer id) {
        return mapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    @Override
    public int deleteByIds(Integer[] ids) {
        return mapper.deleteByIds(ids);
    }

    /**
     * 条件删除
     */
    @Override
    public int delete(Comment comment) {
        return mapper.deleteBy(comment);
    }


}
