package com.moon;

import com.moon.generator.entity.GenTableColumn;
import com.moon.generator.service.TableInfoService;
import com.moon.generator.service.VelocityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author moon
 * @date 2023-09-21 10:37
 * @description
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BlogApplication.class})// 指定启动类
@Slf4j
public class GenerateTest {

    @Resource
    private TableInfoService tableInfoService;

    @Resource
    private VelocityService velocityService;

    @Test
    public void genFile() {
        Map<String, List<GenTableColumn>> tableInfo = tableInfoService.getTableInfo();
        velocityService.velocity(tableInfo);
    }

}
