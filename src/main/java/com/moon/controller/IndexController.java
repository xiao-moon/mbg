package com.moon.controller;

import com.moon.model.SimpleResponse;
import com.moon.model.enums.ResponseEnum;
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


}
