--查询首页用户信息
SELECT u.nickname,u.description FROM `users` u
--查询菜单表
select * from menus m left JOIN menus mm on m.id = mm.parent_id and mm.del_flag =0 and mm.status=0 where m.del_flag=0 and m.status=0