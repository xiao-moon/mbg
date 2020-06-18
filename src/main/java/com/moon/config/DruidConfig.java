package com.moon.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;

/**
 * 描述: DruidConfig
 * 创建人: 小月
 * 创建时间: 2020-06-14 20:56
 */
@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")// 将所有前缀为spring.datasource下的配置项都加载DataSource中
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean<Servlet> druidStatViewServle() {
        // 注册服务,进行 druid 监控的配置处理
        ServletRegistrationBean<Servlet> srb = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/**");
        // 白名单(为空表示,所有的都可以访问,多个IP的时候用逗号隔开)
        srb.addInitParameter("allow", "127.0.0.1");
        // IP黑名单 (存在共同时，deny优先于allow) （黑白名单就是如果是黑名单，那么该ip无法登陆该可视化界面）
        srb.addInitParameter("deny", "192.168.31.253");
        // 设置登录的用户名和密码
        srb.addInitParameter("loginUsername", "root");
        srb.addInitParameter("loginPassword", "root");
        // 是否可以重置数据源
        srb.addInitParameter("resetEnable", "false");
        return srb;
    }

    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> frb = new FilterRegistrationBean<>();
        frb.setFilter(new WebStatFilter());
        // 添加过滤规则
        frb.addUrlPatterns("/*");
        // 排除过滤名单
        frb.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
        return frb;
    }
}
