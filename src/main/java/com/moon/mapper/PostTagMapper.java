package com.moon.mapper;

import com.moon.model.entity.PostTag;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 文章标签关联表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface PostTagMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, post_id, tag_id, priority, create_time, update_time " +
            "FROM post_tag " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"tagId != null \"> and tag_id = #{tagId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    PostTag selectOneBy(PostTag postTag);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, post_id, tag_id, priority, create_time, update_time " +
            "FROM post_tag " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"tagId != null \"> and tag_id = #{tagId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "   </where> " +
            "</script> "
    )
    List<PostTag> selectListBy(PostTag postTag);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM post_tag " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"tagId != null \"> and tag_id = #{tagId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(PostTag postTag);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO post_tag " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"postId != null \">post_id,</if>" +
            "       <if test=\"tagId != null \">tag_id,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"postId != null \">#{postId},</if>" +
            "       <if test=\"tagId != null \">#{tagId},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(PostTag postTag);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE post_tag " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"postId != null \">post_id = #{postId},</if>" +
            "        <if test=\"tagId != null \">tag_id = #{tagId},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(PostTag postTag);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM post_tag " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"postId != null \">and post_id = #{postId}</if>" +
            "        <if test=\"tagId != null \">and tag_id = #{tagId}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(PostTag postTag);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM post_tag " +
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
    @Delete("DELETE FROM post_tag WHERE id = #{id} ")
    int deleteById(Integer id);

}
