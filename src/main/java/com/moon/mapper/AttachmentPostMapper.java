package com.moon.mapper;

import com.moon.model.entity.AttachmentPost;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 附件-文章关联表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface AttachmentPostMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, attachment_id, post_id, create_time, update_time " +
            "FROM attachment_post " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    AttachmentPost selectOneBy(AttachmentPost attachmentPost);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, attachment_id, post_id, create_time, update_time " +
            "FROM attachment_post " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "   </where> " +
            "</script> "
    )
    List<AttachmentPost> selectListBy(AttachmentPost attachmentPost);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM attachment_post " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \"> and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(AttachmentPost attachmentPost);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO attachment_post " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">attachment_id,</if>" +
            "       <if test=\"postId != null \">post_id,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"attachmentId != null \">#{attachmentId},</if>" +
            "       <if test=\"postId != null \">#{postId},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(AttachmentPost attachmentPost);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE attachment_post " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"attachmentId != null \">attachment_id = #{attachmentId},</if>" +
            "        <if test=\"postId != null \">post_id = #{postId},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(AttachmentPost attachmentPost);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM attachment_post " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"attachmentId != null \">and attachment_id = #{attachmentId}</if>" +
            "        <if test=\"postId != null \">and post_id = #{postId}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(AttachmentPost attachmentPost);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM attachment_post " +
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
    @Delete("DELETE FROM attachment_post WHERE id = #{id} ")
    int deleteById(Integer id);

}
