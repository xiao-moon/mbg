package com.moon.mapper;

import com.moon.model.entity.Menu;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 菜单表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface MenuMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, icon, name, desc, parent_id, priority, target, url, status, deleted, categories_flag, create_time, update_time " +
            "FROM menu " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"icon != null  and icon != ''\"> and icon = #{icon}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"target != null  and target != ''\"> and target = #{target}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "        <if test=\"categoriesFlag != null \"> and categories_flag = #{categoriesFlag}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Menu selectOneBy(Menu menu);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, icon, name, desc, parent_id, priority, target, url, status, deleted, categories_flag, create_time, update_time " +
            "FROM menu " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"icon != null  and icon != ''\"> and icon = #{icon}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"target != null  and target != ''\"> and target = #{target}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "        <if test=\"categoriesFlag != null \"> and categories_flag = #{categoriesFlag}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Menu> selectListBy(Menu menu);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM menu " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"icon != null  and icon != ''\"> and icon = #{icon}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"target != null  and target != ''\"> and target = #{target}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "        <if test=\"categoriesFlag != null \"> and categories_flag = #{categoriesFlag}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Menu menu);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO menu " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"icon != null  and icon != ''\">icon,</if>" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"desc != null  and desc != ''\">desc,</if>" +
            "       <if test=\"parentId != null \">parent_id,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"target != null  and target != ''\">target,</if>" +
            "       <if test=\"url != null  and url != ''\">url,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"deleted != null \">deleted,</if>" +
            "       <if test=\"categoriesFlag != null \">categories_flag,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"icon != null  and icon != ''\">#{icon},</if>" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"desc != null  and desc != ''\">#{desc},</if>" +
            "       <if test=\"parentId != null \">#{parentId},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"target != null  and target != ''\">#{target},</if>" +
            "       <if test=\"url != null  and url != ''\">#{url},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"deleted != null \">#{deleted},</if>" +
            "       <if test=\"categoriesFlag != null \">#{categoriesFlag},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Menu menu);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE menu " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"icon != null  and icon != ''\">icon = #{icon},</if>" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"desc != null  and desc != ''\">desc = #{desc},</if>" +
            "        <if test=\"parentId != null \">parent_id = #{parentId},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"target != null  and target != ''\">target = #{target},</if>" +
            "        <if test=\"url != null  and url != ''\">url = #{url},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"deleted != null \">deleted = #{deleted},</if>" +
            "        <if test=\"categoriesFlag != null \">categories_flag = #{categoriesFlag},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Menu menu);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM menu " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"icon != null  and icon != ''\">and icon = #{icon}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\">and desc = #{desc}</if>" +
            "        <if test=\"parentId != null \">and parent_id = #{parentId}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"target != null  and target != ''\">and target = #{target}</if>" +
            "        <if test=\"url != null  and url != ''\">and url = #{url}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"deleted != null \">and deleted = #{deleted}</if>" +
            "        <if test=\"categoriesFlag != null \">and categories_flag = #{categoriesFlag}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Menu menu);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM menu " +
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
    @Delete("DELETE FROM menu WHERE id = #{id} ")
    int deleteById(Integer id);

}
