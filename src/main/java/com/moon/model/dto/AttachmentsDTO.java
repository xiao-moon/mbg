package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: AttachmentsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "AttachmentsDTO")
public class AttachmentsDTO {

    /**
     * ID
     */
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private String updateTime;

    /**
     * 文件KEY
     */
    @ApiModelProperty(value = "文件KEY")
    private String fileKey;

    /**
     * 高度
     */
    @ApiModelProperty(value = "高度")
    private String height;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String mediaType;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 路径
     */
    @ApiModelProperty(value = "路径")
    private String path;

    /**
     * 尺寸
     */
    @ApiModelProperty(value = "尺寸")
    private String size;

    /**
     * 前缀
     */
    @ApiModelProperty(value = "前缀")
    private String suffix;

    /**
     * 路径
     */
    @ApiModelProperty(value = "路径")
    private String thumbPath;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * 宽度
     */
    @ApiModelProperty(value = "宽度")
    private String width;


}
