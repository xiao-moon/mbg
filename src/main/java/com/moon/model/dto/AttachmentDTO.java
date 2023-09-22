package com.moon.model.dto;

import com.moon.model.entity.Attachment;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author moon
 * @date 2023-09-22 17:23
 * @description
 */
@Getter
@Setter
public class AttachmentDTO extends Attachment {

    @ApiModelProperty("markdown格式的url")
    private String markdownUrl;

}
