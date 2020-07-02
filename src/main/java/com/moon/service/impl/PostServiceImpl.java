package com.moon.service.impl;

import com.moon.mapper.PostsMapper;
import com.moon.model.entity.Posts;
import com.moon.model.entity.Tags;
import com.moon.model.vo.PostsVO;
import com.moon.model.vo.SubPostsVO;
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
import java.util.*;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-01 03:37
 */
@Service
public class PostServiceImpl implements PostService {

    @Resource
    private PostsMapper postsMapper;

    @Override
    public List<PostsVO> findIndexPosts() {
        List<Posts> posts = postsMapper.selectIndexPosts();
        List<PostsVO> postsVO = new ArrayList<>();
        doToVo(posts, postsVO);
        return postsVO;
    }

    @Override
    public List<PostsVO> findAllPostsByTime() {
        List<Posts> posts = postsMapper.selectSimplePostsList();
        List<PostsVO> postsVOS = new ArrayList<>();
        Map<String, List<SubPostsVO>> map = new HashMap<>();
        //转换领域模型
        for (Posts post : posts) {
            Date createTime = post.getCreateTime();
            String monthDate = new SimpleDateFormat("yyyy年MM月").format(createTime);
            String substring = monthDate.substring(5, 6);
            if (substring.equals("0")) {
                monthDate = monthDate.substring(0, 5) + monthDate.substring(6);
            }
            String ct = new SimpleDateFormat("MM-dd").format(createTime);
            SubPostsVO postsVO = new SubPostsVO();
            postsVO.setCreateTime(ct);
            postsVO.setTemp(createTime);
            postsVO.setId(String.valueOf(post.getId()));
            postsVO.setTitle(post.getTitle());
            List<SubPostsVO> subPostsVOS = null;
            if (map.containsKey(monthDate)) {
                subPostsVOS = map.get(monthDate);
            } else {
                subPostsVOS = new ArrayList<>();
            }
            subPostsVOS.add(postsVO);
            map.put(monthDate, subPostsVOS);
        }
        //对月份文章按照时间轴排序
        for (String month : map.keySet()) {
            List<SubPostsVO> subPostsVOS = map.get(month);
            subPostsVOS.sort((subPostsVO1, subPostsVO2) -> {
                Date temp1 = (Date) subPostsVO1.getTemp();
                Date temp2 = (Date) subPostsVO2.getTemp();
                if (temp1.after(temp2)) {
                    return -1;
                }
                if (temp1.before(temp2)) {
                    return 1;
                }
                return 0;
            });
            PostsVO postsVO = new PostsVO();
            postsVO.setMonthData(month);
            postsVO.setTemp(subPostsVOS.get(0).getTemp());
            postsVO.setSubPostsVOS(subPostsVOS);
            postsVOS.add(postsVO);
        }
        postsVOS.sort((postsVO1, postsVO2) -> {
            Date temp1 = (Date) postsVO1.getTemp();
            Date temp2 = (Date) postsVO2.getTemp();
            if (temp1.after(temp2)) {
                return -1;
            }
            if (temp1.before(temp2)) {
                return 1;
            }
            return 0;
        });
        return postsVOS;
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
                if (post.getMetaDescription() != null) {
                    postVO.setMetaDescription(post.getMetaDescription());
                }
                if (post.getMetaKeywords() != null) {
                    postVO.setMetaKeywords(post.getMetaKeywords());
                }
                if (post.getTitle() != null) {
                    postVO.setTitle(post.getTitle());
                }
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
                if (post.getAttachment() != null) {
                    postVO.setAttachmentUrl(post.getAttachment().getUrl());
                    postVO.setAttachmentName(post.getAttachment().getName());
                }
                if (post.getTag() != null) {
                    postVO.setTagId(String.valueOf(post.getTag().getId()));
                    postVO.setTagName(post.getTag().getName());
                }
                if (post.getComments() != null) {
                    postVO.setCommentCount(String.valueOf(post.getComments().getCount()));
                } else {
                    postVO.setCommentCount("0");
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
