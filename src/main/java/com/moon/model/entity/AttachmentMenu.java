package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 附件-菜单关联表
 * @author moon
 * @date 2023-09-22 15:18:53
 */
@Getter
@Setter
@ApiModel("附件-菜单关联表")
public class AttachmentMenu {

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
    private Integer menuId;

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
