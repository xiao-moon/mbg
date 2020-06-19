package com.moon.repository;

import com.moon.model.entity.PostsDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

/**
 * 描述: PostsRepository
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:46
 */
public interface PostsRepository extends JpaRepository<PostsDO, Long>, JpaSpecificationExecutor<PostsDO>, Serializable {

	@Query(nativeQuery = true, value = "SELECT p.* , ph.* " +
			"from posts p " +
			"left join photos ph on p.photo_id = ph.id " +
			"ORDER BY p.update_time desc")
	List<PostsDO> findAllByPage();
}

