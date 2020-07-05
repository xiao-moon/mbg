package com.moon.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.mapper.CategoriesMapper;
import com.moon.mapper.PostsMapper;
import com.moon.model.entity.Categories;
import com.moon.model.entity.Posts;
import com.moon.model.vo.CategoriesVO;
import com.moon.model.vo.PostsVO;
import com.moon.service.CategoryService;
import com.moon.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 01:17
 */
@Service
public class CategoryServiceImpl extends PostServiceImpl implements CategoryService {

    @Autowired
    private CategoriesMapper categoriesMapper;

    @Autowired
    private PostsMapper postsMapper;

    @Override
    @Transactional
    public PageInfo findCategoriesAndPosts(int pageNum, int pageSize) {
        Categories categories = new Categories();
        categories.setStatus(0);
        categories.setDelFlag(0);
        List<Categories> csList = categoriesMapper.selectCategoriesList(categories);
        List<CategoriesVO> csvoList = new ArrayList<>();
        //生成分类树
        categoryTree(csList, csvoList);
        //将文章信息填充至分类
        findPosts(csvoList, pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(csvoList);
        pageInfo.setTotal(csvoList.size());
        pageInfo.setSize(csvoList.size());
        return pageInfo;
    }

    @Override
    public PageInfo findCategoriesAndPostsByPage(int id, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Posts> posts = postsMapper.selectPostsByCategory(id);
        List<PostsVO> postsVOS = new ArrayList<>();
        super.doToVo(posts, postsVOS);
        PageInfo pageInfo = new PageInfo(posts);
        pageInfo.setList(postsVOS);
        return pageInfo;
    }

    /**
     * 生成分类树
     */
    private void categoryTree(List<Categories> csList, List<CategoriesVO> csvoList) {
        //遍历所有分类
        for (Categories cs : csList) {
            //找到parentId为0的根分类
            if (cs.getParentId() == 0) {
                CategoriesVO csvo = new CategoriesVO();
                csvo.setId(String.valueOf(cs.getId()));
                csvo.setName(cs.getName());
                csvo.setPriority(String.valueOf(cs.getPriority()));
                subCategories(csList, cs, csvo);
                csvoList.add(csvo);
            }
        }
        if (CollectionUtils.isNotEmpty(csvoList)) {
            this.sort(csvoList);
        }
    }

    /**
     * 递归子菜单
     */
    private void subCategories(List<Categories> csList, Categories cs, CategoriesVO csvo) {
        //在遍历一遍所有菜单，找到子菜单
        List<CategoriesVO> subCsvoList = new ArrayList<>();
        for (Categories subCs : csList) {
            if (subCs.getParentId() == cs.getId()) {
                CategoriesVO subCsvo = new CategoriesVO();
                subCsvo.setId(String.valueOf(subCs.getId()));
                subCsvo.setName(subCs.getName());
                subCsvo.setPriority(String.valueOf(subCs.getPriority()));
                subCategories(csList, subCs, subCsvo);
                subCsvoList.add(subCsvo);
            }
        }
        if (CollectionUtils.isNotEmpty(subCsvoList)) {
            this.sort(subCsvoList);
            csvo.setSubCsvoList(subCsvoList);
        }
    }

    /**
     * 按照位置排序
     */
    private void sort(List<CategoriesVO> csvoList) {
        Collections.sort(csvoList, new Comparator<CategoriesVO>() {
            @Override
            public int compare(CategoriesVO csvo1, CategoriesVO csvo2) {
                int m1 = Integer.parseInt(csvo1.getPriority());
                int m2 = Integer.parseInt(csvo2.getPriority());

                if (m1 > m2) {
                    return 1;
                }
                if (m1 < m2) {
                    return -1;
                }
                return 0;
            }
        });
    }

    /**
     * 根据最小子分类查询对应的文章列表
     */
    private void findPosts(List<CategoriesVO> csvoList, int pageNum, int pageSize) {
        //根据最小子分类查询对应的文章列表
        for (CategoriesVO categoriesVO : csvoList) {
            if (CollectionUtils.isNotEmpty(categoriesVO.getSubCsvoList())) {
                //继续往下遍历
                categoriesVO.setTotal(categoriesVO.getSubCsvoList().size() + "");
                categoriesVO.setSize(categoriesVO.getSubCsvoList().size() + "");
                findPosts(categoriesVO.getSubCsvoList(), pageNum, pageSize);
            } else {
                //查询相应的文章信息并解析
                PageHelper.startPage(pageNum, pageSize);
                List<Posts> posts = postsMapper.selectPostsByCategory(Integer.parseInt(categoriesVO.getId()));
                PageInfo pageInfo = new PageInfo(posts);
                List<PostsVO> postsVOS = new ArrayList<>();
                super.doToVo(posts, postsVOS);
                categoriesVO.setTotal(pageInfo.getTotal() + "");
                categoriesVO.setSize(pageInfo.getSize() + "");
                categoriesVO.setPostsVOList(postsVOS);
            }
        }
    }

}
