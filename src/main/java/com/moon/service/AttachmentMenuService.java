package com.moon.service;

import com.moon.model.entity.AttachmentMenu;
import java.util.List;

/**
 * @description 附件-菜单关联表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface AttachmentMenuService {

    /**
    * 查询单个
    */
    AttachmentMenu findById(Integer id);

    /**
    * 查询列表
    */
    List<AttachmentMenu> findList(AttachmentMenu attachmentMenu);

    /**
    * 新增
    */
    int insert(AttachmentMenu attachmentMenu);

    /**
    * 修改
    */
    int update(AttachmentMenu attachmentMenu);

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
    int delete(AttachmentMenu attachmentMenu);


}