package com.moon.service.impl;

import com.moon.model.entity.AttachmentMenu;
import com.moon.model.entity.AttachmentPost;
import com.moon.service.AttachmentPostService;
import com.moon.mapper.AttachmentPostMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 附件-文章关联表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class AttachmentPostServiceImpl implements AttachmentPostService{

    @Autowired
    private AttachmentPostMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public AttachmentPost findById(Integer id){
        AttachmentPost model = new AttachmentPost();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<AttachmentPost> findList(AttachmentPost attachmentPost){
        return mapper.selectListBy(attachmentPost);
    }

    /**
    * 新增
    */
    @Override
    public int insert(AttachmentPost attachmentPost){
        return mapper.insertSelective(attachmentPost);
    }

    /**
    * 修改
    */
    @Override
    public int update(AttachmentPost attachmentPost){
        return mapper.updateByIdSelective(attachmentPost);
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
    public int delete(AttachmentPost attachmentPost){
        return mapper.deleteBy(attachmentPost);
    }





}
