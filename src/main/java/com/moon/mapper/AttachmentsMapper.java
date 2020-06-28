package com.moon.mapper;

import com.moon.model.entity.Attachments;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* 描述: AttachmentsMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
public interface AttachmentsMapper extends BaseMapper<Attachments> {

    /**
    * 查询单个
    */
    public Attachments selectAttachmentsById(Integer id);


    /**
    * 查询列表
    */
    public List<Attachments> selectAttachmentsList(Attachments attachments);

    /**
    * 新增
    */
    public int insertAttachments(Attachments attachments);

    /**
    * 修改
    */
    public int updateAttachments(Attachments attachments);

    /**
    * 删除
    */
    public int deleteAttachmentsById(Integer id);

    /**
    * 批量删除
    */
    public int deleteAttachmentsByIds(String[] ids);
}
