package com.moon;

import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;

/**
 * 描述: 代码生成UI界面config配置类
 * 创建人: 小月
 * 创建时间: 2020-06-26 23:14
 */
public class GeberatorUIServer {
    /**
     * 步骤:
     * 1:引入maven的相关依赖，注意scope只需要写test就可以了
     * 2:在项目的test目录新建一个启动类
     * 3:运行该启动类，启动一个Generator Server。然后访问 http://localhost:8068 （端口是可配置的）即可进入到管理界面。
     * 4:文档:https://github.com/davidfantasy/mybatis-plus-generator-ui
     */
    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://localhost:3306/blog?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CTT")
                .userName("root")
                .password("root")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                //数据库schema，POSTGRE_SQL,ORACLE,DB2类型的数据库需要指定
                .schemaName("blog")
                .basePackage("com.moon.model.entity")
                .port(8068)
                .build();
        MybatisPlusToolsApplication.run(config);
    }
}
