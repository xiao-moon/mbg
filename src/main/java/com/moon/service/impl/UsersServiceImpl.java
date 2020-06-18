package com.moon.service.impl;

import com.moon.exception.ServiceException;
import com.moon.model.dto.UsersDTO;
import com.moon.model.entity.UsersDO;
import com.moon.repository.UsersRepository;
import com.moon.service.UsersService;
import com.moon.utils.BeanCopierUtil;
import com.moon.utils.MoonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-15 20:23
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UsersDTO findAll() {
        List<UsersDO> all = usersRepository.findAll();
        if (MoonUtil.isNotNullList(all) && all.size() != 1) {
            throw new ServiceException("请检查数据库是否有用户信息");
        }
        UsersDTO usersDTO = new UsersDTO();
        BeanCopierUtil.transDOToDTO(all.get(0), usersDTO);
        return usersDTO;
    }
}
