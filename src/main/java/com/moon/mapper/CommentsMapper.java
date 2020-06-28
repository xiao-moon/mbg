package com.moon.mapper;

import com.moon.model.entity.Comments;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: CommentsMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface CommentsMapper extends BaseMapper<Comments> {

    /**
    * 查询单个
    */
    Comments selectCommentsById(Integer id);


    /**
    * 查询列表
    */
    List<Comments> selectCommentsList(Comments comments);

    /**
    * 新增
    */
    int insertComments(Comments comments);

    /**
    * 修改
    */
    int updateComments(Comments comments);

    /**
    * 删除
    */
    int deleteCommentsById(Integer id);

    /**
    * 批量删除
    */
    int deleteCommentsByIds(String[] ids);
}