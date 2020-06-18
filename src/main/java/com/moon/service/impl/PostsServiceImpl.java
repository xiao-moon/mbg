package com.moon.service.impl;

import com.moon.model.dto.PostsDTO;
import com.moon.model.entity.PostsDO;
import com.moon.repository.PostsRepository;
import com.moon.service.PostsService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-17 21:01
 */
@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Override
    public List<PostsDTO> findAllByPage() {
        List<PostsDO> allByPage = postsRepository.findAllByPage();
        List<PostsDTO> lists = new ArrayList<>();
        for (PostsDO postsDO : allByPage) {
            PostsDTO postsDTO = new PostsDTO();
            BeanCopierUtil.transDOToDTO(postsDO,postsDTO);
            lists.add(postsDTO);
        }
        return lists;
    }
}
