package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 附件表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("附件表")
public class Attachment {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

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
     * 访问路径
     */
    @ApiModelProperty("访问路径")
    private String url;

    /**
     * 文件大小;单位KB
     */
    @ApiModelProperty("文件大小;单位KB")
    private Integer size;

    /**
     * 高度:只有图片才有
     */
    @ApiModelProperty("高度:只有图片才有")
    private Integer height;

    /**
     * 宽度:只有图片才有
     */
    @ApiModelProperty("宽度:只有图片才有")
    private Integer width;

    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty("状态:0正常;1停用")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private Integer delFlag;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;















}
