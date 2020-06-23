package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: MenusDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 01:25:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "MenusDTO")
public class MenusDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

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
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String url;

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
     * 关联文章分类标志:0关联;1不关联
     */
    @ApiModelProperty(value = "关联文章分类标志:0关联;1不关联")
    private String categoriesFlag;

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
