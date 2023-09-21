package com.moon.service.impl;

import com.moon.model.entity.Comment;
import com.moon.model.entity.Journal;
import com.moon.service.JournalService;
import com.moon.mapper.JournalMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 日记表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class JournalServiceImpl implements JournalService{

    @Autowired
    private JournalMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Journal findById(Integer id){
        Journal model = new Journal();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Journal> findList(Journal journal){
        return mapper.selectListBy(journal);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Journal journal){
        return mapper.insertSelective(journal);
    }

    /**
    * 修改
    */
    @Override
    public int update(Journal journal){
        return mapper.updateByIdSelective(journal);
    }

    /**
    * 删除
    */
    @Override
    public int deleteById(Integer id){
        return mapper.deleteById(id);
    }

    /**
    * 批量删除
    */
    @Override
    public int deleteByIds(Integer[] ids){
        return mapper.deleteByIds(ids);
    }

    /**
    * 条件删除
    */
    @Override
    public int delete(Journal journal){
        return mapper.deleteBy(journal);
    }





}
