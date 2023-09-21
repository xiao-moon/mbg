package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 附件-文章分类关联表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("附件-文章分类关联表")
public class AttachmentCategory {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 附件ID
     */
    @ApiModelProperty("附件ID")
    private Integer attachmentId;

    /**
     * 菜单ID
     */
    @ApiModelProperty("菜单ID")
    private Integer categoryId;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;







}
