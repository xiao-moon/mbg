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
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user")
    @JsonView(SimpleView.IndexMenusVIew.class)
    @ApiOperation(value = "获取用户信息", notes = "获取用户展示信息")
    public Object indexUserInfo() {
        usersService.findUserVO();
        UsersVO user = usersService.findUserVO();
        return user;
    }

    @GetMapping("/posts")
    @JsonView(SimpleView.IndexMenusVIew.class)
    @ApiOperation(value = "获取首页文章", notes = "按照优先级及时间排序")
    public Object indexInfo(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PostsVO> indexPosts = postService.findIndexPosts();
        PageInfo<PostsVO> pageInfo = new PageInfo<PostsVO>(indexPosts);
        List<PostsVO> list = pageInfo.getList();
        return list;
    }
}
