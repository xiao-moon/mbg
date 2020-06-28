package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: AttachmentsVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Attachments")
public class AttachmentsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 名称
    */
    @ApiModelProperty("名称")
    private String name;

    /**
    * 媒体类型
    */
    @ApiModelProperty("媒体类型")
    private String mediaType;

    /**
    * 后缀
    */
    @ApiModelProperty("后缀")
    private String suffix;

    /**
    * 文件绝对路径
    */
    @ApiModelProperty("文件绝对路径")
    private String absoluteFilePath;

    /**
    * 文件相对路径--访问路径
    */
    @ApiModelProperty("文件相对路径--访问路径")
    private String relativeFilePath;

    /**
    * 文件大小;单位KB
    */
    @ApiModelProperty("文件大小;单位KB")
    private String size;

    /**
    * 高度:只有图片才有
    */
    @ApiModelProperty("高度:只有图片才有")
    private String height;

    /**
    * 宽度:只有图片才有
    */
    @ApiModelProperty("宽度:只有图片才有")
    private String width;

    /**
    * 文件类型:0图片,1其他
    */
    @ApiModelProperty("文件类型:0图片,1其他")
    private String type;

    /**
    * 状态:0正常;1停用
    */
    @ApiModelProperty("状态:0正常;1停用")
    private String status;

    /**
    * 删除标志:0正常;1删除
    */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;















}
