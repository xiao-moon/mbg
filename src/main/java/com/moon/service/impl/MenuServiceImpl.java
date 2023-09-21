package com.moon.service.impl;

import com.moon.model.entity.Journal;
import com.moon.model.entity.Menu;
import com.moon.service.MenuService;
import com.moon.mapper.MenuMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @description 菜单表
 * @author moon
 * @date 2023-09-21 17:37:23
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper mapper;

    /**
    * 查询单个
    */
    @Override
    public Menu findById(Integer id){
        Menu model = new Menu();
        model.setId(id);
        return mapper.selectOneBy(model);
    }

    /**
    * 查询列表
    */
    @Override
    public List<Menu> findList(Menu menu){
        return mapper.selectListBy(menu);
    }

    /**
    * 新增
    */
    @Override
    public int insert(Menu menu){
        return mapper.insertSelective(menu);
    }

    /**
    * 修改
    */
    @Override
    public int update(Menu menu){
        return mapper.updateByIdSelective(menu);
    }

    /**
    * 删除
    */
    @Override
    public int deleteById(Integer id){
        return mapper.deleteById(id);
    }

    /**
    * 批量删除
    */
    @Override
    public int deleteByIds(Integer[] ids){
        return mapper.deleteByIds(ids);
    }

    /**
    * 条件删除
    */
    @Override
    public int delete(Menu menu){
        return mapper.deleteBy(menu);
    }





}
