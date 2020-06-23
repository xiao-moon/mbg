package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: TagsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "TagsDTO")
public class TagsDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 标签名称
     */
    @ApiModelProperty(value = "标签名称")
    private String name;

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
