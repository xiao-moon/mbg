package com.moon.service.impl;

import com.moon.model.entity.Attachment;
import com.moon.model.entity.AttachmentPost;
import com.moon.service.AttachmentService;
import com.moon.mapper.AttachmentMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 附件表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class AttachmentServiceImpl implements AttachmentService{

    @Autowired
    private AttachmentMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Attachment findById(Integer id){
        Attachment model = new Attachment();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Attachment> findList(Attachment attachment){
        return mapper.selectListBy(attachment);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Attachment attachment){
        return mapper.insertSelective(attachment);
    }

    /**
    * 修改
    */
    @Override
    public int update(Attachment attachment){
        return mapper.updateByIdSelective(attachment);
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
    public int delete(Attachment attachment){
        return mapper.deleteBy(attachment);
    }





}
