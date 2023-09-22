package com.moon.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author moon
 * @date 2023-09-22 17:19
 * @description
 */
@Getter
@Setter
@ApiModel
public class AttachmentUpdateRequest {

    /**
     * ID主键自增
     */
    @NotNull(message = "id can not be null")
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;

}
