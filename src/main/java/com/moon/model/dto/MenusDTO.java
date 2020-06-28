package com.moon.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 描述: MenusDTO
 * 创建人: 小月
 * 创建时间: 2020/6/28 22:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Menus")
public class MenusDTO {

    /**
     * 主键自增
     */
    @ApiModelProperty("主键自增")
    private Integer id;

    private String icon;

    private String name;

    private Integer parentId;

    private Integer priority;

    private String target;

    private String url;

    private Integer status;

    private Integer delFlag;

    private Integer categoriesFlag;

    private Date createTime;

    private Date updateTime;

}
