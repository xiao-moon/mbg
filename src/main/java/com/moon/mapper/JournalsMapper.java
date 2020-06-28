package com.moon.mapper;

import com.moon.model.entity.Journals;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: JournalsMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface JournalsMapper extends BaseMapper<Journals> {

    /**
    * 查询单个
    */
    Journals selectJournalsById(Integer id);


    /**
    * 查询列表
    */
    List<Journals> selectJournalsList(Journals journals);

    /**
    * 新增
    */
    int insertJournals(Journals journals);

    /**
    * 修改
    */
    int updateJournals(Journals journals);

    /**
    * 删除
    */
    int deleteJournalsById(Integer id);

    /**
    * 批量删除
    */
    int deleteJournalsByIds(String[] ids);
}