package com.moon.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述: MenusDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "MenusDTO")
public class MenusDTO {

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
     * 图标
     */
    @ApiModelProperty(value = "图标")
    private String icon;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    private String parentId;

    /**
     * 位置
     */
    @ApiModelProperty(value = "位置")
    private String priority;

    /**
     * 打开方式
     */
    @ApiModelProperty(value = "打开方式")
    private String target;

    /**
     * 团队
     */
    @ApiModelProperty(value = "团队")
    private String team;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String url;

    /**
     * 是否显示
     */
    @ApiModelProperty(value = "是否显示")
    private String isShow;

    /**
     * 图片id
     */
    @ApiModelProperty(value ="图片id")
    private String photoId;

    private PhotosDTO photosDTO;

}
