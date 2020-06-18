package com.moon.service.impl;

import com.moon.model.dto.MenusDTO;
import com.moon.model.entity.MenusDO;
import com.moon.repository.MenusRepository;
import com.moon.service.MenusService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-15 00:37
 */
@Service
public class MenusServiceImpl implements MenusService {

    @Autowired
    private MenusRepository menusRepository;

    @Override
    public List<MenusDTO> findAllHeadMenus(Integer isShow, Long parentId) {
        List<MenusDO> doList = menusRepository.findAllByIsShowAndParentId(isShow, parentId);
        List<MenusDTO> dtoList = new ArrayList<>();
        for (MenusDO menusDO : doList) {
            MenusDTO menusDTO = new MenusDTO();
            BeanCopierUtil.transDOToDTO(menusDO, menusDTO);
            dtoList.add(menusDTO);
        }
        return dtoList;
    }

}
