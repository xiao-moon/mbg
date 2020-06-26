package com.moon.service.impl;

import com.moon.model.dto.MenusDTO;
import com.moon.model.entity.QMenusDO;
import com.moon.service.MenuService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:15
 */
public class MenuServiceImpl implements MenuService {

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Override
    public List<MenusDTO> findMenus() {
        QMenusDO mainMenusDO = QMenusDO.menusDO;
        QMenusDO subMenusDO = QMenusDO.menusDO;
        List<MenusDTO> list = jpaQueryFactory
                .select(mainMenusDO,subMenusDO)
                .from(mainMenusDO)
                .innerJoin(subMenusDO)
                .on(mainMenusDO.id.eq((subMenusDO.parentId))
                        .and(subMenusDO.delFlag.eq(0L))
                        .and(subMenusDO.status.eq(0L)))
                .where(mainMenusDO.delFlag.eq(0L)
                        .and(mainMenusDO.status.eq(0L)))
                .fetch()
                .stream()
                .map(tuple -> MenusDTO.builder()
                        .id(String.valueOf(tuple.get(subMenusDO.id)))
                        .icon(tuple.get(subMenusDO.icon))
                        .name(tuple.get(subMenusDO.name))
                        .parentId(String.valueOf(tuple.get(subMenusDO.parentId)))
                        .priority(String.valueOf(tuple.get(subMenusDO.priority)))
                        .target(tuple.get(subMenusDO.target))
                        .url(tuple.get(subMenusDO.url))
                        .status(String.valueOf(tuple.get(subMenusDO.status)))
                        .delFlag(String.valueOf(tuple.get(subMenusDO.delFlag)))
                        .categoriesFlag(String.valueOf(tuple.get(subMenusDO.categoriesFlag)))
                        .createTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tuple.get(subMenusDO.createTime)))
                        .updateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tuple.get(subMenusDO.updateTime)))
                        .build()
                ).collect(Collectors.toList());
        return list;
    }
}
