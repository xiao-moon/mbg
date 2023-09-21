package com.moon.mapper;

import com.moon.model.entity.Photo;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 图片表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface PhotoMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, name, description, location, url, type, priority, status, del_flag, create_time, update_time " +
            "FROM photo " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"location != null  and location != ''\"> and location = #{location}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"type != null \"> and type = #{type}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Photo selectOneBy(Photo photo);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, name, description, location, url, type, priority, status, del_flag, create_time, update_time " +
            "FROM photo " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"location != null  and location != ''\"> and location = #{location}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"type != null \"> and type = #{type}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Photo> selectListBy(Photo photo);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM photo " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"location != null  and location != ''\"> and location = #{location}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"type != null \"> and type = #{type}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Photo photo);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO photo " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"description != null  and description != ''\">description,</if>" +
            "       <if test=\"location != null  and location != ''\">location,</if>" +
            "       <if test=\"url != null  and url != ''\">url,</if>" +
            "       <if test=\"type != null \">type,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"delFlag != null \">del_flag,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"description != null  and description != ''\">#{description},</if>" +
            "       <if test=\"location != null  and location != ''\">#{location},</if>" +
            "       <if test=\"url != null  and url != ''\">#{url},</if>" +
            "       <if test=\"type != null \">#{type},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"delFlag != null \">#{delFlag},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Photo photo);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE photo " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"description != null  and description != ''\">description = #{description},</if>" +
            "        <if test=\"location != null  and location != ''\">location = #{location},</if>" +
            "        <if test=\"url != null  and url != ''\">url = #{url},</if>" +
            "        <if test=\"type != null \">type = #{type},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"delFlag != null \">del_flag = #{delFlag},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Photo photo);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM photo " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"description != null  and description != ''\">and description = #{description}</if>" +
            "        <if test=\"location != null  and location != ''\">and location = #{location}</if>" +
            "        <if test=\"url != null  and url != ''\">and url = #{url}</if>" +
            "        <if test=\"type != null \">and type = #{type}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"delFlag != null \">and del_flag = #{delFlag}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Photo photo);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM photo " +
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
    @Delete("DELETE FROM photo WHERE id = #{id} ")
    int deleteById(Integer id);

}
