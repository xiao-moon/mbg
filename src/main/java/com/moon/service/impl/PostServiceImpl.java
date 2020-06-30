package com.moon.service.impl;

import com.moon.mapper.PostsMapper;
import com.moon.model.entity.Posts;
import com.moon.model.entity.Tags;
import com.moon.model.vo.PostsVO;
import com.moon.service.PostService;
import com.moon.utils.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-01 03:37
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceImpl implements PostService {

    @Resource
    private PostsMapper postsMapper;

    @Override
    @Test
    public List<PostsVO> findIndexPosts() {
        List<Posts> posts = postsMapper.selectIndexPosts();
        List<PostsVO> postsVO = new ArrayList<>();
        doToVo(posts, postsVO);
        return postsVO;
    }

    /**
     * 生成菜单树
     */
    private void doToVo(List<Posts> posts, List<PostsVO> postsVO) {
        if (CollectionUtils.isNotEmpty(posts)) {
            for (Posts post : posts) {
                PostsVO postVO = new PostsVO();
                postVO.setId(String.valueOf(post.getId()));
                postVO.setFormatContent(post.getFormatContent());
                //如果没有就为展示文字赋值
                if (StringUtils.isBlank(post.getShowContent())) {

                }
                postVO.setShowContent(post.getShowContent());
                if (post.getLikes() != null) {
                    postVO.setLikes(String.valueOf(post.getLikes()));
                }
                if (post.getPriority() != null) {
                    postVO.setPriority(String.valueOf(post.getPriority()));
                }
                postVO.setMetaDescription(post.getMetaDescription());
                postVO.setMetaKeywords(post.getMetaKeywords());
                postVO.setTitle(post.getTitle());
                if (post.getTopFlag() != null) {
                    postVO.setTopFlag(String.valueOf(post.getTopFlag()));
                }
                if (post.getTopPriority() != null) {
                    postVO.setTopPriority(String.valueOf(post.getTopPriority()));
                }
                if (post.getCreateTime() != null) {
                    postVO.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(post.getCreateTime()));
                }
                if (post.getCategory() != null) {
                    postVO.setCategoryId(String.valueOf(post.getCategory().getId()));
                    postVO.setCategoryName(post.getCategory().getName());
                }
                //todo 从tags中选取值大的作为主标签
                if (CollectionUtils.isNotEmpty(post.getTags())) {
                    this.sort(post.getTags());
                    postVO.setTagId(String.valueOf(post.getTags().get(0).getId()));
                    postVO.setTagName(post.getTags().get(0).getName());
                }
                if (post.getAttachment() != null) {
                    postVO.setAttachmentUrl(post.getAttachment().getUrl());
                    postVO.setAttachmentName(post.getAttachment().getName());
                }

                postsVO.add(postVO);
            }
        }
    }

    /**
     * 按照位置排序
     */
    private void sort(List<Tags> tags) {
        Collections.sort(tags, new Comparator<Tags>() {
            @Override
            public int compare(Tags tag1, Tags tag2) {
                int m1 = tag1.getPriority();
                int m2 = tag2.getPriority();

                if (m1 > m2) {
                    return -1;
                }
                if (m1 < m2) {
                    return 1;
                }
                return 0;
            }
        });
    }
}
