package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: PhotosVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Photos")
public class PhotosVO implements Serializable{

    private static final long serialVersionUID = 1L;


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
    * 描述
    */
    @ApiModelProperty("描述")
    private String description;

    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 存储的位置--本地OR远程
    */
    @ApiModelProperty("存储的位置--本地OR远程")
    private String location;

    /**
    * 名称
    */
    @ApiModelProperty("名称")
    private String name;

    /**
    * 排序，数值越大位置越靠前，0表示不排序
    */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private String priority;

    /**
    * 状态:0正常;1停用
    */
    @ApiModelProperty("状态:0正常;1停用")
    private String status;

    /**
    * 图片分类ID
    */
    @ApiModelProperty("图片分类ID")
    private String type;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
    * 地址
    */
    @ApiModelProperty("地址")
    private String url;












}
