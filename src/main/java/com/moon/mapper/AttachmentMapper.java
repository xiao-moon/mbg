package com.moon.mapper;

import com.moon.model.entity.Attachment;
import java.util.List;
import org.apache.ibatis.annotations.*;

/**
 * @description 附件表
 * @author moon
 * @date 2023-09-21 18:16:37
 */
public interface AttachmentMapper {

    /**
     * 查询单个
     */
    @Select("<script>" +
            "SELECT id, name, media_type, suffix, absolute_file_path, url, size, height, width, status, del_flag, create_time, update_time " +
            "FROM attachment " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"mediaType != null  and mediaType != ''\"> and media_type = #{mediaType}</if>" +
            "        <if test=\"suffix != null  and suffix != ''\"> and suffix = #{suffix}</if>" +
            "        <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\"> and absolute_file_path = #{absoluteFilePath}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"size != null \"> and size = #{size}</if>" +
            "        <if test=\"height != null \"> and height = #{height}</if>" +
            "        <if test=\"width != null \"> and width = #{width}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "LIMIT 1 " +
            "</script> "
    )
    Attachment selectOneBy(Attachment attachment);


    /**
     * 查询列表
     */
    @Select("<script>" +
            "SELECT id, name, media_type, suffix, absolute_file_path, url, size, height, width, status, del_flag, create_time, update_time " +
            "FROM attachment " +
            "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"mediaType != null  and mediaType != ''\"> and media_type = #{mediaType}</if>" +
            "        <if test=\"suffix != null  and suffix != ''\"> and suffix = #{suffix}</if>" +
            "        <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\"> and absolute_file_path = #{absoluteFilePath}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"size != null \"> and size = #{size}</if>" +
            "        <if test=\"height != null \"> and height = #{height}</if>" +
            "        <if test=\"width != null \"> and width = #{width}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
            "   </where> " +
            "</script> "
    )
    List<Attachment> selectListBy(Attachment attachment);

    /**
     * 查询总数
     */
    @Select("<script>" +
    "SELECT count(1) " +
    "FROM attachment " +
    "   <where> " +
            "        <if test=\"id != null \"> and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\"> and name = #{name}</if>" +
            "        <if test=\"mediaType != null  and mediaType != ''\"> and media_type = #{mediaType}</if>" +
            "        <if test=\"suffix != null  and suffix != ''\"> and suffix = #{suffix}</if>" +
            "        <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\"> and absolute_file_path = #{absoluteFilePath}</if>" +
            "        <if test=\"url != null  and url != ''\"> and url = #{url}</if>" +
            "        <if test=\"size != null \"> and size = #{size}</if>" +
            "        <if test=\"height != null \"> and height = #{height}</if>" +
            "        <if test=\"width != null \"> and width = #{width}</if>" +
            "        <if test=\"status != null \"> and status = #{status}</if>" +
            "        <if test=\"delFlag != null \"> and del_flag = #{delFlag}</if>" +
    "   </where> " +
    "</script> "
    )
    int countBy(Attachment attachment);

    /**
     * 新增
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("<script>" +
            "INSERT INTO attachment " +
            "   <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">name,</if>" +
            "       <if test=\"mediaType != null  and mediaType != ''\">media_type,</if>" +
            "       <if test=\"suffix != null  and suffix != ''\">suffix,</if>" +
            "       <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\">absolute_file_path,</if>" +
            "       <if test=\"url != null  and url != ''\">url,</if>" +
            "       <if test=\"size != null \">size,</if>" +
            "       <if test=\"height != null \">height,</if>" +
            "       <if test=\"width != null \">width,</if>" +
            "       <if test=\"status != null \">status,</if>" +
            "       <if test=\"delFlag != null \">del_flag,</if>" +
            "       <if test=\"createTime != null \">create_time,</if>" +
            "       <if test=\"updateTime != null \">update_time,</if>" +
            "   </trim>" +
            "   <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">" +
            "       <if test=\"name != null  and name != ''\">#{name},</if>" +
            "       <if test=\"mediaType != null  and mediaType != ''\">#{mediaType},</if>" +
            "       <if test=\"suffix != null  and suffix != ''\">#{suffix},</if>" +
            "       <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\">#{absoluteFilePath},</if>" +
            "       <if test=\"url != null  and url != ''\">#{url},</if>" +
            "       <if test=\"size != null \">#{size},</if>" +
            "       <if test=\"height != null \">#{height},</if>" +
            "       <if test=\"width != null \">#{width},</if>" +
            "       <if test=\"status != null \">#{status},</if>" +
            "       <if test=\"delFlag != null \">#{delFlag},</if>" +
            "       <if test=\"createTime != null \">#{createTime},</if>" +
            "       <if test=\"updateTime != null \">#{updateTime},</if>" +
            "   </trim>" +
            "</script> "
    )
    int insertSelective(Attachment attachment);

    /**
     * 更新
     */
    @Update("<script> " +
            "UPDATE attachment " +
            "   <trim prefix=\"SET\" suffixOverrides=\",\">" +
            "        <if test=\"name != null  and name != ''\">name = #{name},</if>" +
            "        <if test=\"mediaType != null  and mediaType != ''\">media_type = #{mediaType},</if>" +
            "        <if test=\"suffix != null  and suffix != ''\">suffix = #{suffix},</if>" +
            "        <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\">absolute_file_path = #{absoluteFilePath},</if>" +
            "        <if test=\"url != null  and url != ''\">url = #{url},</if>" +
            "        <if test=\"size != null \">size = #{size},</if>" +
            "        <if test=\"height != null \">height = #{height},</if>" +
            "        <if test=\"width != null \">width = #{width},</if>" +
            "        <if test=\"status != null \">status = #{status},</if>" +
            "        <if test=\"delFlag != null \">del_flag = #{delFlag},</if>" +
            "        <if test=\"createTime != null \">create_time = #{createTime},</if>" +
            "        <if test=\"updateTime != null \">update_time = #{updateTime},</if>" +
            "   </trim>" +
            "WHERE id = #{id}" +
            "</script> "
    )
    int updateByIdSelective(Attachment attachment);

    /**
     * 硬删除
     */
    @Delete("<script> " +
            "DELETE FROM attachment " +
            "   <where>" +
            "        <if test=\"id != null \">and id = #{id}</if>" +
            "        <if test=\"name != null  and name != ''\">and name = #{name}</if>" +
            "        <if test=\"mediaType != null  and mediaType != ''\">and media_type = #{mediaType}</if>" +
            "        <if test=\"suffix != null  and suffix != ''\">and suffix = #{suffix}</if>" +
            "        <if test=\"absoluteFilePath != null  and absoluteFilePath != ''\">and absolute_file_path = #{absoluteFilePath}</if>" +
            "        <if test=\"url != null  and url != ''\">and url = #{url}</if>" +
            "        <if test=\"size != null \">and size = #{size}</if>" +
            "        <if test=\"height != null \">and height = #{height}</if>" +
            "        <if test=\"width != null \">and width = #{width}</if>" +
            "        <if test=\"status != null \">and status = #{status}</if>" +
            "        <if test=\"delFlag != null \">and del_flag = #{delFlag}</if>" +
            "   </where>" +
            "</script> "
    )
    int deleteBy(Attachment attachment);

    /**
     * 批量删除
     */
    @Delete("<script>" +
            "DELETE FROM attachment " +
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
    @Delete("DELETE FROM attachment WHERE id = #{id} ")
    int deleteById(Integer id);

}
