package com.moon.controller;

import com.moon.model.SimpleResponse;
import com.moon.model.dto.MenusDTO;
import com.moon.model.dto.PostsDTO;
import com.moon.model.dto.UsersDTO;
import com.moon.model.enums.ResponseEnum;
import com.moon.service.MenusService;
import com.moon.service.PostsService;
import com.moon.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    private MenusService menusServiceImpl;
    @Autowired
    private UsersService usersServiceImpl;
    @Autowired
    private PostsService postsServiceImpl;


    @PostMapping("/menus")
    @ApiOperation(value = "获取一级菜单", notes = "", produces = "application/json")
    public Object getTopMenus(MenusDTO menusDTO) {
        List<MenusDTO> lists = menusServiceImpl.findAllHeadMenus(0, 0L);
        return new SimpleResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), lists);
    }

    @PostMapping("/userInfo")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = "application/json")
    public Object getUserInfo() {
        UsersDTO all = usersServiceImpl.findAll();
        return new SimpleResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), all);
    }

    @PostMapping("/posts")
    @ApiOperation(value = "获取文章", notes = "获取文章", produces = "application/json")
    public Object getPosts() {
        List<PostsDTO> allByPage = postsServiceImpl.findAllByPageTest();
        return new SimpleResponse(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), allByPage);
    }

}
