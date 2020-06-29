package com.moon.service.impl;

import com.moon.mapper.MenusMapper;
import com.moon.model.entity.Menus;
import com.moon.model.vo.MenusVO;
import com.moon.service.MenusService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<MenusVO> findAll() {
        List<Menus> menus = menusMapper.selectMenusList(new Menus());
        List<MenusVO> menusVOList = new ArrayList<>();
        for (Menus menu : menus) {
            MenusVO menusVO = new MenusVO();
            BeanCopierUtil.transDOToVO(menu,menusVO);
            menusVOList.add(menusVO);
        }

        return menusVOList;
    }
}
