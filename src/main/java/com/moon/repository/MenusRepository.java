package com.moon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;
import java.util.List;

import com.moon.model.entity.MenusDO;

/**
 * 描述: MenusRepository
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
public interface MenusRepository extends JpaRepository<MenusDO, Long>, JpaSpecificationExecutor<MenusDO>, Serializable {

    List<MenusDO> findAllByIsShowAndParentId(Integer isShow, Long parentId);
}

