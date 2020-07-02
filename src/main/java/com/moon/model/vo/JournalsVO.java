package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: JournalsVO
* 创建人: 小月
* 创建时间: 2020-07-03 01:20:58
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Journals")
public class JournalsVO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID主键自增
     */
    @JsonView(SimpleView.JournalsView.class)
    @ApiModelProperty("ID主键自增")
    private String id;


    /**
    * 内容
    */
    @JsonView(SimpleView.JournalsView.class)
    @ApiModelProperty("内容")
    private String content;

    /**
     * 点赞数量
     */
    @JsonView(SimpleView.JournalsView.class)
    @ApiModelProperty("点赞数量")
    private String likes;


    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty("状态:0正常;1停用")
    private String status;



    /**
    * 删除标志:0正常;1删除
    */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;



    /**
     * 创建时间
     */
    @JsonView(SimpleView.JournalsView.class)
    @ApiModelProperty("创建时间")
    private String createTime;


    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
     * 保存临时数据
     */
    private Object temp;








}
