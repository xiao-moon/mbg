package com.moon.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.mapper.CommentsMapper;
import com.moon.model.entity.Comments;
import com.moon.model.vo.CommentsVO;
import com.moon.service.CommentService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-08 00:32
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentsMapper commentsMapper;

    @Override
    @Transactional
    public PageInfo findComments(int postId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Comments> cList = commentsMapper.selectCommentsListOrderByConditionsDesc(postId, 0);
        PageInfo pageInfo = new PageInfo(cList);
        List<CommentsVO> cvoList = new ArrayList<>();
        for (Comments comments : cList) {
            List<Comments> subCList = commentsMapper.selectCommentsListOrderByConditionsDesc(comments.getPostId(), comments.getId());
            comments.setSubCList(subCList);
            CommentsVO commentsVO = new CommentsVO();
            BeanCopierUtil.transDOToVO(comments, commentsVO);
            cvoList.add(commentsVO);
        }
        pageInfo.setList(cvoList);
        return pageInfo;
    }


    @Override
    public int insertComment(CommentsVO commentsVO, HttpServletRequest request) {
        Comments comments = new Comments();
        BeanCopierUtil.transVOToDO(commentsVO, comments);
        request.getRequestURI();
        comments.setId(null);


        return 0;
    }
}
