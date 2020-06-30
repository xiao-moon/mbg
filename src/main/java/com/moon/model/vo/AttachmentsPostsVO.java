package com.moon.model.vo;

import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
* 描述: AttachmentsPostsVO
* 创建人: 小月
* 创建时间: 2020-07-01 01:56:46
**/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("AttachmentsPosts")
public class AttachmentsPostsVO implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
    * 附件ID
    */
    @ApiModelProperty("附件ID")
    private String attachmentId;

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
    * 菜单ID
    */
    @ApiModelProperty("菜单ID")
    private String postId;

    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private String updateTime;






}
