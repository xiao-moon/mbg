package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: PhotoOtherCategoriesDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "PhotoOtherCategoriesDTO")
public class PhotoOtherCategoriesDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 图片ID
     */
    @ApiModelProperty(value = "图片ID")
    private String photoId;

    /**
     * 其他ID
     */
    @ApiModelProperty(value = "其他ID")
    private String otherId;

    /**
     * 类型:0表示分类引用的图片;1表示文章封面图片
     */
    @ApiModelProperty(value = "类型:0表示分类引用的图片;1表示文章封面图片")
    private String type;

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
