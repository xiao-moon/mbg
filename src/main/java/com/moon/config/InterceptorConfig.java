//package com.moon.config;
//
//import com.moon.interceptor.ErrorInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * 描述: 拦截器配置
// * 创建人: 小月
// * 创建时间: 2020-06-25 23:18
// */
//@Configuration
//@Deprecated
//public class InterceptorConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //registry.addInterceptor(new SubInterceptor()).addPathPatterns("/api/**");
////        registry.addInterceptor(errorInterceptor()).addPathPatterns("/*/**");
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//
//    @Bean
//    public static HandlerInterceptor errorInterceptor(){
//        return new ErrorInterceptor();
//    }
//
//
//}
