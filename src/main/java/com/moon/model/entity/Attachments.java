package com.moon.model.entity;

import lombok.*;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
* 描述: Attachments
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attachments implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 文件绝对路径
     */
    private String absoluteFilePath;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * 高度:只有图片才有
     */
    private Integer height;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 媒体类型
     */
    private String mediaType;

    /**
     * 名称
     */
    private String name;

    /**
     * 文件大小;单位KB
     */
    private Integer size;

    /**
     * 状态:0正常;1停用
     */
    private Integer status;

    /**
     * 后缀
     */
    private String suffix;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 访问路径
     */
    private String url;

    /**
     * 宽度:只有图片才有
     */
    private Integer width;




























}
