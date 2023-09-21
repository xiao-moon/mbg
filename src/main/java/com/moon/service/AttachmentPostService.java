package com.moon.service;

import com.moon.model.entity.AttachmentPost;
import java.util.List;

/**
 * @description 附件-文章关联表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface AttachmentPostService {

    /**
    * 查询单个
    */
    AttachmentPost findById(Integer id);

    /**
    * 查询列表
    */
    List<AttachmentPost> findList(AttachmentPost attachmentPost);

    /**
    * 新增
    */
    int insert(AttachmentPost attachmentPost);

    /**
    * 修改
    */
    int update(AttachmentPost attachmentPost);

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
    int delete(AttachmentPost attachmentPost);


}