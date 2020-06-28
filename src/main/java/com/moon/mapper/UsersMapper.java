package com.moon.mapper;

import com.moon.model.entity.Users;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述: UsersMapper
* 创建人: 小月
* 创建时间: 2020-06-28 22:44:14
**/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

    /**
    * 查询单个
    */
    public Users selectUsersById(Integer id);


    /**
    * 查询列表
    */
    public List<Users> selectUsersList(Users users);

    /**
    * 新增
    */
    public int insertUsers(Users users);

    /**
    * 修改
    */
    public int updateUsers(Users users);

    /**
    * 删除
    */
    public int deleteUsersById(Integer id);

    /**
    * 批量删除
    */
    public int deleteUsersByIds(String[] ids);
}
