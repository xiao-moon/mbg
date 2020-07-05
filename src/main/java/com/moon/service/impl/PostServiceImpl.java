package com.moon.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.mapper.PostsMapper;
import com.moon.model.entity.Posts;
import com.moon.model.properties.BlogProperties;
import com.moon.model.vo.PostsVO;
import com.moon.model.vo.SubPostsVO;
import com.moon.service.PostService;
import com.moon.utils.BlogUtils;
import com.moon.utils.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private BlogProperties blogProperties;

    @Override
    public PageInfo findIndexPosts(int pageNum, int pageSize) {
        //分页查询
        PageHelper.startPage(pageNum, pageSize);
        List<Posts> posts = postsMapper.selectIndexPosts();
        PageInfo postsPageInfo = new PageInfo(posts);

        //转换领域模型
        List<PostsVO> postsVO = new ArrayList<>();
        doToVo(posts, postsVO);
        postsPageInfo.setList(postsVO);
        return postsPageInfo;
    }

    @Override
    public PageInfo findAllPostsByTime() {
        List<Posts> posts = postsMapper.selectSimplePostsList();
        PageInfo pageInfo = new PageInfo(posts);

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
            List<SubPostsVO> subPostsVOS;
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
            postsVO.setPosts(subPostsVOS);
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

        pageInfo.setList(postsVOS);
        return pageInfo;
    }

    @Override
    public PageInfo findSimplePostsByTags(Integer id, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Posts> posts = postsMapper.selectSimplePostsByTags(id);
        PageInfo pageInfo = new PageInfo(posts);
        List<PostsVO> list = new ArrayList<>();
        doToVo(posts, list);
        pageInfo.setList(list);
        pageInfo.setSize(list.size());
        return pageInfo;
    }

    @Override
    @Transactional
    public PageInfo findSearchPosts(String search, int pageNum, int pageSize) {
        //1.查询所有的文章信息
        List<Posts> posts = postsMapper.selectIndexPosts();
        List<Posts> tempTitles = new ArrayList<>();
        List<Posts> tempContents = new ArrayList<>();

        //2.将html解析成纯文本
        for (Posts post : posts) {
            //检查标题中是否包含search
            if (StringUtils.containsIgnoreCase(post.getTitle(), search)) {
                tempTitles.add(post);
                continue;
            }
            //检查内容中是否包含
            String formatContent = post.getFormatContent();
            String content = BlogUtils.htmlToTxt(formatContent);
            if (StringUtils.containsIgnoreCase(content, search)) {
                tempContents.add(post);
                continue;
            }
        }
        tempTitles.addAll(tempContents);
        List<PostsVO> postsVO = new ArrayList<>();
        //领域模型转换
        doToVo(tempTitles, postsVO);
        //分页
        int currIndex = pageNum * pageSize;
        PageInfo pageInfo = new PageInfo();
        if (postsVO.size() <= currIndex) {
            pageInfo.setList(postsVO);
            pageInfo.setTotal(postsVO.size());
            pageInfo.setSize(postsVO.size());
            return pageInfo;
        } else {
            List<PostsVO> postsVOS = null;
            if (pageNum == 1) {
                postsVOS = postsVO.subList(0, currIndex);
            } else {
                postsVOS = postsVO.subList(((pageNum - 1) * pageSize), currIndex);
            }
            pageInfo.setList(postsVOS);
            pageInfo.setTotal(postsVO.size());
            pageInfo.setSize(postsVOS.size());
        }
        return pageInfo;
    }

    /**
     * 领域模型转换
     */
     void doToVo(List<Posts> posts, List<PostsVO> postsVO) {
        if (CollectionUtils.isNotEmpty(posts)) {
            for (Posts post : posts) {
                PostsVO postVO = new PostsVO();
                postVO.setId(String.valueOf(post.getId()));
                postVO.setFormatContent(post.getFormatContent());
                //如果没有就为展示文字赋值
                if (StringUtils.isBlank(post.getShowContent())) {
                    String formatContent = post.getFormatContent();
                    String content = BlogUtils.htmlToTxt(formatContent);
                    if (content.length() > blogProperties.getShowContentSize()) {
                        content = content.substring(0, blogProperties.getShowContentSize());
                    }
                    content = content + "...";
                    postVO.setShowContent(content);
                } else {
                    postVO.setShowContent(post.getShowContent());
                }
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
                if (post.getVisits() != null) {
                    postVO.setVisits(String.valueOf(post.getVisits()));
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

//    /**
//     * 按照位置排序
//     */
//    private void sort(List<Tags> tags) {
//        Collections.sort(tags, new Comparator<Tags>() {
//            @Override
//            public int compare(Tags tag1, Tags tag2) {
//                int m1 = tag1.getPriority();
//                int m2 = tag2.getPriority();
//
//                if (m1 > m2) {
//                    return -1;
//                }
//                if (m1 < m2) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
//    }
}
