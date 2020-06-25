package com.moon.service.impl;

import com.moon.model.dto.UsersDTO;
import com.moon.model.entity.QUsersDO;
import com.moon.model.entity.UsersDO;
import com.moon.service.UserService;
import com.moon.utils.BeanCopierUtil;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述: UserServiceImpl
 * 创建人: 小月
 * 创建时间: 2020-06-25 01:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Override
    public UsersDTO findUserInfo() {
        QUsersDO usersDOQ = QUsersDO.usersDO;
        UsersDO usersDO = jpaQueryFactory
                .select(usersDOQ)
                .from(usersDOQ)
                .fetchOne();
        UsersDTO usersDTO = new UsersDTO();
        BeanCopierUtil.transDOToDTO(usersDO, usersDTO);
        return usersDTO;
    }
}
