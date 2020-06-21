/*
 Navicat Premium Data Transfer

 Source Server         : localhost3306
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 21/06/2020 19:14:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for attachments
-- ----------------------------
DROP TABLE IF EXISTS `attachments`;
CREATE TABLE `attachments`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '修改时间',
  `file_key` varchar(2047) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文件KEY',
  `height` int(11) DEFAULT 0 COMMENT '高度',
  `media_type` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '类型',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `path` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '路径',
  `size` bigint(20) NOT NULL COMMENT '尺寸',
  `suffix` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '前缀',
  `thumb_path` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '路径',
  `type` int(11) DEFAULT 0 COMMENT '类型',
  `width` int(11) DEFAULT 0 COMMENT '宽度',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `attachments_media_type`(`media_type`) USING BTREE,
  INDEX `attachments_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attachments
-- ----------------------------
INSERT INTO `attachments` VALUES (1, '2020-06-07 15:34:10.849000', '2020-06-07 15:34:10.849000', 'upload/2020\\06\\spring-70af93d3b1074144b5ee33544917e207.jpg', 417, 'image/jpeg', 'spring', 'upload/2020/06/spring-70af93d3b1074144b5ee33544917e207.jpg', 36915, 'jpg', 'upload/2020\\06\\spring-70af93d3b1074144b5ee33544917e207-thumbnail.jpg', 0, 500);

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `categories_id` int(11) DEFAULT 0 COMMENT '图片分类ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `categories_categories_id`(`categories_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comment_black_list
-- ----------------------------
DROP TABLE IF EXISTS `comment_black_list`;
CREATE TABLE `comment_black_list`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ban_time` datetime(0) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `ip_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '类型',
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `allow_notification` bit(1) DEFAULT b'1' COMMENT '允许通知',
  `author` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评价人',
  `author_url` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '评价人地址',
  `content` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '内容',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'email',
  `gravatar_md5` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'gravatar_md5',
  `ip_address` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'ip地址',
  `is_admin` bit(1) DEFAULT b'0' COMMENT '是否管理员',
  `parent_id` bigint(20) DEFAULT 0 COMMENT '父ID',
  `post_id` int(11) NOT NULL COMMENT '文章ID',
  `status` int(11) DEFAULT 1 COMMENT '状态',
  `top_priority` int(11) DEFAULT 0 COMMENT 'top_priority',
  `user_agent` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '浏览器信息',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `comments_post_id`(`post_id`) USING BTREE,
  INDEX `comments_type_status`(`type`, `status`) USING BTREE,
  INDEX `comments_parent_id`(`parent_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (0, 1, '2020-05-17 10:43:00.642000', '2020-05-22 15:31:41.117000', b'1', 'Halo', 'https://halo.run', '欢迎使用 Halo，这是你的第一条评论，头像来自 [Gravatar](https://cn.gravatar.com)，你也可以通过注册 [Gravatar](https://cn.gravatar.com) 来显示自己的头像。', 'hi@halo.run', 'c99ef5c2e9621d48634f20afd24dbaa5', '127.0.0.1', b'0', 0, 1, 0, NULL, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36');
INSERT INTO `comments` VALUES (0, 2, '2020-05-22 15:31:01.043000', '2020-05-22 15:31:36.546000', b'1', '阿斯顿发', '', '撒发送到', '2947003994@qq.com', '8501994d27458da8a576f698ce3fb1de', '127.0.0.1', b'0', 0, 5, 0, NULL, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36');

-- ----------------------------
-- Table structure for journals
-- ----------------------------
DROP TABLE IF EXISTS `journals`;
CREATE TABLE `journals`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '内容',
  `likes` bigint(20) DEFAULT 0 COMMENT 'likes',
  `source_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'source_content',
  `type` int(11) DEFAULT 1 COMMENT '类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '日记表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of journals
-- ----------------------------
INSERT INTO `journals` VALUES (1, '2020-05-25 16:45:09.192000', '2020-05-25 16:45:09.192000', '<p>按时发散</p>\n', 0, '<p>按时发散</p>\n', 0);

-- ----------------------------
-- Table structure for links
-- ----------------------------
DROP TABLE IF EXISTS `links`;
CREATE TABLE `links`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `logo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `priority` bigint(20) DEFAULT NULL,
  `team` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for logs
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `ip_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `log_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` bigint(20) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for menus
-- ----------------------------
DROP TABLE IF EXISTS `menus`;
CREATE TABLE `menus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '图标',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `parent_id` int(11) DEFAULT 0 COMMENT '父ID',
  `priority` int(11) DEFAULT 0 COMMENT '位置',
  `target` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '_self' COMMENT '打开方式',
  `team` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '团队',
  `url` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '地址',
  `is_show` tinyint(1) DEFAULT NULL COMMENT '是否显示',
  `photo_id` int(11) DEFAULT NULL COMMENT '图片ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `menus_parent_id`(`parent_id`) USING BTREE,
  INDEX `menus_name`(`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menus
-- ----------------------------
INSERT INTO `menus` VALUES (1, '2020-05-17 10:43:01.255000', '2020-05-17 10:43:01.255000', '', '首页', 0, 1, '_self', '', '/', 0, NULL);
INSERT INTO `menus` VALUES (2, '2020-05-17 10:43:01.432000', '2020-05-17 10:43:01.432000', '', '文章归档', 0, 2, '_self', '', '/archives', 0, NULL);
INSERT INTO `menus` VALUES (3, '2020-05-17 10:43:01.624000', '2020-05-17 10:43:01.624000', '', '文章分类', 0, 3, '_self', '', '/categories/default', 0, NULL);
INSERT INTO `menus` VALUES (4, '2020-05-17 10:43:01.991000', '2020-05-17 10:43:01.991000', '', '关于页面', 0, 4, '_self', '', '/s/about', 0, NULL);
INSERT INTO `menus` VALUES (5, '2020-05-17 11:21:44.998000', '2020-05-17 11:21:44.998000', '', '我的分类', 3, 0, '_self', '', 'http://127.0.0.1:8090/categories/moon', 0, NULL);
INSERT INTO `menus` VALUES (6, '2020-05-17 16:14:11.929000', '2020-05-17 16:14:11.929000', '', 'MOON1', 3, 0, '_self', '', 'http://127.0.0.1:8090/categories/moon1', 0, NULL);
INSERT INTO `menus` VALUES (7, '2020-05-20 17:21:28.637000', '2020-05-20 17:21:28.637000', '', 'MOON', 3, 0, '_self', '', 'http://127.0.0.1:8090/categories/moon', 0, NULL);
INSERT INTO `menus` VALUES (8, '2020-05-20 17:21:31.777000', '2020-05-20 17:21:31.777000', '', '测试分类', 3, 0, '_self', '', 'http://127.0.0.1:8090/categories/qqqqq', 0, NULL);

-- ----------------------------
-- Table structure for menus_posts
-- ----------------------------
DROP TABLE IF EXISTS `menus_posts`;
CREATE TABLE `menus_posts`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单ID',
  `post_id` int(11) DEFAULT NULL COMMENT '文章ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `menus_posts_post_id`(`post_id`) USING BTREE,
  INDEX `menus_posts_menu_id`(`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单文章关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for metas
-- ----------------------------
DROP TABLE IF EXISTS `metas`;
CREATE TABLE `metas`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) DEFAULT NULL,
  `meta_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `meta_value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  `type` bigint(20) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for options
-- ----------------------------
DROP TABLE IF EXISTS `options`;
CREATE TABLE `options`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `option_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '操作的key',
  `type` int(11) DEFAULT 0 COMMENT '类型',
  `option_value` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '操作的value',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of options
-- ----------------------------
INSERT INTO `options` VALUES (1, '2020-05-17 10:28:30.924000', '2020-05-17 11:00:03.937000', 'theme', 0, 'hshan');
INSERT INTO `options` VALUES (2, '2020-05-17 10:42:57.917000', '2020-05-17 10:42:57.917000', 'is_installed', 0, 'true');
INSERT INTO `options` VALUES (3, '2020-05-17 10:42:57.938000', '2020-05-17 10:42:57.938000', 'birthday', 0, '1589712177911');
INSERT INTO `options` VALUES (4, '2020-05-17 10:42:57.939000', '2020-05-17 10:42:57.939000', 'blog_locale', 0, 'zh');
INSERT INTO `options` VALUES (5, '2020-05-17 10:42:57.950000', '2020-05-17 10:42:57.950000', 'blog_title', 0, '小月');
INSERT INTO `options` VALUES (6, '2020-05-17 10:42:57.951000', '2020-06-07 15:40:15.596000', 'blog_url', 0, 'http://127.0.0.1:8090');
INSERT INTO `options` VALUES (7, '2020-05-17 10:47:34.682000', '2020-05-17 10:47:34.682000', 'developer_mode', 0, 'true');
INSERT INTO `options` VALUES (8, '2020-05-19 01:14:02.000000', '2020-05-19 01:14:09.000000', 'blog_description', 0, '今宵酒醒何处 杨柳岸 晓风残月');
INSERT INTO `options` VALUES (9, '2020-06-07 15:39:37.520000', '2020-06-07 15:39:37.520000', 'post_index_sort', 0, 'createTime');
INSERT INTO `options` VALUES (10, '2020-06-07 15:39:37.540000', '2020-06-07 15:39:37.540000', 'email_ssl_port', 0, '465');
INSERT INTO `options` VALUES (11, '2020-06-07 15:39:37.540000', '2020-06-07 15:39:37.540000', 'oss_qiniu_zone', 0, 'auto');
INSERT INTO `options` VALUES (12, '2020-06-07 15:39:37.552000', '2020-06-07 15:39:37.552000', 'static_deploy_type', 0, 'GIT');
INSERT INTO `options` VALUES (13, '2020-06-07 15:39:37.552000', '2020-06-07 15:39:37.552000', 'global_absolute_path_enabled', 0, 'true');
INSERT INTO `options` VALUES (14, '2020-06-07 15:39:37.553000', '2020-06-07 15:39:37.553000', 'email_enabled', 0, 'false');
INSERT INTO `options` VALUES (15, '2020-06-07 15:39:37.553000', '2020-06-07 15:39:37.553000', 'attachment_upload_max_files', 0, '50');
INSERT INTO `options` VALUES (16, '2020-06-07 15:39:37.554000', '2020-06-07 15:39:37.554000', 'email_protocol', 0, 'smtp');
INSERT INTO `options` VALUES (17, '2020-06-07 15:39:37.555000', '2020-06-07 15:39:37.555000', 'comment_api_enabled', 0, 'true');
INSERT INTO `options` VALUES (18, '2020-06-07 15:39:37.555000', '2020-06-07 15:39:37.555000', 'default_editor', 0, 'MARKDOWN');
INSERT INTO `options` VALUES (19, '2020-06-07 15:39:37.556000', '2020-06-07 15:39:37.556000', 'photos_title', 0, '图库');
INSERT INTO `options` VALUES (20, '2020-06-07 15:39:37.556000', '2020-06-07 15:39:37.556000', 'comment_range', 0, '30');
INSERT INTO `options` VALUES (21, '2020-06-07 15:39:37.557000', '2020-06-07 15:39:37.557000', 'seo_spider_disabled', 0, 'false');
INSERT INTO `options` VALUES (22, '2020-06-07 15:39:37.557000', '2020-06-07 15:39:37.557000', 'archives_prefix', 0, 'archives');
INSERT INTO `options` VALUES (23, '2020-06-07 15:39:37.558000', '2020-06-07 15:39:37.558000', 'journals_prefix', 0, 'journals');
INSERT INTO `options` VALUES (24, '2020-06-07 15:39:37.558000', '2020-06-07 15:39:37.558000', 'journals_page_size', 0, '10');
INSERT INTO `options` VALUES (25, '2020-06-07 15:39:37.559000', '2020-06-07 15:39:37.559000', 'journals_title', 0, '日志');
INSERT INTO `options` VALUES (26, '2020-06-07 15:39:37.559000', '2020-06-07 15:39:37.559000', 'comment_page_size', 0, '10');
INSERT INTO `options` VALUES (27, '2020-06-07 15:39:37.560000', '2020-06-07 15:39:37.560000', 'attachment_upload_image_preview_enable', 0, 'true');
INSERT INTO `options` VALUES (28, '2020-06-07 15:39:37.560000', '2020-06-07 15:39:37.560000', 'attachment_type', 0, 'LOCAL');
INSERT INTO `options` VALUES (29, '2020-06-07 15:39:37.561000', '2020-06-07 15:39:37.561000', 'comment_reply_notice', 0, 'false');
INSERT INTO `options` VALUES (30, '2020-06-07 15:39:37.561000', '2020-06-07 15:39:37.561000', 'comment_ban_time', 0, '10');
INSERT INTO `options` VALUES (31, '2020-06-07 15:39:37.562000', '2020-06-07 15:39:37.562000', 'oss_qiniu_domain_protocol', 0, 'https://');
INSERT INTO `options` VALUES (32, '2020-06-07 15:39:37.562000', '2020-06-07 15:39:37.562000', 'oss_upyun_domain_protocol', 0, 'https://');
INSERT INTO `options` VALUES (33, '2020-06-07 15:39:37.563000', '2020-06-07 15:39:37.563000', 'comment_new_notice', 0, 'false');
INSERT INTO `options` VALUES (34, '2020-06-07 15:39:37.563000', '2020-06-07 15:39:37.563000', 'photos_page_size', 0, '10');
INSERT INTO `options` VALUES (35, '2020-06-07 15:39:37.564000', '2020-06-07 15:39:37.564000', 'attachment_upload_max_parallel_uploads', 0, '3');
INSERT INTO `options` VALUES (36, '2020-06-07 15:39:37.564000', '2020-06-07 15:39:37.564000', 'git_static_deploy_branch', 0, 'master');
INSERT INTO `options` VALUES (37, '2020-06-07 15:39:37.565000', '2020-06-07 15:39:37.565000', 'links_prefix', 0, 'links');
INSERT INTO `options` VALUES (38, '2020-06-07 15:39:37.565000', '2020-06-07 15:39:37.565000', 'sheet_prefix', 0, 's');
INSERT INTO `options` VALUES (39, '2020-06-07 15:39:37.565000', '2020-06-07 15:39:37.565000', 'tags_prefix', 0, 'tags');
INSERT INTO `options` VALUES (40, '2020-06-07 15:39:37.566000', '2020-06-07 15:39:37.566000', 'post_permalink_type', 0, 'DEFAULT');
INSERT INTO `options` VALUES (41, '2020-06-07 15:39:37.566000', '2020-06-07 15:39:37.566000', 'rss_page_size', 0, '20');
INSERT INTO `options` VALUES (42, '2020-06-07 15:39:37.567000', '2020-06-07 15:39:37.567000', 'rss_content_type', 0, 'full');
INSERT INTO `options` VALUES (43, '2020-06-07 15:39:37.567000', '2020-06-07 15:39:37.567000', 'categories_prefix', 0, 'categories');
INSERT INTO `options` VALUES (44, '2020-06-07 15:39:37.568000', '2020-06-07 15:39:37.568000', 'photos_prefix', 0, 'photos');
INSERT INTO `options` VALUES (45, '2020-06-07 15:39:37.568000', '2020-06-07 15:39:37.568000', 'comment_internal_plugin_js', 0, '//cdn.jsdelivr.net/npm/halo-comment@latest/dist/halo-comment.min.js');
INSERT INTO `options` VALUES (46, '2020-06-07 15:39:37.569000', '2020-06-07 15:39:37.569000', 'api_enabled', 0, 'false');
INSERT INTO `options` VALUES (47, '2020-06-07 15:39:37.569000', '2020-06-07 15:39:37.569000', 'post_index_page_size', 0, '10');
INSERT INTO `options` VALUES (48, '2020-06-07 15:39:37.570000', '2020-06-07 15:39:37.570000', 'oss_ali_domain_protocol', 0, 'https://');
INSERT INTO `options` VALUES (49, '2020-06-07 15:39:37.570000', '2020-06-07 15:39:37.570000', 'post_archives_page_size', 0, '10');
INSERT INTO `options` VALUES (50, '2020-06-07 15:39:37.571000', '2020-06-07 15:39:37.571000', 'comment_new_need_check', 0, 'true');
INSERT INTO `options` VALUES (51, '2020-06-07 15:39:37.571000', '2020-06-07 15:39:37.571000', 'links_title', 0, '友情链接');
INSERT INTO `options` VALUES (52, '2020-06-07 15:39:37.572000', '2020-06-07 15:39:37.572000', 'comment_gravatar_default', 0, 'mm');
INSERT INTO `options` VALUES (53, '2020-06-07 15:39:37.572000', '2020-06-07 15:39:37.572000', 'post_summary_length', 0, '150');

-- ----------------------------
-- Table structure for photos
-- ----------------------------
DROP TABLE IF EXISTS `photos`;
CREATE TABLE `photos`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '描述',
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '存储的位置--本地OR远程',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  `take_time` datetime(6) DEFAULT NULL COMMENT 'take_time',
  `team` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '团队',
  `thumbnail` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '缩略图',
  `url` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '地址',
  `categories_id` int(11) DEFAULT 0 COMMENT '图片分类ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `photos_team`(`team`) USING BTREE,
  INDEX `photos_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of photos
-- ----------------------------
INSERT INTO `photos` VALUES (1, '2020-06-17 22:49:26.000000', NULL, '测试', '0', 'wqwq', '2020-06-01 22:49:45.000000', 'wqew', 'weqwe', 'weq', 0);

-- ----------------------------
-- Table structure for post_categories
-- ----------------------------
DROP TABLE IF EXISTS `post_categories`;
CREATE TABLE `post_categories`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Table structure for post_tags
-- ----------------------------
DROP TABLE IF EXISTS `post_tags`;
CREATE TABLE `post_tags`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `post_id` int(11) NOT NULL COMMENT '文章ID',
  `tag_id` int(11) NOT NULL COMMENT '标签ID',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `post_tags_post_id`(`post_id`) USING BTREE,
  INDEX `post_tags_tag_id`(`tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of post_tags
-- ----------------------------
INSERT INTO `post_tags` VALUES (2, '2020-05-17 14:05:32.734000', '2020-05-17 14:05:32.734000', 5, 1);
INSERT INTO `post_tags` VALUES (5, '2020-06-07 15:36:37.224000', '2020-06-07 15:36:37.224000', 7, 4);

-- ----------------------------
-- Table structure for posts
-- ----------------------------
DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts`  (
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '类型',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `disallow_comment` bit(1) DEFAULT b'0' COMMENT '不允许评论',
  `edit_time` datetime(6) DEFAULT NULL COMMENT '编辑时间',
  `editor_type` int(11) DEFAULT 0 COMMENT '编辑类型',
  `format_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式化后的文章',
  `likes` bigint(20) DEFAULT 0 COMMENT '喜欢',
  `meta_description` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `meta_keywords` varchar(511) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `original_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '原始的文章',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
  `slug` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'slug',
  `status` int(11) DEFAULT 1 COMMENT '状态',
  `summary` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '总结',
  `template` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '模板',
  `thumbnail` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '缩略图',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标题',
  `top_priority` int(11) DEFAULT 0 COMMENT 'top_priority',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '地址',
  `visits` bigint(20) DEFAULT 0 COMMENT '访客数量',
  `photo_id` int(11) DEFAULT NULL COMMENT '图片ID',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_qmmso8qxjpbxwegdtp0l90390`(`slug`) USING BTREE,
  INDEX `posts_type_status`(`type`, `status`) USING BTREE,
  INDEX `posts_create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of posts
-- ----------------------------
INSERT INTO `posts` VALUES (0, 1, '2020-05-17 10:42:59.846000', '2020-05-17 10:42:59.846000', b'0', '2020-05-17 10:42:59.846000', 0, '<h2 id=\"hello-halo\">Hello Halo</h2>\n<p>如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 <a href=\"https://halo.run\">Halo</a> 进行创作，希望能够使用愉快。</p>\n<h2 id=\"相关链接\">相关链接</h2>\n<ul>\n<li>官网：<a href=\"https://halo.run\">https://halo.run</a></li>\n<li>社区：<a href=\"https://bbs.halo.run\">https://bbs.halo.run</a></li>\n<li>主题仓库：<a href=\"https://halo.run/s/themes\">https://halo.run/s/themes</a></li>\n<li>开源地址：<a href=\"https://github.com/halo-dev/halo\">https://github.com/halo-dev/halo</a></li>\n</ul>\n<p>在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。</p>\n<blockquote>\n<p>这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！</p>\n</blockquote>\n', 0, NULL, NULL, '## Hello Halo\n\n如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 [Halo](https://halo.run) 进行创作，希望能够使用愉快。\n\n## 相关链接\n\n- 官网：[https://halo.run](https://halo.run)\n- 社区：[https://bbs.halo.run](https://bbs.halo.run)\n- 主题仓库：[https://halo.run/s/themes](https://halo.run/s/themes)\n- 开源地址：[https://github.com/halo-dev/halo](https://github.com/halo-dev/halo)\n\n在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。\n\n> 这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！\n\n', '', 'hello-halo', 0, '', '', '', 'Hello Halo', 0, NULL, 5, 1);
INSERT INTO `posts` VALUES (1, 2, '2020-05-17 10:43:00.474000', '2020-05-17 10:43:00.474000', b'0', '2020-05-17 10:43:00.474000', 0, '<h2 id=\"关于页面\">关于页面</h2>\n<p>这是一个自定义页面，你可以在后台的 <code>页面</code> -&gt; <code>所有页面</code> -&gt; <code>自定义页面</code> 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！</p>\n<blockquote>\n<p>这是一篇自动生成的页面，你可以在后台删除它。</p>\n</blockquote>\n', 0, NULL, NULL, '## 关于页面\n\n这是一个自定义页面，你可以在后台的 `页面` -> `所有页面` -> `自定义页面` 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！\n\n> 这是一篇自动生成的页面，你可以在后台删除它。', '', 'about', 0, '', '', '', '关于页面', 0, NULL, 13, 1);
INSERT INTO `posts` VALUES (0, 3, '2020-05-17 10:46:36.616000', '2020-05-17 10:47:00.358000', b'0', '2020-05-17 10:47:00.352000', 0, '<h1 id=\"我是一级标题\">我是一级标题</h1>\n<h2 id=\"我是二级标题\">我是二级标题</h2>\n<h3 id=\"我是三级标题\">我是三级标题</h3>\n<h4 id=\"我是四级标题\">我是四级标题</h4>\n', 0, NULL, NULL, '# 我是一级标题\n## 我是二级标题\n### 我是三级标题\n#### 我是四级标题', '', '这是小月的第一篇文章', 1, '我是一级标题我是二级标题我是三级标题我是四级标题', '', '', '这是小月的第一篇文章', 0, NULL, 1, 1);
INSERT INTO `posts` VALUES (0, 4, '2020-05-17 12:16:13.133000', '2020-05-17 13:51:19.963000', b'0', '2020-05-17 13:51:19.961000', 0, '<h1 id=\"moon-first-blog\">MOON_FIRST_BLOG</h1>\n<p>123456789</p>\n', 0, NULL, NULL, '# MOON_FIRST_BLOG\n123456789', '', 'moonblog', 0, 'MOON_FIRST_BLOG123456789', '', '', 'MOON_FIRST_BLOG', 0, NULL, 11, 1);
INSERT INTO `posts` VALUES (0, 5, '2020-05-17 13:43:25.380000', '2020-05-17 14:05:32.710000', b'0', '2020-05-17 14:05:32.708000', 0, '<h2 id=\"本文主要讲解一下如何从零基础到搭建出一个个人的博客\">本文主要讲解一下如何从零基础到搭建出一个个人的博客</h2>\n<p>在讲解之前，我先说明一下相关的东西。</p>\n<h3 id=\"1halo简介\">1.Halo简介</h3>\n<p>Halo 是一款现代化的个人独立博客系统，给习惯写博客的同学多一个选择。<br />\nHalo [ˈheɪloʊ]，意为光环。当然，你也可以当成拼音读(哈喽)。<br />\n轻快，简洁，功能强大，使用 Java 开发的博客系统。</p>\n<h3 id=\"2linux服务器安装\">2.Linux服务器安装</h3>\n<p>本教程以Centos7为例，配置并运行 Halo，其他 Linux 发行版大同小异。</p>\n<h4 id=\"21写在前面\">2.1.写在前面</h4>\n<p>具备一定的 Linux 基础。<br />\n如需域名绑定，请先保证已经正确解析 IP，以及确认服务器是否需要备案。<br />\n如需使用 IP 访问，请先确保 Halo 的运行端口已经打开，除非你使用 80 端口运行 Halo。<br />\n如 3 所述，如果你使用了类似 宝塔面板 之类的 Linux 管理面板，可能还需要在面板里设置端口。<br />\n不要想当然，请严格按照文档的流程操作。</p>\n', 0, NULL, NULL, '## 本文主要讲解一下如何从零基础到搭建出一个个人的博客\n在讲解之前，我先说明一下相关的东西。\n\n### 1.Halo简介\nHalo 是一款现代化的个人独立博客系统，给习惯写博客的同学多一个选择。\nHalo [ˈheɪloʊ]，意为光环。当然，你也可以当成拼音读(哈喽)。\n轻快，简洁，功能强大，使用 Java 开发的博客系统。\n\n### 2.Linux服务器安装\n本教程以Centos7为例，配置并运行 Halo，其他 Linux 发行版大同小异。\n\n#### 2.1.写在前面\n具备一定的 Linux 基础。\n如需域名绑定，请先保证已经正确解析 IP，以及确认服务器是否需要备案。\n如需使用 IP 访问，请先确保 Halo 的运行端口已经打开，除非你使用 80 端口运行 Halo。\n如 3 所述，如果你使用了类似 宝塔面板 之类的 Linux 管理面板，可能还需要在面板里设置端口。\n不要想当然，请严格按照文档的流程操作。\n\n', '', 'hhhh', 0, 'halo  测试', '', '', '用Halo在自己服务器搭建一个个人博客', 0, NULL, 12, 1);
INSERT INTO `posts` VALUES (0, 6, '2020-06-07 15:05:45.379000', '2020-06-07 15:06:18.028000', b'0', '2020-06-07 15:06:18.023000', 0, '<p>-这是测试文章功能</p>\n', 0, NULL, NULL, '-这是测试文章功能', '', '测试文章功能', 0, '-这是测试文章功能', '', '', '测试文章功能', 0, NULL, 2, 1);
INSERT INTO `posts` VALUES (0, 7, '2020-06-07 15:35:04.827000', '2020-06-07 15:36:37.200000', b'0', '2020-06-07 15:36:37.199000', 0, '<p>spring学习</p>\n', 0, NULL, NULL, 'spring学习', '', 'spring学习', 0, 'spring学习', '', 'http://127.0.0.1:8090/upload/2020/06/spring-70af93d3b1074144b5ee33544917e207.jpg', 'spring学习', 0, NULL, 1, 1);
INSERT INTO `posts` VALUES (0, 8, '2020-06-07 16:43:43.788000', '2020-06-07 16:43:43.788000', b'0', '2020-06-07 16:43:43.788000', 0, '<h1 id=\"博客前台\">博客前台</h1>\n<ul>\n<li>获取菜单列表【一级菜单列表】</li>\n<li>获取图片路径</li>\n<li>获取文字信息</li>\n<li>获取标签即对应的文章信息</li>\n<li>获取文章信息</li>\n<li>获取分类文章对应的文章信息</li>\n</ul>\n<p>#博客后台</p>\n<h2 id=\"仪表台\">仪表台</h2>\n<ul>\n<li>文章数量</li>\n<li>评论数量</li>\n<li>阅读量</li>\n<li>建立天数</li>\n<li>操作记录</li>\n</ul>\n<h2 id=\"文章中心\">文章中心</h2>\n<ul>\n<li>写文章</li>\n<li>修改文章</li>\n<li>查找文章</li>\n<li>文章设置</li>\n<li>文章删除</li>\n<li>文章搜索</li>\n</ul>\n<h2 id=\"目录分类\">目录分类</h2>\n<ul>\n<li>添加分类</li>\n<li>修改分类</li>\n<li>移除分类</li>\n<li>展示分类</li>\n</ul>\n<h2 id=\"标签分类\">标签分类</h2>\n<ul>\n<li>增删改查</li>\n</ul>\n<h2 id=\"页面\">页面</h2>\n<ul>\n<li>增删改查</li>\n</ul>\n<h2 id=\"附件\">附件</h2>\n<ul>\n<li>增删改查</li>\n</ul>\n<h2 id=\"评论\">评论</h2>\n<ul>\n<li>增删改查</li>\n</ul>\n<h2 id=\"个人资料\">个人资料</h2>\n<ul>\n<li>增删改查</li>\n<li>修改密码</li>\n</ul>\n<h2 id=\"博客设置\">博客设置</h2>\n<ul>\n<li>​</li>\n</ul>\n<h2 id=\"小工具\">小工具</h2>\n<ul>\n<li>​</li>\n</ul>\n<h2 id=\"其他\">其他</h2>\n<ul>\n<li>​</li>\n</ul>\n', 0, NULL, NULL, '# 博客前台\n\n+ 获取菜单列表【一级菜单列表】\n+ 获取图片路径\n+ 获取文字信息\n+ 获取标签即对应的文章信息\n+ 获取文章信息\n+ 获取分类文章对应的文章信息\n\n\n\n\n#博客后台 \n\n## 仪表台\n\n* 文章数量\n* 评论数量\n* 阅读量\n* 建立天数\n* 操作记录\n\n## 文章中心\n\n* 写文章\n* 修改文章\n* 查找文章\n* 文章设置\n* 文章删除\n* 文章搜索\n\n## 目录分类\n\n* 添加分类\n* 修改分类\n* 移除分类\n* 展示分类\n\n## 标签分类\n\n* 增删改查\n\n## 页面\n\n* 增删改查\n\n## 附件\n\n* 增删改查\n\n## 评论\n\n* 增删改查\n\n## 个人资料\n\n* 增删改查\n* 修改密码\n\n## 博客设置\n\n* ​\n\n## 小工具\n\n* ​\n\n## 其他\n\n* ​', '', '博客重构md', 1, '', '', '', '博客重构.md', 0, NULL, 0, NULL);

-- ----------------------------
-- Table structure for tags
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标签名称',
  `slug` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标签标识',
  `slug_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '标识名称',
  `thumbnail` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '缩略图',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_sn0d91hxu700qcw0n4pebp5vc`(`slug`) USING BTREE,
  INDEX `tags_name`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tags` VALUES (1, '2020-05-17 13:42:56.170000', '2020-05-17 13:42:56.170000', 'HALO_MOON', 'halomoon', NULL, '');
INSERT INTO `tags` VALUES (2, '2020-06-07 15:07:10.287000', '2020-06-07 15:07:10.287000', 'java', 'java', NULL, '');
INSERT INTO `tags` VALUES (3, '2020-06-07 15:32:52.230000', '2020-06-07 15:32:52.230000', 'mybatis', 'mybatis', NULL, '');
INSERT INTO `tags` VALUES (4, '2020-06-07 15:32:59.524000', '2020-06-07 15:34:37.607000', 'spring', 'spring', NULL, 'http://127.0.0.1:8090/upload/2020/06/spring-70af93d3b1074144b5ee33544917e207.jpg');

-- ----------------------------
-- Table structure for theme_settings
-- ----------------------------
DROP TABLE IF EXISTS `theme_settings`;
CREATE TABLE `theme_settings`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) DEFAULT NULL,
  `setting_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `setting_value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `theme_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
  `create_time` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `avatar` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '头像',
  `description` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '描述',
  `email` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'email',
  `expire_time` datetime(6) DEFAULT NULL COMMENT '过期时间',
  `mfa_key` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'mfa_key',
  `mfa_type` int(11) NOT NULL DEFAULT 0 COMMENT 'mfa_type',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录名',
  `current_connections` bigint(20) DEFAULT NULL COMMENT '当前连接',
  `total_connections` bigint(20) DEFAULT NULL COMMENT '总连接',
  `user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'user',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '2020-05-17 10:42:58.319000', '2020-05-18 12:25:46.518000', '//cn.gravatar.com/avatar/fa8bafedb58d8fae8835ae10fc1e50a1?s=256&d=mm', '今宵酒醒何处杨柳岸晓风残月', '2947003449@qq.com', '2020-05-17 10:42:58.319000', NULL, 0, '小月', '$2a$10$0/nzWRXsgpUzO9uJ45bH4uP7xx7Z10E8KR2yRWXZk67wVTgRpn8ka', 'moon', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
