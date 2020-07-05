package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 时间轴
 * 创建人: 小月
 * 创建时间: 2020-07-02 22:16
 */
@Api(value = "TimeAxis", description = "首页API")
@RestController
@RequestMapping("/time")
public class TimeAxisController {

    @Autowired
    @Qualifier("postServiceImpl")
    private PostService postService;

    /**
     * 获取时间轴信息
     */
    @GetMapping
    @JsonView(SimpleView.TimeAxisView.class)
    @ApiOperation(value = "获取时间轴全部信息")
    public Object getAxis() {
        return postService.findAllPostsByTime();
    }

}
