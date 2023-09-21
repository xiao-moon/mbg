package com.moon.mapper;

import com.moon.model.entity.Journal;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 日记表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface JournalMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, content, status, del_flag, create_time, update_time, likes " +
            "FROM journal " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Journal selectOneBy(Journal journal);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, content, status, del_flag, create_time, update_time, likes " +
            "FROM journal " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Journal> selectListBy(Journal journal);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM journal " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Journal journal);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO journal " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"content != null  and content != ''\">content,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"delFlag != null \">del_flag,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "       <if test=\"likes != null \">likes,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"content != null  and content != ''\">#{content},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"delFlag != null \">#{delFlag},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "       <if test=\"likes != null \">#{likes},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Journal journal);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE journal " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"content != null  and content != ''\">content = #{content},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"delFlag != null \">del_flag = #{delFlag},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "        <if test=\"likes != null \">likes = #{likes},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Journal journal);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM journal " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"content != null  and content != ''\">and content = #{content}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"delFlag != null \">and del_flag = #{delFlag}</if>" +
            "        <if test=\"likes != null \">and likes = #{likes}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Journal journal);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM journal " +
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
    @Delete("DELETE FROM journal WHERE id = #{id} ")
    int deleteById(Integer id);

}
