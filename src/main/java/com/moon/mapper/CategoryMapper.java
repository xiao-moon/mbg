package com.moon.mapper;

import com.moon.model.entity.Category;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 文章分类表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface CategoryMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, parent_id, name, priority, status, del_flag, create_time, update_time " +
            "FROM category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Category selectOneBy(Category category);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, parent_id, name, priority, status, del_flag, create_time, update_time " +
            "FROM category " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Category> selectListBy(Category category);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM category " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Category category);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO category " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"parentId != null \">parent_id,</if>" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"delFlag != null \">del_flag,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"parentId != null \">#{parentId},</if>" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"delFlag != null \">#{delFlag},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Category category);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE category " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"parentId != null \">parent_id = #{parentId},</if>" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"delFlag != null \">del_flag = #{delFlag},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Category category);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM category " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"parentId != null \">and parent_id = #{parentId}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"delFlag != null \">and del_flag = #{delFlag}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Category category);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM category " +
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
    @Delete("DELETE FROM category WHERE id = #{id} ")
    int deleteById(Integer id);

}
