package com.moon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述: OptionsDTO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "OptionsDTO")
public class OptionsDTO {

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
     * 操作的key
     */
    @ApiModelProperty(value = "操作的key")
    private String optionKey;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    private String type;

    /**
     * 操作的value
     */
    @ApiModelProperty(value = "操作的value")
    private String optionValue;


}
