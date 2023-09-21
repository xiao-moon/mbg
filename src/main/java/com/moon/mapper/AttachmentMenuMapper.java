package com.moon.mapper;

import com.moon.model.entity.AttachmentMenu;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 附件-菜单关联表
 * @author moon
 * @date 2023-09-21 18:16:36
 */
public interface AttachmentMenuMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, attachment_id, menu_id, create_time, update_time " +
            "FROM attachment_menu " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"menuId != null \"> and menu_id = #{menuId}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    AttachmentMenu selectOneBy(AttachmentMenu attachmentMenu);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, attachment_id, menu_id, create_time, update_time " +
            "FROM attachment_menu " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"menuId != null \"> and menu_id = #{menuId}</if>" +
            "   </where> " +
            "</script> "
    )
    List<AttachmentMenu> selectListBy(AttachmentMenu attachmentMenu);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM attachment_menu " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"menuId != null \"> and menu_id = #{menuId}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(AttachmentMenu attachmentMenu);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO attachment_menu " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">attachment_id,</if>" +
            "       <if test=\"menuId != null \">menu_id,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">#{attachmentId},</if>" +
            "       <if test=\"menuId != null \">#{menuId},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(AttachmentMenu attachmentMenu);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE attachment_menu " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"attachmentId != null \">attachment_id = #{attachmentId},</if>" +
            "        <if test=\"menuId != null \">menu_id = #{menuId},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(AttachmentMenu attachmentMenu);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM attachment_menu " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \">and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"menuId != null \">and menu_id = #{menuId}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(AttachmentMenu attachmentMenu);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM attachment_menu " +
            "WHERE id IN " +
            "   <foreach item='id' collection='ids' open='(' separator=',' close=')'> " +
            "      #{id} " +
            "   </foreach> " +
            "</script>"
    )
    int deleteByIds(Integer[] ids);

    /**
     * 主键删除
     */
    @Delete("DELETE FROM attachment_menu WHERE id = #{id} ")
    int deleteById(Integer id);

}
