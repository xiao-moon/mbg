package com.moon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述: Swagger2Config
 * 创建人: 小月
 * 创建时间: 2020-06-14 20:55
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {

    //是否开启swagger
//    @Value(value = "${swagger.enabled}")
//    private Boolean swaggerEnabled;

    //过滤Swagger响应的API
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.moon.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //自定义信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("MBG")
                //创建人
                //.contact(new Contact("小月", "https://github.com/", "2947003449@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("个人博客系统 API接口使用指南")
                .build();
    }

}

