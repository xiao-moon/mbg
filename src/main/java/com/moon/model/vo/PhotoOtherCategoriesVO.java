package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PhotoOtherCategoriesVO
* 创建人: 小月
* 创建时间: 2020-06-28 23:12:34
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("PhotoOtherCategories")
public class PhotoOtherCategoriesVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 图片ID
    */
    @ApiModelProperty("图片ID")
    private String photoId;

    /**
    * 其他ID
    */
    @ApiModelProperty("其他ID")
    private String otherId;

    /**
    * 类型:0表示分类引用的图片;1表示文章封面图片
    */
    @ApiModelProperty("类型:0表示分类引用的图片;1表示文章封面图片")
    private String type;

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
