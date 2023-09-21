package com.moon.service;

import com.moon.model.entity.Journal;
import java.util.List;

/**
 * @description 日记表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface JournalService {

    /**
    * 查询单个
    */
    Journal findById(Integer id);

    /**
    * 查询列表
    */
    List<Journal> findList(Journal journal);

    /**
    * 新增
    */
    int insert(Journal journal);

    /**
    * 修改
    */
    int update(Journal journal);

    /**
    * 删除
    */
    int deleteById(Integer id);

    /**
    * 批量删除
    */
    int deleteByIds(Integer[] ids);

    /**
    * 条件删除
    */
    int delete(Journal journal);


}