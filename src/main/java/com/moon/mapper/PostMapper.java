package com.moon.mapper;

import com.moon.model.entity.Post;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 文章表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
public interface PostMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, format_content, original_content, show_content, likes, priority, meta_description, meta_keywords, password, title, export_title, export_priority, visits, top_flag, top_priority, editor_type, disallow_comment, status, deleted, edit_time, create_time, update_time " +
            "FROM post " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"formatContent != null  and formatContent != ''\"> and format_content = #{formatContent}</if>" +
            "        <if test=\"originalContent != null  and originalContent != ''\"> and original_content = #{originalContent}</if>" +
            "        <if test=\"showContent != null  and showContent != ''\"> and show_content = #{showContent}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"metaDescription != null  and metaDescription != ''\"> and meta_description = #{metaDescription}</if>" +
            "        <if test=\"metaKeywords != null  and metaKeywords != ''\"> and meta_keywords = #{metaKeywords}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"title != null  and title != ''\"> and title = #{title}</if>" +
            "        <if test=\"exportTitle != null  and exportTitle != ''\"> and export_title = #{exportTitle}</if>" +
            "        <if test=\"exportPriority != null \"> and export_priority = #{exportPriority}</if>" +
            "        <if test=\"visits != null \"> and visits = #{visits}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"editorType != null \"> and editor_type = #{editorType}</if>" +
            "        <if test=\"disallowComment != null \"> and disallow_comment = #{disallowComment}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Post selectOneBy(Post post);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, format_content, original_content, show_content, likes, priority, meta_description, meta_keywords, password, title, export_title, export_priority, visits, top_flag, top_priority, editor_type, disallow_comment, status, deleted, edit_time, create_time, update_time " +
            "FROM post " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"formatContent != null  and formatContent != ''\"> and format_content = #{formatContent}</if>" +
            "        <if test=\"originalContent != null  and originalContent != ''\"> and original_content = #{originalContent}</if>" +
            "        <if test=\"showContent != null  and showContent != ''\"> and show_content = #{showContent}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"metaDescription != null  and metaDescription != ''\"> and meta_description = #{metaDescription}</if>" +
            "        <if test=\"metaKeywords != null  and metaKeywords != ''\"> and meta_keywords = #{metaKeywords}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"title != null  and title != ''\"> and title = #{title}</if>" +
            "        <if test=\"exportTitle != null  and exportTitle != ''\"> and export_title = #{exportTitle}</if>" +
            "        <if test=\"exportPriority != null \"> and export_priority = #{exportPriority}</if>" +
            "        <if test=\"visits != null \"> and visits = #{visits}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"editorType != null \"> and editor_type = #{editorType}</if>" +
            "        <if test=\"disallowComment != null \"> and disallow_comment = #{disallowComment}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Post> selectListBy(Post post);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM post " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"formatContent != null  and formatContent != ''\"> and format_content = #{formatContent}</if>" +
            "        <if test=\"originalContent != null  and originalContent != ''\"> and original_content = #{originalContent}</if>" +
            "        <if test=\"showContent != null  and showContent != ''\"> and show_content = #{showContent}</if>" +
            "        <if test=\"likes != null \"> and likes = #{likes}</if>" +
            "        <if test=\"priority != null \"> and priority = #{priority}</if>" +
            "        <if test=\"metaDescription != null  and metaDescription != ''\"> and meta_description = #{metaDescription}</if>" +
            "        <if test=\"metaKeywords != null  and metaKeywords != ''\"> and meta_keywords = #{metaKeywords}</if>" +
            "        <if test=\"password != null  and password != ''\"> and password = #{password}</if>" +
            "        <if test=\"title != null  and title != ''\"> and title = #{title}</if>" +
            "        <if test=\"exportTitle != null  and exportTitle != ''\"> and export_title = #{exportTitle}</if>" +
            "        <if test=\"exportPriority != null \"> and export_priority = #{exportPriority}</if>" +
            "        <if test=\"visits != null \"> and visits = #{visits}</if>" +
            "        <if test=\"topFlag != null \"> and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \"> and top_priority = #{topPriority}</if>" +
            "        <if test=\"editorType != null \"> and editor_type = #{editorType}</if>" +
            "        <if test=\"disallowComment != null \"> and disallow_comment = #{disallowComment}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"deleted != null \"> and deleted = #{deleted}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Post post);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO post " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"formatContent != null  and formatContent != ''\">format_content,</if>" +
            "       <if test=\"originalContent != null  and originalContent != ''\">original_content,</if>" +
            "       <if test=\"showContent != null  and showContent != ''\">show_content,</if>" +
            "       <if test=\"likes != null \">likes,</if>" +
            "       <if test=\"priority != null \">priority,</if>" +
            "       <if test=\"metaDescription != null  and metaDescription != ''\">meta_description,</if>" +
            "       <if test=\"metaKeywords != null  and metaKeywords != ''\">meta_keywords,</if>" +
            "       <if test=\"password != null  and password != ''\">password,</if>" +
            "       <if test=\"title != null  and title != ''\">title,</if>" +
            "       <if test=\"exportTitle != null  and exportTitle != ''\">export_title,</if>" +
            "       <if test=\"exportPriority != null \">export_priority,</if>" +
            "       <if test=\"visits != null \">visits,</if>" +
            "       <if test=\"topFlag != null \">top_flag,</if>" +
            "       <if test=\"topPriority != null \">top_priority,</if>" +
            "       <if test=\"editorType != null \">editor_type,</if>" +
            "       <if test=\"disallowComment != null \">disallow_comment,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"deleted != null \">deleted,</if>" +
            "       <if test=\"editTime != null \">edit_time,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"formatContent != null  and formatContent != ''\">#{formatContent},</if>" +
            "       <if test=\"originalContent != null  and originalContent != ''\">#{originalContent},</if>" +
            "       <if test=\"showContent != null  and showContent != ''\">#{showContent},</if>" +
            "       <if test=\"likes != null \">#{likes},</if>" +
            "       <if test=\"priority != null \">#{priority},</if>" +
            "       <if test=\"metaDescription != null  and metaDescription != ''\">#{metaDescription},</if>" +
            "       <if test=\"metaKeywords != null  and metaKeywords != ''\">#{metaKeywords},</if>" +
            "       <if test=\"password != null  and password != ''\">#{password},</if>" +
            "       <if test=\"title != null  and title != ''\">#{title},</if>" +
            "       <if test=\"exportTitle != null  and exportTitle != ''\">#{exportTitle},</if>" +
            "       <if test=\"exportPriority != null \">#{exportPriority},</if>" +
            "       <if test=\"visits != null \">#{visits},</if>" +
            "       <if test=\"topFlag != null \">#{topFlag},</if>" +
            "       <if test=\"topPriority != null \">#{topPriority},</if>" +
            "       <if test=\"editorType != null \">#{editorType},</if>" +
            "       <if test=\"disallowComment != null \">#{disallowComment},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"deleted != null \">#{deleted},</if>" +
            "       <if test=\"editTime != null \">#{editTime},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Post post);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE post " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"formatContent != null  and formatContent != ''\">format_content = #{formatContent},</if>" +
            "        <if test=\"originalContent != null  and originalContent != ''\">original_content = #{originalContent},</if>" +
            "        <if test=\"showContent != null  and showContent != ''\">show_content = #{showContent},</if>" +
            "        <if test=\"likes != null \">likes = #{likes},</if>" +
            "        <if test=\"priority != null \">priority = #{priority},</if>" +
            "        <if test=\"metaDescription != null  and metaDescription != ''\">meta_description = #{metaDescription},</if>" +
            "        <if test=\"metaKeywords != null  and metaKeywords != ''\">meta_keywords = #{metaKeywords},</if>" +
            "        <if test=\"password != null  and password != ''\">password = #{password},</if>" +
            "        <if test=\"title != null  and title != ''\">title = #{title},</if>" +
            "        <if test=\"exportTitle != null  and exportTitle != ''\">export_title = #{exportTitle},</if>" +
            "        <if test=\"exportPriority != null \">export_priority = #{exportPriority},</if>" +
            "        <if test=\"visits != null \">visits = #{visits},</if>" +
            "        <if test=\"topFlag != null \">top_flag = #{topFlag},</if>" +
            "        <if test=\"topPriority != null \">top_priority = #{topPriority},</if>" +
            "        <if test=\"editorType != null \">editor_type = #{editorType},</if>" +
            "        <if test=\"disallowComment != null \">disallow_comment = #{disallowComment},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"deleted != null \">deleted = #{deleted},</if>" +
            "        <if test=\"editTime != null \">edit_time = #{editTime},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Post post);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM post " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"formatContent != null  and formatContent != ''\">and format_content = #{formatContent}</if>" +
            "        <if test=\"originalContent != null  and originalContent != ''\">and original_content = #{originalContent}</if>" +
            "        <if test=\"showContent != null  and showContent != ''\">and show_content = #{showContent}</if>" +
            "        <if test=\"likes != null \">and likes = #{likes}</if>" +
            "        <if test=\"priority != null \">and priority = #{priority}</if>" +
            "        <if test=\"metaDescription != null  and metaDescription != ''\">and meta_description = #{metaDescription}</if>" +
            "        <if test=\"metaKeywords != null  and metaKeywords != ''\">and meta_keywords = #{metaKeywords}</if>" +
            "        <if test=\"password != null  and password != ''\">and password = #{password}</if>" +
            "        <if test=\"title != null  and title != ''\">and title = #{title}</if>" +
            "        <if test=\"exportTitle != null  and exportTitle != ''\">and export_title = #{exportTitle}</if>" +
            "        <if test=\"exportPriority != null \">and export_priority = #{exportPriority}</if>" +
            "        <if test=\"visits != null \">and visits = #{visits}</if>" +
            "        <if test=\"topFlag != null \">and top_flag = #{topFlag}</if>" +
            "        <if test=\"topPriority != null \">and top_priority = #{topPriority}</if>" +
            "        <if test=\"editorType != null \">and editor_type = #{editorType}</if>" +
            "        <if test=\"disallowComment != null \">and disallow_comment = #{disallowComment}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"deleted != null \">and deleted = #{deleted}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Post post);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM post " +
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
    @Delete("DELETE FROM post WHERE id = #{id} ")
    int deleteById(Integer id);

}
