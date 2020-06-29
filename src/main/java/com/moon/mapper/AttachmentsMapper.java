package com.moon.mapper;

import com.moon.model.entity.Attachments;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: AttachmentsMapper
* 创建人: 小月
* 创建时间: 2020-06-29 20:23:44
**/
@Mapper
public interface AttachmentsMapper{

    /**
    * 查询单个
    */
    Attachments selectAttachmentsById(Integer id);


    /**
    * 查询列表
    */
    List<Attachments> selectAttachmentsList(Attachments attachments);

    /**
    * 新增
    */
    int insertAttachments(Attachments attachments);

    /**
    * 修改
    */
    int updateAttachments(Attachments attachments);

    /**
    * 删除
    */
    int deleteAttachmentsById(Integer id);

    /**
    * 批量删除
    */
    int deleteAttachmentsByIds(String[] ids);
}
