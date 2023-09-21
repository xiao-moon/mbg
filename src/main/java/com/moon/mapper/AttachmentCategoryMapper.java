package com.moon.mapper;

import com.moon.model.entity.AttachmentCategory;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 附件-文章分类关联表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface AttachmentCategoryMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, attachment_id, category_id, create_time, update_time " +
            "FROM attachment_category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    AttachmentCategory selectOneBy(AttachmentCategory attachmentCategory);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, attachment_id, category_id, create_time, update_time " +
            "FROM attachment_category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
            "   </where> " +
            "</script> "
    )
    List<AttachmentCategory> selectListBy(AttachmentCategory attachmentCategory);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM attachment_category " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(AttachmentCategory attachmentCategory);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO attachment_category " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">attachment_id,</if>" +
            "       <if test=\"categoryId != null \">category_id,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">#{attachmentId},</if>" +
            "       <if test=\"categoryId != null \">#{categoryId},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(AttachmentCategory attachmentCategory);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE attachment_category " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"attachmentId != null \">attachment_id = #{attachmentId},</if>" +
            "        <if test=\"categoryId != null \">category_id = #{categoryId},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(AttachmentCategory attachmentCategory);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM attachment_category " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \">and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"categoryId != null \">and category_id = #{categoryId}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(AttachmentCategory attachmentCategory);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM attachment_category " +
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
    @Delete("DELETE FROM attachment_category WHERE id = #{id} ")
    int deleteById(Integer id);

}
