package com.moon.mapper;

import com.moon.model.entity.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述: CommentsMapper
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Mapper
public interface CommentsMapper {

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

    /**
     * 查询评论列表,根据条件
     */
    List<Comments> selectCommentsListOrderByConditionsDesc(@Param("postId") int postId, @Param("parentId") int parentId);


}
