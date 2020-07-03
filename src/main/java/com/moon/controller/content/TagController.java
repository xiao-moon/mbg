package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.model.vo.TagsVO;
import com.moon.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述: 标签
 * 创建人: 小月
 * 创建时间: 2020-07-03 02:07
 */
@RestController
@RequestMapping("/tag")
@Api(value = "Tag", description = "标签")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    @JsonView(SimpleView.TagsView.class)
    @ApiOperation(value = "查询所有标签并排序")
    public Object getInfo() {
        List<TagsVO> tags = tagService.findTagsOrderByPriorityAndTime();
        return tags;
    }

}
