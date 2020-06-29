package com.moon.service.impl;

import com.moon.model.dto.MenusDTO;
import com.moon.service.MenusService;
import org.springframework.stereotype.Service;

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
//    @Autowired
//    private MenusMapper menusMapper;

    @Override
    public List<MenusDTO> findAll() {
        return null;
    }
}
