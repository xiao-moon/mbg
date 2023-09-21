package com.moon.service.impl;

import com.moon.model.entity.AttachmentCategory;
import com.moon.model.entity.AttachmentMenu;
import com.moon.service.AttachmentMenuService;
import com.moon.mapper.AttachmentMenuMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 附件-菜单关联表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class AttachmentMenuServiceImpl implements AttachmentMenuService{

    @Autowired
    private AttachmentMenuMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public AttachmentMenu findById(Integer id){
        AttachmentMenu model = new AttachmentMenu();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<AttachmentMenu> findList(AttachmentMenu attachmentMenu){
        return mapper.selectListBy(attachmentMenu);
    }

    /**
    * 新增
    */
    @Override
    public int insert(AttachmentMenu attachmentMenu){
        return mapper.insertSelective(attachmentMenu);
    }

    /**
    * 修改
    */
    @Override
    public int update(AttachmentMenu attachmentMenu){
        return mapper.updateByIdSelective(attachmentMenu);
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
    public int delete(AttachmentMenu attachmentMenu){
        return mapper.deleteBy(attachmentMenu);
    }





}
