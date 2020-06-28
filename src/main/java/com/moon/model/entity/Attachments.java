package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述:
* 创建人: 小月
* 创建时间: 2020-06-28 20:59:24
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("attachments")
public class Attachments implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @TableId
    @TableField("id")
    private Integer id;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 媒体类型
     */
    @TableField("media_type")
    private String mediaType;

    /**
     * 后缀
     */
    @TableField("suffix")
    private String suffix;

    /**
     * 文件绝对路径
     */
    @TableField("absolute_file_path")
    private String absoluteFilePath;

    /**
     * 文件相对路径--访问路径
     */
    @TableField("relative_file_path")
    private String relativeFilePath;

    /**
     * 文件大小;单位KB
     */
    @TableField("size")
    private Integer size;

    /**
     * 高度:只有图片才有
     */
    @TableField("height")
    private Integer height;

    /**
     * 宽度:只有图片才有
     */
    @TableField("width")
    private Integer width;

    /**
     * 文件类型:0图片,1其他
     */
    @TableField("type")
    private Integer type;

    /**
     * 状态:0正常;1停用
     */
    @TableField("status")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;






























}
