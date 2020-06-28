package com.moon.mapper;

import com.moon.model.entity.Journals;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: JournalsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface JournalsMapper extends BaseMapper<Journals> {

    /**
    * 查询单个
    */
    public Journals selectJournalsById(Integer id);


    /**
    * 查询列表
    */
    public List<Journals> selectJournalsList(Journals journals);

    /**
    * 新增
    */
    public int insertJournals(Journals journals);

    /**
    * 修改
    */
    public int updateJournals(Journals journals);

    /**
    * 删除
    */
    public int deleteJournalsById(Integer id);

    /**
    * 批量删除
    */
    public int deleteJournalsByIds(String[] ids);
}
