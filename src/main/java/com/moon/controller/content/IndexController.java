package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.model.supports.SimpleView;
import com.moon.model.vo.MenusVO;
import com.moon.model.vo.PostsVO;
import com.moon.model.vo.UsersVO;
import com.moon.service.MenusService;
import com.moon.service.PostService;
import com.moon.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述: IndexController
 * 创建人: 小月
 * 创建时间: 2020-06-15 00:50
 */
@Api(value = "Index", description = "首页API")
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private MenusService menusService;

    @Autowired
    private PostService postService;


    @GetMapping("/menus")
    @JsonView(SimpleView.IndexMenusVIew.class)
    @ApiOperation(value = "获取基础信息", notes = "获取菜单及用户信息")
    public Object menuInfo() {
        List<MenusVO> all = menusService.findIndexMenus();
        return all;
    }

    @GetMapping("/info")
    @JsonView(SimpleView.IndexMenusVIew.class)
    @ApiOperation(value = "获取基础信息", notes = "获取菜单及用户信息")
    public Object indexInfo() {
        usersService.findUser();
        UsersVO user = usersService.findUser();
        PageHelper.startPage(2,2);
        List<PostsVO> indexPosts = postService.findIndexPosts();
        PageInfo<PostsVO> pageInfo = new PageInfo<PostsVO>(indexPosts);
        List<PostsVO> list = pageInfo.getList();
        return list;
    }

}
