package com.moon.service.impl;

import com.moon.exception.ServiceException;
import com.moon.mapper.UsersMapper;
import com.moon.model.entity.Users;
import com.moon.model.supports.InitializeCache;
import com.moon.model.vo.UsersVO;
import com.moon.service.UsersService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author moon
 * @since 2020-06-27
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public UsersVO findUserVO() {
        Users user = InitializeCache.users;
        UsersVO usersVO = new UsersVO();
        BeanCopierUtil.transDOToVO(user, usersVO);
        return usersVO;
    }

    @Override
    public Users findUser() {
        List<Users> users = usersMapper.selectUsersList(new Users());
        if (users != null && users.size() == 1) {
            return users.get(0);
        }
        if (users == null) {
            throw new ServiceException("没有查到相关用户，请及时注册");
        } else {
            throw new ServiceException("查询到多个用户");
        }
    }
}
