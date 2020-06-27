package com.moon.generator.service;

import com.moon.BlogApplication;
import com.moon.generator.entity.GenTableColumn;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-23 23:34
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BlogApplication.class})// 指定启动类
@Log
public class AGenService{

    @Resource
    private TableInfoService tableInfoService;

    @Resource
    private VelocityService velocityService;

    @Test
    public void genFile(){
        Map<String, List<GenTableColumn>> tableInfo = tableInfoService.getTableInfo();
        velocityService.velocity(tableInfo);
    }

}
