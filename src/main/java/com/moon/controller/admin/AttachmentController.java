package com.moon.controller.admin;

import com.github.pagehelper.PageInfo;
import com.moon.model.SimpleResponse;
import com.moon.model.dto.AttachmentDTO;
import com.moon.model.entity.Attachment;
import com.moon.model.request.AttachmentPageRequest;
import com.moon.model.request.AttachmentUpdateRequest;
import com.moon.service.AttachmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author moon
 * @date 2023-09-22 14:38
 * @description 附件
 */
@RestController
@RequestMapping("/admin/attachment")
public class AttachmentController {

    @Resource
    private AttachmentService attachmentService;

    @GetMapping("{id:\\d+}")
    @ApiOperation("查询单个")
    public SimpleResponse<AttachmentDTO> get(@PathVariable("id") Integer id) {
        Attachment byId = attachmentService.findById(id);
        return null;
    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    public SimpleResponse<PageInfo<Attachment>> page(@RequestParam AttachmentPageRequest request) {
        Attachment attachment = new Attachment();
        BeanUtils.copyProperties(request, attachment);
        attachment.setDeleted(0);
        return SimpleResponse.success(attachmentService.page(attachment, request.getPageNum(), request.getPageSize()));
    }

    @PutMapping
    @ApiOperation("修改名称")
    public SimpleResponse<Void> update(@RequestBody @Valid AttachmentUpdateRequest request) {
        Attachment attachment = new Attachment();
        BeanUtils.copyProperties(request, attachment);
        attachmentService.update(attachment);
        return SimpleResponse.success();
    }


}
