package com.moon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;
import com.moon.model.entity.MetasDO;

/**
 * 描述: MetasRepository
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
public interface MetasRepository extends JpaRepository<MetasDO, Long>, JpaSpecificationExecutor<MetasDO>, Serializable {
}

