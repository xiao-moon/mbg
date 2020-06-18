package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: PhotosDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "PhotosDTO")
public class PhotosDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

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

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;

    /**
     * 存储的位置--本地OR远程
     */
    @ApiModelProperty(value = "存储的位置--本地OR远程")
    private String location;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * take_time
     */
    @ApiModelProperty(value = "take_time")
    private String takeTime;

    /**
     * 团队
     */
    @ApiModelProperty(value = "团队")
    private String team;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnail;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String url;

    /**
     * 图片分类ID
     */
    @ApiModelProperty(value = "图片分类ID")
    private String categoriesId;


}
