package com.moon.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 描述: mybatis及其插件配置
 * 创建人: 小月
 * 创建时间: 2020-07-04 13:59
 */
@Configuration
public class MybatisConfig {

//    /**
//     * application中已经配置
//     */
//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("offsetAsPageNum", "true");
//        properties.setProperty("rowBoundsWithCount", "true");
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("dialect", "mysql");
//        pageHelper.setProperties(properties);
//        return pageHelper;
//    }
}
