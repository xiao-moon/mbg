package com.moon.mapper;

import com.moon.model.entity.PostCategory;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 菜单文章关联表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface PostCategoryMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, category_id, post_id, create_time, update_time " +
            "FROM post_category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    PostCategory selectOneBy(PostCategory postCategory);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, category_id, post_id, create_time, update_time " +
            "FROM post_category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "   </where> " +
            "</script> "
    )
    List<PostCategory> selectListBy(PostCategory postCategory);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM post_category " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"categoryId != null \"> and category_id = #{categoryId}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(PostCategory postCategory);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO post_category " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"categoryId != null \">category_id,</if>" +
            "       <if test=\"postId != null \">post_id,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"categoryId != null \">#{categoryId},</if>" +
            "       <if test=\"postId != null \">#{postId},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(PostCategory postCategory);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE post_category " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"categoryId != null \">category_id = #{categoryId},</if>" +
            "        <if test=\"postId != null \">post_id = #{postId},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(PostCategory postCategory);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM post_category " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"categoryId != null \">and category_id = #{categoryId}</if>" +
            "        <if test=\"postId != null \">and post_id = #{postId}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(PostCategory postCategory);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM post_category " +
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
    @Delete("DELETE FROM post_category WHERE id = #{id} ")
    int deleteById(Integer id);

}
