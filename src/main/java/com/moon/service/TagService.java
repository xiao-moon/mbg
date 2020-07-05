package com.moon.service;

import com.github.pagehelper.PageInfo;

/**
 * 描述:
 * 创建人：小月
 * 创建时间：2020-07-03 12:27
 */
public interface TagService {

    /**
     * 查找所有的标签，并按照时间排序
     */
    PageInfo findTagsOrderByPriorityAndTime();


}
