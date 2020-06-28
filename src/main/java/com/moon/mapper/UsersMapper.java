package com.moon.mapper;

import com.moon.model.entity.Users;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* 描述: UsersMapper
* 创建人: 小月
* 创建时间: 2020-06-29 00:36:58
**/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

    /**
    * 查询单个
    */
    Users selectUsersById(Integer id);


    /**
    * 查询列表
    */
    List<Users> selectUsersList(Users users);

    /**
    * 新增
    */
    int insertUsers(Users users);

    /**
    * 修改
    */
    int updateUsers(Users users);

    /**
    * 删除
    */
    int deleteUsersById(Integer id);

    /**
    * 批量删除
    */
    int deleteUsersByIds(String[] ids);
}
