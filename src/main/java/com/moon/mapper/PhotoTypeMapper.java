package com.moon.mapper;

import com.moon.model.entity.PhotoType;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 图片分类表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface PhotoTypeMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, name, priority, status, deleted, create_time, update_time " +
            "FROM photo_type " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    PhotoType selectOneBy(PhotoType photoType);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, name, priority, status, deleted, create_time, update_time " +
            "FROM photo_type " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "</script> "
    )
    List<PhotoType> selectListBy(PhotoType photoType);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM photo_type " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(PhotoType photoType);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO photo_type " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"deleted != null \">deleted,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"deleted != null \">#{deleted},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(PhotoType photoType);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE photo_type " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"deleted != null \">deleted = #{deleted},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(PhotoType photoType);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM photo_type " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"deleted != null \">and deleted = #{deleted}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(PhotoType photoType);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM photo_type " +
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
    @Delete("DELETE FROM photo_type WHERE id = #{id} ")
    int deleteById(Integer id);

}
