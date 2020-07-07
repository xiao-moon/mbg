package com.moon.controller.content;

import com.moon.service.PostService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 02:24
 */
@RestController
@RequestMapping("/post")
@Api(value = "post", description = "文章详情")
public class PostsController {

    @Autowired
    @Qualifier("postServiceImpl")
    private PostService postService;


    @GetMapping("/{id:\\d+}")
//    @JsonView(SimpleView.PostsView.class)
    public Object getPageInfo(@PathVariable int id) {
        return postService.findPostDetailById(id);
    }


}
