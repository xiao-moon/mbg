package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: TagsVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Tags")
public class TagsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 创建时间
    */
    @JsonView(SimpleView.TagsView.class)
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
    * 删除标志:0正常;1删除
    */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
    * ID主键自增
    */
    @JsonView(SimpleView.TagsView.class)
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
    * 标签名称
    */
    @JsonView(SimpleView.TagsView.class)
    @ApiModelProperty("标签名称")
    private String name;


    /**
     * 描述
     */
    @JsonView(SimpleView.TagsView.class)
    @ApiModelProperty("标签名称")
    private String desc;



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
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;








}
