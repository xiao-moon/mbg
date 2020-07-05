package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.service.PhotoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 标签
 * 创建人: 小月
 * 创建时间: 2020-07-03 02:07
 */
@RestController
@RequestMapping("/photo")
@Api(value = "Tag", description = "标签")
public class PhotoController {


    @Autowired
    private PhotoService photoService;

    @GetMapping
    @JsonView(SimpleView.PhotosView.class)
    @ApiOperation(value = "查询所有图片分类及图片信息")
    public Object getInfo() {
        return photoService.findPhotoByType();
    }

}
