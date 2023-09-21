package com.moon.service.impl;

import com.moon.model.entity.AttachmentCategory;
import com.moon.service.AttachmentCategoryService;
import com.moon.mapper.AttachmentCategoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 附件-文章分类关联表
 * @author moon
 * @date 2023-09-21 17:37:24
 */
@Service
public class AttachmentCategoryServiceImpl implements AttachmentCategoryService{

    @Autowired
    private AttachmentCategoryMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public AttachmentCategory findById(Integer id){
        AttachmentCategory model = new AttachmentCategory();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<AttachmentCategory> findList(AttachmentCategory attachmentCategory){
        return mapper.selectListBy(attachmentCategory);
    }

    /**
    * 新增
    */
    @Override
    public int insert(AttachmentCategory attachmentCategory){
        return mapper.insertSelective(attachmentCategory);
    }

    /**
    * 修改
    */
    @Override
    public int update(AttachmentCategory attachmentCategory){
        return mapper.updateByIdSelective(attachmentCategory);
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
    public int delete(AttachmentCategory attachmentCategory){
        return mapper.deleteBy(attachmentCategory);
    }





}
