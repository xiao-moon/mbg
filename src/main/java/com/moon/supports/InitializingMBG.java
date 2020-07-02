package com.moon.supports;

import com.moon.model.supports.InitializeCache;
import com.moon.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述: 启动时加载全局缓存信息
 * 创建人: 小月
 * 创建时间: 2020-07-03 00:52
 */
@Component
@Slf4j
public class InitializingMBG implements InitializingBean {

    @Autowired
    private UsersService usersService;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("初始化信息开始...");

        /**
         * 初始化加载用户信息
         */
        //InitializeCache.users = usersService.findUser();

        log.info("初始化信息结束...");
    }
}
