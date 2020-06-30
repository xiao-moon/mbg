package com.moon.mapper;

import com.moon.model.entity.AttachmentsCategories;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: AttachmentsCategoriesMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface AttachmentsCategoriesMapper{

    /**
    * 查询单个
    */
    AttachmentsCategories selectAttachmentsCategoriesById(Integer id);


    /**
    * 查询列表
    */
    List<AttachmentsCategories> selectAttachmentsCategoriesList(AttachmentsCategories attachmentsCategories);

    /**
    * 新增
    */
    int insertAttachmentsCategories(AttachmentsCategories attachmentsCategories);

    /**
    * 修改
    */
    int updateAttachmentsCategories(AttachmentsCategories attachmentsCategories);

    /**
    * 删除
    */
    int deleteAttachmentsCategoriesById(Integer id);

    /**
    * 批量删除
    */
    int deleteAttachmentsCategoriesByIds(String[] ids);
}
