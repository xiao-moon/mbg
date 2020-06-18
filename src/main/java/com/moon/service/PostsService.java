package com.moon.service;

import com.moon.model.dto.PostsDTO;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-17 20:54
 */
public interface PostsService {

    List<PostsDTO> findAllByPage();
}
