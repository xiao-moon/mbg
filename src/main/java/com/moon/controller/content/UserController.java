package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.entity.Users;
import com.moon.model.supports.InitializeCache;
import com.moon.model.supports.SimpleView;
import com.moon.model.vo.UsersVO;
import com.moon.utils.BeanCopierUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:獲取用戶信息
 * 创建人: 小月
 * 创建时间: 2020-07-08 23:09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(SimpleView.UserIndexView.class)
    public Object userInfo() {
        Users users = InitializeCache.users;
        UsersVO usersVO = new UsersVO();
        BeanCopierUtil.transDOToVO(users, usersVO);
        return usersVO;
    }


}
