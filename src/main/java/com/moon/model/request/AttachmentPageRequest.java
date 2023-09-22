package com.moon.model.request;

import com.moon.model.BasePageRequest;
import com.moon.model.enums.AttachmentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author moon
 * @date 2023-09-22 14:44
 * @description
 */
@Getter
@Setter
@ApiModel
public class AttachmentPageRequest extends BasePageRequest {

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;

    /**
     * 媒体类型
     */
    @ApiModelProperty("媒体类型")
    private String mediaType;

    /**
     * 上传destination
     */
    @ApiModelProperty("上传destination")
    private AttachmentType type;



}
