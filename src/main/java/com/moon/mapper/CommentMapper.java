package com.moon.mapper;

import com.moon.model.entity.Comment;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 评论表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface CommentMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, parent_id, response_id, author, author_url, content, email, ip_address, is_admin, post_id, top_flag, top_priority, user_agent, allow_notification, deleted, create_time, update_time " +
            "FROM comment " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"responseId != null \"> and response_id = #{responseId}</if>" +
            "        <if test=\"author != null  and author != ''\"> and author = #{author}</if>" +
            "        <if test=\"authorUrl != null  and authorUrl != ''\"> and author_url = #{authorUrl}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"ipAddress != null  and ipAddress != ''\"> and ip_address = #{ipAddress}</if>" +
            "        <if test=\"isAdmin != null \"> and is_admin = #{isAdmin}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"userAgent != null  and userAgent != ''\"> and user_agent = #{userAgent}</if>" +
            "        <if test=\"allowNotification != null \"> and allow_notification = #{allowNotification}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Comment selectOneBy(Comment comment);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, parent_id, response_id, author, author_url, content, email, ip_address, is_admin, post_id, top_flag, top_priority, user_agent, allow_notification, deleted, create_time, update_time " +
            "FROM comment " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"responseId != null \"> and response_id = #{responseId}</if>" +
            "        <if test=\"author != null  and author != ''\"> and author = #{author}</if>" +
            "        <if test=\"authorUrl != null  and authorUrl != ''\"> and author_url = #{authorUrl}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"ipAddress != null  and ipAddress != ''\"> and ip_address = #{ipAddress}</if>" +
            "        <if test=\"isAdmin != null \"> and is_admin = #{isAdmin}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"userAgent != null  and userAgent != ''\"> and user_agent = #{userAgent}</if>" +
            "        <if test=\"allowNotification != null \"> and allow_notification = #{allowNotification}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Comment> selectListBy(Comment comment);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM comment " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"parentId != null \"> and parent_id = #{parentId}</if>" +
            "        <if test=\"responseId != null \"> and response_id = #{responseId}</if>" +
            "        <if test=\"author != null  and author != ''\"> and author = #{author}</if>" +
            "        <if test=\"authorUrl != null  and authorUrl != ''\"> and author_url = #{authorUrl}</if>" +
            "        <if test=\"content != null  and content != ''\"> and content = #{content}</if>" +
            "        <if test=\"email != null  and email != ''\"> and email = #{email}</if>" +
            "        <if test=\"ipAddress != null  and ipAddress != ''\"> and ip_address = #{ipAddress}</if>" +
            "        <if test=\"isAdmin != null \"> and is_admin = #{isAdmin}</if>" +
            "        <if test=\"postId != null \"> and post_id = #{postId}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"userAgent != null  and userAgent != ''\"> and user_agent = #{userAgent}</if>" +
            "        <if test=\"allowNotification != null \"> and allow_notification = #{allowNotification}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Comment comment);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO comment " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"parentId != null \">parent_id,</if>" +
            "       <if test=\"responseId != null \">response_id,</if>" +
            "       <if test=\"author != null  and author != ''\">author,</if>" +
            "       <if test=\"authorUrl != null  and authorUrl != ''\">author_url,</if>" +
            "       <if test=\"content != null  and content != ''\">content,</if>" +
            "       <if test=\"email != null  and email != ''\">email,</if>" +
            "       <if test=\"ipAddress != null  and ipAddress != ''\">ip_address,</if>" +
            "       <if test=\"isAdmin != null \">is_admin,</if>" +
            "       <if test=\"postId != null \">post_id,</if>" +
            "       <if test=\"topFlag != null \">top_flag,</if>" +
            "       <if test=\"topPriority != null \">top_priority,</if>" +
            "       <if test=\"userAgent != null  and userAgent != ''\">user_agent,</if>" +
            "       <if test=\"allowNotification != null \">allow_notification,</if>" +
            "       <if test=\"deleted != null \">deleted,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"parentId != null \">#{parentId},</if>" +
            "       <if test=\"responseId != null \">#{responseId},</if>" +
            "       <if test=\"author != null  and author != ''\">#{author},</if>" +
            "       <if test=\"authorUrl != null  and authorUrl != ''\">#{authorUrl},</if>" +
            "       <if test=\"content != null  and content != ''\">#{content},</if>" +
            "       <if test=\"email != null  and email != ''\">#{email},</if>" +
            "       <if test=\"ipAddress != null  and ipAddress != ''\">#{ipAddress},</if>" +
            "       <if test=\"isAdmin != null \">#{isAdmin},</if>" +
            "       <if test=\"postId != null \">#{postId},</if>" +
            "       <if test=\"topFlag != null \">#{topFlag},</if>" +
            "       <if test=\"topPriority != null \">#{topPriority},</if>" +
            "       <if test=\"userAgent != null  and userAgent != ''\">#{userAgent},</if>" +
            "       <if test=\"allowNotification != null \">#{allowNotification},</if>" +
            "       <if test=\"deleted != null \">#{deleted},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Comment comment);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE comment " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"parentId != null \">parent_id = #{parentId},</if>" +
            "        <if test=\"responseId != null \">response_id = #{responseId},</if>" +
            "        <if test=\"author != null  and author != ''\">author = #{author},</if>" +
            "        <if test=\"authorUrl != null  and authorUrl != ''\">author_url = #{authorUrl},</if>" +
            "        <if test=\"content != null  and content != ''\">content = #{content},</if>" +
            "        <if test=\"email != null  and email != ''\">email = #{email},</if>" +
            "        <if test=\"ipAddress != null  and ipAddress != ''\">ip_address = #{ipAddress},</if>" +
            "        <if test=\"isAdmin != null \">is_admin = #{isAdmin},</if>" +
            "        <if test=\"postId != null \">post_id = #{postId},</if>" +
            "        <if test=\"topFlag != null \">top_flag = #{topFlag},</if>" +
            "        <if test=\"topPriority != null \">top_priority = #{topPriority},</if>" +
            "        <if test=\"userAgent != null  and userAgent != ''\">user_agent = #{userAgent},</if>" +
            "        <if test=\"allowNotification != null \">allow_notification = #{allowNotification},</if>" +
            "        <if test=\"deleted != null \">deleted = #{deleted},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Comment comment);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM comment " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"parentId != null \">and parent_id = #{parentId}</if>" +
            "        <if test=\"responseId != null \">and response_id = #{responseId}</if>" +
            "        <if test=\"author != null  and author != ''\">and author = #{author}</if>" +
            "        <if test=\"authorUrl != null  and authorUrl != ''\">and author_url = #{authorUrl}</if>" +
            "        <if test=\"content != null  and content != ''\">and content = #{content}</if>" +
            "        <if test=\"email != null  and email != ''\">and email = #{email}</if>" +
            "        <if test=\"ipAddress != null  and ipAddress != ''\">and ip_address = #{ipAddress}</if>" +
            "        <if test=\"isAdmin != null \">and is_admin = #{isAdmin}</if>" +
            "        <if test=\"postId != null \">and post_id = #{postId}</if>" +
            "        <if test=\"topFlag != null \">and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \">and top_priority = #{topPriority}</if>" +
            "        <if test=\"userAgent != null  and userAgent != ''\">and user_agent = #{userAgent}</if>" +
            "        <if test=\"allowNotification != null \">and allow_notification = #{allowNotification}</if>" +
            "        <if test=\"deleted != null \">and deleted = #{deleted}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Comment comment);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM comment " +
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
    @Delete("DELETE FROM comment WHERE id = #{id} ")
    int deleteById(Integer id);

}
