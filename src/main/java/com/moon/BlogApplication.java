package com.moon;

import com.moon.utils.SpringUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 描述: 启动器
 * 创建人: 小月
 * 创建时间: 2020-06-12 19:56
 */
@Slf4j
@MapperScan({"com.moon.mapper"})
@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
        printInfo();
    }


    public static void printInfo() {
        Environment env = SpringUtils.getBean(Environment.class);
        String[] activeProfiles = env.getActiveProfiles();
        String port = env.getProperty("server.port");
        log.info("当前开发环境是:{}", (Object) activeProfiles);
        log.info("swagger2地址:{}", "http://localhost:" + port + "/swagger-ui.html");
    }
}
