package com.moon.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moon.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author moon
 * @date 2023-09-22 16:39
 * @description
 */
@Slf4j
@Configuration
public class BeanConfig {

    // 最大可用的CPU核数
    public static final int CORE = Runtime.getRuntime().availableProcessors();

    // 线程最大的空闲存活时间，单位为秒
    public static final int KEEPALIVE_TIME = 60;

    @Bean
    public ObjectMapper objectMapper() {
        return JsonUtil.getMapper();
    }

    /**
     * IO密集型
     */
    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        int core = CORE * 5;
        log.info("当前服务器核数为:{}", CORE);
        return new ThreadPoolExecutor(core, core, KEEPALIVE_TIME, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    }

    /**
     * 计算密集型
     */
    @Bean
    public ThreadPoolExecutor threadPoolExecutor4Compute() {
        int core = CORE * 2;
        return new ThreadPoolExecutor(core, core, KEEPALIVE_TIME, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    }

}
