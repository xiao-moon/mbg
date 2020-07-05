package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.service.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 02:24
 */
@RestController
@RequestMapping("/category")
@Api(value = "category", description = "分类信息")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    @JsonView(SimpleView.CategoriesView.class)
    public Object getInfo(@RequestParam(defaultValue = "9") int pageSize) {
        int pageNum = 1;
        return categoryService.findCategoriesAndPosts(pageNum, pageSize);
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(SimpleView.PostsView.class)
    public Object getPageInfo(@PathVariable int id, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "9") int pageSize) {
        return categoryService.findCategoriesAndPostsByPage(id, pageNum, pageSize);
    }


}
