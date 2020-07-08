package com.moon.service;

import com.github.pagehelper.PageInfo;
import com.moon.model.vo.CommentsVO;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.events.Comment;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-08 00:31
 */
public interface CommentService {

    /**
     * 查询文章评论信息
     */
    PageInfo findComments(int postId, int pageNum, int pageSize);

    /**
     * 添加评论
     */
    int insertComment(CommentsVO commentsVO, HttpServletRequest request);
}
