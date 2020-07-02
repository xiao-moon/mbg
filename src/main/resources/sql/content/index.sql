--查询菜单表
select
    m.id,
    m.icon,
    m.name,
    m.desc,
    m.url,
    m.parent_id,
    m.priority,
    m.target,
    a.name a_name,
    a.url a_url
from
    menus m
    left join attachments_menus am on m.id = am.menu_id
    left join attachments a on a.id = am.attachment_id
where
    m.del_flag = 0
    and m.status = 0

--查询首页用户信息
SELECT u.nickname,u.description FROM `users` u

--查询首页文章
SELECT
	mm.*,
	t.id t_id,
	t.NAME t_name,
	cms.comments_count
FROM
	(
SELECT
	p.id,
	p.format_content,
	p.show_content,
	p.likes,
	p.priority,
	p.meta_description,
	p.meta_keywords,
	p.title,
	p.top_flag,
	p.top_priority,
	p.create_time,
	c.id c_id,
	c.NAME c_name,
	a.NAME a_name,
	a.url a_url
FROM
	`posts` p
	LEFT JOIN posts_categories pc ON pc.post_id = p.id
	LEFT JOIN categories c ON pc.category_id = c.id
	LEFT JOIN attachments_posts ap ON ap.post_id = p.id
	LEFT JOIN attachments a ON a.id = ap.attachment_id
WHERE
	p.del_flag = 0
	AND p.STATUS = 0
	) mm
	LEFT JOIN ( SELECT max( pt.priority ) pptt, pt.post_id FROM posts_tags pt GROUP BY pt.post_id ) pts ON pts.post_id = mm.id
	LEFT JOIN posts_tags pt ON pt.post_id = pts.post_id
	AND pt.priority = pts.pptt
	LEFT JOIN tags t ON pt.tag_id = t.id
	LEFT JOIN ( SELECT count( 1 ) comments_count, cs.post_id FROM comments cs WHERE cs.del_flag = 0 GROUP BY cs.post_id ) cms ON cms.post_id = mm.id
ORDER BY
	mm.top_flag DESC,
	mm.top_priority DESC,
	mm.create_time DESC


--查询文章所有信息





