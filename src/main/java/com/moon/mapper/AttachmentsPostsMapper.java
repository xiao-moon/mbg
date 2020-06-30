package com.moon.mapper;

import com.moon.model.entity.AttachmentsPosts;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: AttachmentsPostsMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface AttachmentsPostsMapper{

    /**
    * 查询单个
    */
    AttachmentsPosts selectAttachmentsPostsById(Integer id);


    /**
    * 查询列表
    */
    List<AttachmentsPosts> selectAttachmentsPostsList(AttachmentsPosts attachmentsPosts);

    /**
    * 新增
    */
    int insertAttachmentsPosts(AttachmentsPosts attachmentsPosts);

    /**
    * 修改
    */
    int updateAttachmentsPosts(AttachmentsPosts attachmentsPosts);

    /**
    * 删除
    */
    int deleteAttachmentsPostsById(Integer id);

    /**
    * 批量删除
    */
    int deleteAttachmentsPostsByIds(String[] ids);
}
