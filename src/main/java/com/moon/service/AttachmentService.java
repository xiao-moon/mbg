package com.moon.service;

import com.moon.model.entity.Attachment;
import java.util.List;

/**
 * @description 附件表
 * @author moon
 * @date 2023-09-21 17:29:23
 */
public interface AttachmentService {

    /**
    * 查询单个
    */
    Attachment findById(Integer id);

    /**
    * 查询列表
    */
    List<Attachment> findList(Attachment attachment);

    /**
    * 新增
    */
    int insert(Attachment attachment);

    /**
    * 修改
    */
    int update(Attachment attachment);

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
    int delete(Attachment attachment);


}