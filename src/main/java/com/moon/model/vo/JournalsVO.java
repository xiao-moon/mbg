package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: JournalsVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Journals")
public class JournalsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 内容
    */
    @ApiModelProperty("内容")
    private String content;

    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * ID主键自增
    */
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 点赞数量
    */
    @ApiModelProperty("点赞数量")
    private String likes;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;






}
