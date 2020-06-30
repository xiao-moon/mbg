package com.moon.mapper;

import com.moon.model.entity.AttachmentsMenus;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: AttachmentsMenusMapper
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Mapper
public interface AttachmentsMenusMapper{

    /**
    * 查询单个
    */
    AttachmentsMenus selectAttachmentsMenusById(Integer id);


    /**
    * 查询列表
    */
    List<AttachmentsMenus> selectAttachmentsMenusList(AttachmentsMenus attachmentsMenus);

    /**
    * 新增
    */
    int insertAttachmentsMenus(AttachmentsMenus attachmentsMenus);

    /**
    * 修改
    */
    int updateAttachmentsMenus(AttachmentsMenus attachmentsMenus);

    /**
    * 删除
    */
    int deleteAttachmentsMenusById(Integer id);

    /**
    * 批量删除
    */
    int deleteAttachmentsMenusByIds(String[] ids);
}
