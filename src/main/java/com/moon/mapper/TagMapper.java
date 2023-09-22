package com.moon.mapper;

import com.moon.model.entity.Tag;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 标签表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface TagMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, name, desc, priority, status, deleted, create_time, update_time " +
            "FROM tag " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Tag selectOneBy(Tag tag);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, name, desc, priority, status, deleted, create_time, update_time " +
            "FROM tag " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Tag> selectListBy(Tag tag);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM tag " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\"> and desc = #{desc}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Tag tag);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO tag " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"desc != null  and desc != ''\">desc,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"deleted != null \">deleted,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"desc != null  and desc != ''\">#{desc},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"deleted != null \">#{deleted},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Tag tag);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE tag " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"desc != null  and desc != ''\">desc = #{desc},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"deleted != null \">deleted = #{deleted},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Tag tag);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM tag " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"desc != null  and desc != ''\">and desc = #{desc}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"deleted != null \">and deleted = #{deleted}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Tag tag);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM tag " +
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
    @Delete("DELETE FROM tag WHERE id = #{id} ")
    int deleteById(Integer id);

}
