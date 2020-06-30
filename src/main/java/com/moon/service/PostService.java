package com.moon.service;

import com.moon.model.vo.PostsVO;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-01 03:37
 */
public interface PostService {

    List<PostsVO> findIndexPosts();
}
