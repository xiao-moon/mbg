-- ----------------------------
-- Table structure for posts
-- ----------------------------

DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `format_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式化后的文章',
  `original_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '原始的文章',
  `likes` int(11) DEFAULT 0 COMMENT '点赞数量',
  `meta_description` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'SEO优化:meta_description',
  `meta_keywords` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'SEO优化:meta_keywords',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文章加密密码',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'SEO优化:文章标题',
  `export_title` varchar(120) DEFAULT NULL COMMENT '导出文章标题',
  `export_priority` int(11) DEFAULT 0 COMMENT '导出文章顺序',
  `visits` int(11) DEFAULT 0 COMMENT '访客数量',
  `top_flag` int(1) DEFAULT 0 COMMENT '是否置顶:0不置顶;1置顶',
  `top_priority` int(11) DEFAULT NULL COMMENT '置顶位置编号:越小排序位置越靠前',
  `editor_type` int(1) DEFAULT NULL COMMENT '编辑类型:0markdown;1富文本',
  `disallow_comment` int(1) DEFAULT 0 COMMENT '不允许评论:0允许;1不允许',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1草稿,2停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `edit_time` datetime DEFAULT NULL COMMENT '首次编辑时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建发布时间',
  `update_time` datetime DEFAULT NULL COMMENT '最近一次更新修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `posts_flag_status`(`del_flag`, `status`) USING BTREE,
  INDEX `posts_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章表' ROW_FORMAT = Dynamic ;

-- ----------------------------
-- Records of posts
-- ----------------------------
INSERT INTO `posts` VALUES (1, '<h2 id=\"hello-halo\">Hello Halo</h2>\n<p>如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 <a href=\"https://halo.run\">Halo</a> 进行创作，希望能够使用愉快。</p>\n<h2 id=\"相关链接\">相关链接</h2>\n<ul>\n<li>官网：<a href=\"https://halo.run\">https://halo.run</a></li>\n<li>社区：<a href=\"https://bbs.halo.run\">https://bbs.halo.run</a></li>\n<li>主题仓库：<a href=\"https://halo.run/s/themes\">https://halo.run/s/themes</a></li>\n<li>开源地址：<a href=\"https://github.com/halo-dev/halo\">https://github.com/halo-dev/halo</a></li>\n</ul>\n<p>在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。</p>\n<blockquote>\n<p>这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！</p>\n</blockquote>\n', '## Hello Halo\n\n如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 [Halo](https://halo.run) 进行创作，希望能够使用愉快。\n\n## 相关链接\n\n- 官网：[https://halo.run](https://halo.run)\n- 社区：[https://bbs.halo.run](https://bbs.halo.run)\n- 主题仓库：[https://halo.run/s/themes](https://halo.run/s/themes)\n- 开源地址：[https://github.com/halo-dev/halo](https://github.com/halo-dev/halo)\n\n在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。\n\n> 这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！\n\n', 20, 'DDDDD', 'KKKKK', NULL, 'HELLO MBG', null, 0, 20, 0, 0, 0, 0, 0, 0, '2020-06-02 00:33:02.000000', '2020-06-02 00:33:10', '2020-06-02 00:33:17');
INSERT INTO `posts` VALUES (2, '<h2 id=\"关于页面\">关于页面</h2>\n<p>这是一个自定义页面，你可以在后台的 <code>页面</code> -&gt; <code>所有页面</code> -&gt; <code>自定义页面</code> 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！</p>\n<blockquote>\n<p>这是一篇自动生成的页面，你可以在后台删除它。</p>\n</blockquote>\n', '## 关于页面\n\n这是一个自定义页面，你可以在后台的 `页面` -> `所有页面` -> `自定义页面` 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！\n\n> 这是一篇自动生成的页面，你可以在后台删除它。', 0, 'DDDDD', 'KKKKK', NULL, '关于页面', null, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL);
INSERT INTO `posts` VALUES (3, '<h1 id=\"我是一级标题\">我是一级标题</h1>\n<h2 id=\"我是二级标题\">我是二级标题</h2>\n<h3 id=\"我是三级标题\">我是三级标题</h3>\n<h4 id=\"我是四级标题\">我是四级标题</h4>\n', '# 我是一级标题\n## 我是二级标题\n### 我是三级标题\n#### 我是四级标题', 0, 'DDDDD', 'KKKKK', NULL, '这是小月的第一篇文章', null, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL);
INSERT INTO `posts` VALUES (4, '<h1 id=\"moon-first-blog\">MOON_FIRST_BLOG</h1>\n<p>123456789</p>\n', '# MOON_FIRST_BLOG\n123456789', 0, 'DDDDD', 'KKKKK', NULL, 'MOON_FIRST_BLOG', null, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL);


-- ----------------------------
-- Table structure for tags
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标签名称',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `tags_flag_status`(`del_flag`, `status`) USING BTREE,
  INDEX `tags_name`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '标签表' ROW_FORMAT = Dynamic ;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tags` VALUES (1, 'spring', 0, 0,'2020-05-17 13:42:56', '2020-05-17 13:42:56');
INSERT INTO `tags` VALUES (2, 'java', 0, 0,'2020-06-07 15:07:10', '2020-06-07 15:07:10');


-- ----------------------------
-- Table structure for post_tags
-- ----------------------------
DROP TABLE IF EXISTS `post_tags`;
CREATE TABLE `post_tags`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `post_id` int(11) NOT NULL COMMENT '文章ID',
  `tag_id` int(11) NOT NULL COMMENT '标签ID',
  `priority` int(11) NOT NULL COMMENT '标签排序,越小排序位置越靠前',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `post_tags_post_id`(`post_id`) USING BTREE,
  INDEX `post_tags_tag_id`(`tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章标签关联表' ROW_FORMAT = Dynamic ;

-- ----------------------------
-- Records of post_tags
-- ----------------------------
INSERT INTO `post_tags` VALUES (1, 1, 1, 1,'2020-05-17 14:05:32', '2020-05-17 14:05:32');
INSERT INTO `post_tags` VALUES (2, 1, 2, 2,'2020-06-07 15:36:37', '2020-06-07 15:36:37');
INSERT INTO `post_tags` VALUES (3, 2, 1, 1,'2020-06-07 15:36:37', '2020-06-07 15:36:37');

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `parent_id` int(11) DEFAULT NULL COMMENT '父ID',
  `name` varchar(60) NOT NULL COMMENT '分类名称',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `categories_flag_status`(`del_flag`, `status`) USING BTREE,
  INDEX `categories_parent_id`(`parent_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, 0, '默认分类', 0, 0,'2020-05-17 14:05:32', '2020-05-17 14:05:32');


-- ----------------------------
-- Table structure for post_categories
-- ----------------------------
DROP TABLE IF EXISTS `post_categories`;
CREATE TABLE `post_categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `categories_id` int(11) NOT NULL COMMENT '文章分类ID',
  `post_id` int(11) NOT NULL COMMENT '文章ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `post_categories_post_id`(`post_id`) USING BTREE,
  INDEX `post_categories_menu_id`(`categories_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单文章关联表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for photos
-- ----------------------------
DROP TABLE IF EXISTS `photos`;
CREATE TABLE `photos`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '描述',
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'LOCAL' COMMENT '存储的位置--本地OR远程',
  `url` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '地址',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `photos_flag_status`(`del_flag`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of photos
-- ----------------------------
INSERT INTO `photos` VALUES (1, '测试图', '测试图片', DEFAULT, '/ceshi', 0, 0, '2020-06-17 22:49:26', '2020-06-01 22:49:45');


-- ----------------------------
-- Table structure for p_categories
-- ----------------------------
DROP TABLE IF EXISTS `p_categories`;
CREATE TABLE `p_categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `name` varchar(60) NOT NULL COMMENT '分类名称',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `p_categories_flag_status`(`del_flag`, `status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of p_categories
-- ----------------------------
INSERT INTO `p_categories` VALUES (1, '我的图片', 0, 0,'2020-05-17 14:05:32', '2020-05-17 14:05:32');


-- ----------------------------
-- Table structure for photo_p_categories
-- ----------------------------
DROP TABLE IF EXISTS `photo_p_categories`;
CREATE TABLE `photo_p_categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `photo_id` int(11) NOT NULL COMMENT '图片ID',
  `p_categories_id` int(11) NOT NULL COMMENT '分类ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `photo_p_categories_photo_id`(`photo_id`) USING BTREE,
  INDEX `photo_p_categories_p_categories_id`(`p_categories_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片-图片分类关联表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for photo_other_categories
-- ----------------------------
DROP TABLE IF EXISTS `photo_other_categories`;
CREATE TABLE `photo_other_categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `photo_id` int(11) NOT NULL COMMENT '图片ID',
  `other_id` int(11) NOT NULL COMMENT '其他ID',
  `type` int(11) NOT NULL COMMENT '类型:0表示分类引用的图片;1表示文章封面图片',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `photo_other_categories_photo_id`(`photo_id`) USING BTREE,
  INDEX `photo_other_categories_type`(`type`) USING BTREE,
  INDEX `photo_other_categories_other_id`(`other_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片-其他分类关联表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `parent_id` int(11) DEFAULT 0 COMMENT '父ID',
  `response_id` int(11) NOT NULL COMMENT '回复给的人的ID',
  `author` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评价人',
  `author_url` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '评价人个人站点URL',
  `content` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评价内容',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'email',
  `ip_address` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'ip地址',
  `is_admin` int(1) DEFAULT 1 COMMENT '是否管理员:0是;1不是',
  `post_id` int(11) NOT NULL COMMENT '文章ID',
  `top_priority` int(11) DEFAULT NULL COMMENT '置顶,值越小越靠前',
  `user_agent` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '浏览器信息',
  `allow_notification` int(1) DEFAULT 0 COMMENT '允许通知:0允许;1不允许',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `comments_post_id`(`post_id`) USING BTREE,
  INDEX `comments_parent_id`(`parent_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------


-- ----------------------------
-- Table structure for journals
-- ----------------------------
DROP TABLE IF EXISTS `journals`;
CREATE TABLE `journals`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `likes` int(11) DEFAULT 0 COMMENT '点赞数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '日记表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of journals
-- ----------------------------
INSERT INTO `journals` VALUES (1, '<p>按时发散</p>\n', '2020-05-25 16:45:09', '2020-05-25 16:45:09',11);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `avatar` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '头像地址',
  `description` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '描述',
  `email` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'email',
  `expire_time` datetime(6) DEFAULT NULL COMMENT '过期时间',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '//cn.gravatar.com/avatar/fa8bafedb58d8fae8835ae10fc1e50a1?s=256&d=mm', '今宵酒醒何处杨柳岸晓风残月', '2947003449@qq.com', '2020-05-17 10:42:58.319000', '小月', '$2a$10$0/nzWRXsgpUzO9uJ45bH4uP7xx7Z10E8KR2yRWXZk67wVTgRpn8ka', 'moon', '2020-05-17 10:42:58', '2020-05-18 12:25:46');


-- ----------------------------
-- Table structure for attachments
-- ----------------------------
DROP TABLE IF EXISTS `attachments`;
CREATE TABLE `attachments`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `media_type` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '媒体类型',
  `suffix` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '后缀',
  `absolute_file_path` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文件绝对路径',
  `relative_file_path` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文件相对路径--访问路径',
  `size` int(11) NOT NULL COMMENT '文件大小;单位KB',
  `height` int(11) DEFAULT NULL COMMENT '高度:只有图片才有',
  `width` int(11) DEFAULT 0 COMMENT '宽度:只有图片才有',
  `type` int(1) DEFAULT NULL COMMENT '文件类型:0图片,1其他',
  `status` int(1) DEFAULT 0 COMMENT '状态:0正常;1停用',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志:0正常;1删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件表' ROW_FORMAT = Dynamic;
