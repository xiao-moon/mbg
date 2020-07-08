package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.model.vo.CommentsVO;
import com.moon.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-08 00:27
 */
@RestController
@RequestMapping("/comment")
@Api(value = "comment", description = "评价表")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/{postId:\\d+}")
    @JsonView(SimpleView.CommentsView.class)
    @ApiOperation(value = "查询评价")
    public Object getInfo(@PathVariable Integer postId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "5") int pageSize) {
        return commentService.findComments(postId, pageNum, pageSize);
    }

    @PostMapping("/add")
    @ApiOperation(value = "查询评价")
    public Object addComment(CommentsVO commentsVO, HttpServletRequest request) {
        int i = commentService.insertComment(commentsVO, request);
        if (i == 1) {
            return "添加评论成功";
        } else {
            return "添加评论失败";
        }
    }

}
