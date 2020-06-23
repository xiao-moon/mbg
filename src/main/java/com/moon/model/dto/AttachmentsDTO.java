package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: AttachmentsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "AttachmentsDTO")
public class AttachmentsDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 媒体类型
     */
    @ApiModelProperty(value = "媒体类型")
    private String mediaType;

    /**
     * 后缀
     */
    @ApiModelProperty(value = "后缀")
    private String suffix;

    /**
     * 文件绝对路径
     */
    @ApiModelProperty(value = "文件绝对路径")
    private String absoluteFilePath;

    /**
     * 文件相对路径--访问路径
     */
    @ApiModelProperty(value = "文件相对路径--访问路径")
    private String relativeFilePath;

    /**
     * 文件大小;单位KB
     */
    @ApiModelProperty(value = "文件大小;单位KB")
    private String size;

    /**
     * 高度:只有图片才有
     */
    @ApiModelProperty(value = "高度:只有图片才有")
    private String height;

    /**
     * 宽度:只有图片才有
     */
    @ApiModelProperty(value = "宽度:只有图片才有")
    private String width;

    /**
     * 文件类型:0图片,1其他
     */
    @ApiModelProperty(value = "文件类型:0图片,1其他")
    private String type;

    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty(value = "状态:0正常;1停用")
    private String status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty(value = "删除标志:0正常;1删除")
    private String delFlag;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateTime;


}
