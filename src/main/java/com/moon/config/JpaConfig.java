package com.moon.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-21 14:29
 */
@Configuration
public class JpaConfig {

    @Bean//让Spring管理JPAQueryFactory
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }

}
