package com.moon.service.impl;

import com.moon.mapper.MenusMapper;
import com.moon.model.entity.Menus;
import com.moon.model.vo.MenusVO;
import com.moon.service.MenusService;
import com.moon.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author moon
 * @since 2020-06-27
 */
@Service
public class MenusServiceImpl implements MenusService {
    @Autowired
    private MenusMapper menusMapper;

    @Override
    public List<MenusVO> findIndexMenus() {
        List<Menus> menus = menusMapper.selectIndexMenus();
        List<MenusVO> menusVOList = new ArrayList<>();
        menuTree(menus, menusVOList);
        return menusVOList;
    }

    /**
     * 生成菜单树
     */
    private void menuTree(List<Menus> menus, List<MenusVO> menusVOList) {
        //遍历所有菜单
        for (Menus menu : menus) {
            //找到parentId为0的根菜单
            if (menu.getParentId() == 0) {
                MenusVO menusVO = new MenusVO();
                menusVO.setId(String.valueOf(menu.getId()));
                menusVO.setIcon(menu.getIcon());
                menusVO.setName(menu.getName());
                menusVO.setDesc(menu.getDesc());
                menusVO.setUrl(menu.getUrl());
                menusVO.setPriority(String.valueOf(menu.getPriority()));
                menusVO.setTarget(menu.getTarget());
                menusVO.setPhotoUrl(menu.getAttachments().getUrl());
                menusVO.setPhotoName(menu.getAttachments().getName());
                subMenus(menus, menu, menusVO);
                menusVOList.add(menusVO);
            }
        }
        if (CollectionUtils.isNotEmpty(menusVOList)) {
            this.sort(menusVOList);
        }
    }

    /**
     * 递归子菜单
     */
    private void subMenus(List<Menus> menus, Menus parentMenu, MenusVO menusVO) {
        //在遍历一遍所有菜单，找到子菜单
        List<MenusVO> subMenusVOList = new ArrayList<>();
        for (Menus subMenu : menus) {
            if (subMenu.getParentId() == parentMenu.getId()) {
                MenusVO subMenusVO = new MenusVO();
                subMenusVO.setId(String.valueOf(subMenu.getId()));
                subMenusVO.setIcon(subMenu.getIcon());
                subMenusVO.setName(subMenu.getName());
                subMenusVO.setDesc(subMenu.getDesc());
                subMenusVO.setUrl(subMenu.getUrl());
                subMenusVO.setPriority(String.valueOf(subMenu.getPriority()));
                subMenusVO.setTarget(subMenu.getTarget());
                subMenusVO.setPhotoUrl(subMenu.getAttachments().getUrl());
                subMenusVO.setPhotoName(subMenu.getAttachments().getName());
                subMenus(menus, subMenu, subMenusVO);
                subMenusVOList.add(subMenusVO);
            }
        }
        if (CollectionUtils.isNotEmpty(subMenusVOList)) {
            this.sort(subMenusVOList);
            menusVO.setSubMenusVO(subMenusVOList);
        }
    }

    /**
     * 按照位置排序
     */
    private void sort(List<MenusVO> menusVOS) {
        Collections.sort(menusVOS, new Comparator<MenusVO>() {
            @Override
            public int compare(MenusVO menusVO, MenusVO t1) {
                int m1 = Integer.parseInt(menusVO.getPriority());
                int m2 = Integer.parseInt(t1.getPriority());

                if (m1 > m2) {
                    return 1;
                }
                if (m1 < m2) {
                    return -1;
                }
                return 0;
            }
        });
    }
}


