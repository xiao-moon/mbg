package com.moon.mapper;

import com.moon.model.entity.Comments;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: CommentsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface CommentsMapper extends BaseMapper<Comments> {

    /**
    * 查询单个
    */
    public Comments selectCommentsById(Integer id);


    /**
    * 查询列表
    */
    public List<Comments> selectCommentsList(Comments comments);

    /**
    * 新增
    */
    public int insertComments(Comments comments);

    /**
    * 修改
    */
    public int updateComments(Comments comments);

    /**
    * 删除
    */
    public int deleteCommentsById(Integer id);

    /**
    * 批量删除
    */
    public int deleteCommentsByIds(String[] ids);
}
