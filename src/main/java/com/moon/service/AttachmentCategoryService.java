package com.moon.service;

import com.moon.model.entity.AttachmentCategory;
import java.util.List;

/**
 * @description 附件-文章分类关联表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface AttachmentCategoryService {

    /**
    * 查询单个
    */
    AttachmentCategory findById(Integer id);

    /**
    * 查询列表
    */
    List<AttachmentCategory> findList(AttachmentCategory attachmentCategory);

    /**
    * 新增
    */
    int insert(AttachmentCategory attachmentCategory);

    /**
    * 修改
    */
    int update(AttachmentCategory attachmentCategory);

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
    int delete(AttachmentCategory attachmentCategory);


}