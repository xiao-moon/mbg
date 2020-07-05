package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.service.PostService;
import com.moon.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PostService postService;

    @GetMapping
    @JsonView(SimpleView.TagsView.class)
    @ApiOperation(value = "查询所有标签并排序")
    public Object getInfo() {
        return tagService.findTagsOrderByPriorityAndTime();
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(SimpleView.IndexVIew.class)
    @ApiOperation(value = "查询标签下的文章列表")
    public Object getDetail(@PathVariable Integer id, @RequestParam(defaultValue = "1") int pageNum,
                            @RequestParam(defaultValue = "9") int pageSize) {
        return postService.findSimplePostsByTags(id, pageNum, pageSize);
    }
}
