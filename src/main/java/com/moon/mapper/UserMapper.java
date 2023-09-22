package com.moon.mapper;

import com.moon.model.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 用户表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface UserMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, avatar, description, email, expire_time, nickname, password, username, create_time, update_time " +
            "FROM user " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"avatar != null  and avatar != ''\"> and avatar = #{avatar}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"nickname != null  and nickname != ''\"> and nickname = #{nickname}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"username != null  and username != ''\"> and username = #{username}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    User selectOneBy(User user);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, avatar, description, email, expire_time, nickname, password, username, create_time, update_time " +
            "FROM user " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"avatar != null  and avatar != ''\"> and avatar = #{avatar}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"nickname != null  and nickname != ''\"> and nickname = #{nickname}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"username != null  and username != ''\"> and username = #{username}</if>" +
            "   </where> " +
            "</script> "
    )
    List<User> selectListBy(User user);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM user " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"avatar != null  and avatar != ''\"> and avatar = #{avatar}</if>" +
            "        <if test=\"description != null  and description != ''\"> and description = #{description}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"nickname != null  and nickname != ''\"> and nickname = #{nickname}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"username != null  and username != ''\"> and username = #{username}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(User user);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO user " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"avatar != null  and avatar != ''\">avatar,</if>" +
            "       <if test=\"description != null  and description != ''\">description,</if>" +
            "       <if test=\"email != null  and email != ''\">email,</if>" +
            "       <if test=\"expireTime != null \">expire_time,</if>" +
            "       <if test=\"nickname != null  and nickname != ''\">nickname,</if>" +
            "       <if test=\"password != null  and password != ''\">password,</if>" +
            "       <if test=\"username != null  and username != ''\">username,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"avatar != null  and avatar != ''\">#{avatar},</if>" +
            "       <if test=\"description != null  and description != ''\">#{description},</if>" +
            "       <if test=\"email != null  and email != ''\">#{email},</if>" +
            "       <if test=\"expireTime != null \">#{expireTime},</if>" +
            "       <if test=\"nickname != null  and nickname != ''\">#{nickname},</if>" +
            "       <if test=\"password != null  and password != ''\">#{password},</if>" +
            "       <if test=\"username != null  and username != ''\">#{username},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(User user);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE user " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"avatar != null  and avatar != ''\">avatar = #{avatar},</if>" +
            "        <if test=\"description != null  and description != ''\">description = #{description},</if>" +
            "        <if test=\"email != null  and email != ''\">email = #{email},</if>" +
            "        <if test=\"expireTime != null \">expire_time = #{expireTime},</if>" +
            "        <if test=\"nickname != null  and nickname != ''\">nickname = #{nickname},</if>" +
            "        <if test=\"password != null  and password != ''\">password = #{password},</if>" +
            "        <if test=\"username != null  and username != ''\">username = #{username},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(User user);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM user " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"avatar != null  and avatar != ''\">and avatar = #{avatar}</if>" +
            "        <if test=\"description != null  and description != ''\">and description = #{description}</if>" +
            "        <if test=\"email != null  and email != ''\">and email = #{email}</if>" +
            "        <if test=\"nickname != null  and nickname != ''\">and nickname = #{nickname}</if>" +
            "        <if test=\"password != null  and password != ''\">and password = #{password}</if>" +
            "        <if test=\"username != null  and username != ''\">and username = #{username}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(User user);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM user " +
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
    @Delete("DELETE FROM user WHERE id = #{id} ")
    int deleteById(Integer id);

}
