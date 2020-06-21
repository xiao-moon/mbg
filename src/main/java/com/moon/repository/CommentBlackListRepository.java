package com.moon.repository;

import com.moon.model.entity.CommentBlackListDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 描述: CommentBlackListRepository
 * 创建人: 小月
 * 创建时间: 2020-06-17 01:15:20
 */
public interface CommentBlackListRepository extends JpaRepository<CommentBlackListDO, Long>, JpaSpecificationExecutor<CommentBlackListDO> {
}

