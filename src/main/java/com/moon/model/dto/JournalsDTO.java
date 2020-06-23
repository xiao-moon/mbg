package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: JournalsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-24 00:55:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "JournalsDTO")
public class JournalsDTO {

    /**
     * ID主键自增
     */
    @ApiModelProperty(value = "ID主键自增")
    private String id;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String content;

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
     * 点赞数量
     */
    @ApiModelProperty(value = "点赞数量")
    private String likes;


}
