package com.moon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;
import com.moon.model.entity.TagsDO;

/**
 * 描述: TagsRepository
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
public interface TagsRepository extends JpaRepository<TagsDO, Long>, JpaSpecificationExecutor<TagsDO>, Serializable {
}

