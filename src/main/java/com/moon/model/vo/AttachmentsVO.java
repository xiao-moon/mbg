package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: AttachmentsVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Attachments")
public class AttachmentsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 文件绝对路径
    */
    @ApiModelProperty("文件绝对路径")
    private String absoluteFilePath;

    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * 删除标志:0正常;1删除
    */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
    * 高度:只有图片才有
    */
    @ApiModelProperty("高度:只有图片才有")
    private String height;

    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 媒体类型
    */
    @ApiModelProperty("媒体类型")
    private String mediaType;

    /**
    * 名称
    */
    @ApiModelProperty("名称")
    private String name;

    /**
    * 文件大小;单位KB
    */
    @ApiModelProperty("文件大小;单位KB")
    private String size;

    /**
    * 状态:0正常;1停用
    */
    @ApiModelProperty("状态:0正常;1停用")
    private String status;

    /**
    * 后缀
    */
    @ApiModelProperty("后缀")
    private String suffix;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
    * 访问路径
    */
    @ApiModelProperty("访问路径")
    private String url;

    /**
    * 宽度:只有图片才有
    */
    @ApiModelProperty("宽度:只有图片才有")
    private String width;














}
