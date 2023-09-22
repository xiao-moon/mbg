-- ----------------------------
-- Table structure for attachment
-- ----------------------------
DROP TABLE IF EXISTS `attachment`;
CREATE TABLE `attachment`
(
    `id`                 INT(11)      NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `name`               VARCHAR(255) NOT NULL COMMENT '名称',
    `media_type`         VARCHAR(127) NOT NULL COMMENT '媒体类型',
    `suffix`             VARCHAR(50)           DEFAULT NULL COMMENT '后缀',
    `absolute_file_path` VARCHAR(1023)         DEFAULT NULL COMMENT '文件绝对路径',
    `url`                VARCHAR(1023)         DEFAULT NULL COMMENT '访问路径',
    `size`               INT(11)      NOT NULL COMMENT '文件大小;单位KB',
    `height`             INT(11)               DEFAULT NULL COMMENT '高度:只有图片才有',
    `width`              INT(11)               DEFAULT 0 COMMENT '宽度:只有图片才有',
    `deleted`            TINYINT(1)            DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `type`               TINYINT(1)            DEFAULT 0 COMMENT '详见AttachmentType枚举类',
    `create_time`        DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`        DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of attachment
-- ----------------------------
INSERT INTO `attachment`
VALUES (1, '测试附件1', 'img', 'png', '/attachments/2010011600063589.jpg',
        '/attachments/2010011600063589.jpg', 1024, 1024, 1920, 0, '2020-06-25 00:25:18',
        '2020-06-25 00:25:21');
INSERT INTO `attachment`
VALUES (2, '测试附件2', 'img', 'png', '/attachments/2010011600064161.jpg',
        '/attachments/2010011600064161.jpg', 1024, 1024, 1920, 0, '2020-06-25 00:25:18',
        '2020-06-25 00:25:21');

-- ----------------------------
-- Table structure for attachment_category
-- ----------------------------
DROP TABLE IF EXISTS `attachment_category`;
CREATE TABLE `attachment_category`
(
    `id`            INT(11)  NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `attachment_id` INT(11)  NOT NULL COMMENT '附件ID',
    `category_id`   INT(11)  NOT NULL COMMENT '菜单ID',
    `create_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `attachment_category_attachment_id` (`attachment_id`) USING BTREE,
    INDEX `attachment_category_category_id` (`category_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件-文章分类关联表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of attachment_category
-- ----------------------------
INSERT INTO `attachment_category`
VALUES (1, 1, 1, '2020-06-25 00:37:35', '2020-06-25 00:37:38');

-- ----------------------------
-- Table structure for attachment_menu
-- ----------------------------
DROP TABLE IF EXISTS `attachment_menu`;
CREATE TABLE `attachment_menu`
(
    `id`            INT(11)  NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `attachment_id` INT(11)  NOT NULL COMMENT '附件ID',
    `menu_id`       INT(11)  NOT NULL COMMENT '菜单ID',
    `create_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `attachment_menu_attachment_id` (`attachment_id`) USING BTREE,
    INDEX `attachment_menu_menu_id` (`menu_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件-菜单关联表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of attachment_menu
-- ----------------------------
INSERT INTO `attachment_menu`
VALUES (1, 1, 1, '2020-06-25 00:37:35', '2020-06-25 00:37:38');
INSERT INTO `attachment_menu`
VALUES (2, 1, 1, '2020-06-25 00:38:17', '2020-06-25 00:38:20');
INSERT INTO `attachment_menu`
VALUES (3, 1, 1, '2020-06-29 20:42:34', '2020-06-29 20:42:36');
INSERT INTO `attachment_menu`
VALUES (4, 1, 9, '2020-06-29 23:52:20', '2020-06-29 23:52:24');

-- ----------------------------
-- Table structure for attachment_post
-- ----------------------------
DROP TABLE IF EXISTS `attachment_post`;
CREATE TABLE `attachment_post`
(
    `id`            INT(11)  NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `attachment_id` INT(11)  NOT NULL COMMENT '附件ID',
    `post_id`       INT(11)  NOT NULL COMMENT '菜单ID',
    `create_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `attachment_post_attachment_id` (`attachment_id`) USING BTREE,
    INDEX `attachment_post_post_id` (`post_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '附件-文章关联表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of attachment_post
-- ----------------------------
INSERT INTO `attachment_post`
VALUES (1, 1, 1, '2020-06-25 00:37:35', '2020-06-25 00:37:38');
INSERT INTO `attachment_post`
VALUES (2, 1, 2, '2020-06-25 00:38:17', '2020-06-25 00:38:20');
INSERT INTO `attachment_post`
VALUES (3, 1, 3, '2020-06-29 20:42:34', '2020-06-29 20:42:36');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`
(
    `id`          INT(11)     NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `parent_id`   INT(11)              DEFAULT NULL COMMENT '父ID',
    `name`        VARCHAR(60) NOT NULL COMMENT '分类名称',
    `priority`    INT(11)     NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `status`      TINYINT(1)           DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`     TINYINT(1)  NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time` DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `category_parent_id` (`parent_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章分类表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category`
VALUES (1, 0, 'java', 0, 0, 0, '2020-05-17 14:05:32', '2020-05-17 14:05:32');
INSERT INTO `category`
VALUES (2, 0, 'spring', 0, 0, 0, '2020-06-25 00:27:57', '2020-06-25 00:27:59');
INSERT INTO `category`
VALUES (3, 0, 'springboot', 0, 0, 0, '2020-06-25 00:28:28', '2020-06-25 00:28:30');
INSERT INTO `category`
VALUES (4, 2, 'spring理论知识', 0, 0, 0, '2020-06-25 00:29:18', '2020-06-25 00:29:20');
INSERT INTO `category`
VALUES (5, 2, 'spring实践积累', 0, 0, 0, '2020-06-25 00:29:43', '2020-06-25 00:29:45');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`
(
    `id`                 INT(11)       NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `parent_id`          INT(11)                DEFAULT 0 COMMENT '父ID',
    `response_id`        INT(11)       NOT NULL COMMENT '回复给的人的ID',
    `author`             VARCHAR(50)   NOT NULL COMMENT '评价人',
    `author_url`         VARCHAR(511)           DEFAULT NULL COMMENT '评价人个人站点URL',
    `content`            VARCHAR(1023) NOT NULL COMMENT '评价内容',
    `email`              VARCHAR(255)  NOT NULL COMMENT 'email',
    `ip_address`         VARCHAR(127)           DEFAULT NULL COMMENT 'ip地址',
    `is_admin`           INT(1)                 DEFAULT 1 COMMENT '是否管理员:0是;1不是',
    `post_id`            INT(11)       NOT NULL COMMENT '文章ID',
    `top_flag`           INT(1)        NOT NULL DEFAULT 0 COMMENT '是否置顶:0不置顶;1置顶',
    `top_priority`       INT(11)       NOT NULL DEFAULT 0 COMMENT '置顶位置排序，数值越大位置越靠前，0表示不排序',
    `user_agent`         VARCHAR(511)           DEFAULT NULL COMMENT '浏览器信息',
    `allow_notification` INT(1)        NOT NULL DEFAULT 0 COMMENT '允许通知:0允许;1不允许',
    `deleted`            TINYINT(1)    NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time`        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `comment_post_id` (`post_id`) USING BTREE,
    INDEX `comment_parent_id` (`parent_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '评论表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment`
VALUES (1, 0, 0, 'moon', NULL, '第一条回复', '1234567@email.com', '127.0.0.1', 0, 1, 0, 1, NULL, 0, 0,
        '2020-06-25 00:31:27', '2020-06-25 00:31:29');
INSERT INTO `comment`
VALUES (2, 1, 1, 'tom', NULL, '回复第一条回复', '122121212', '127.0.0.1', 1, 1, 0, 2, NULL, 0, 0,
        '2020-06-25 00:33:54', '2020-06-25 00:33:56');
INSERT INTO `comment`
VALUES (3, 0, 0, 'moon', NULL, '第二条回复', '1234567@email.com', '127.0.0.1', 0, 1, 0, 1, NULL, 0, 1,
        '2020-06-25 00:31:27', '2020-06-25 00:31:29');
INSERT INTO `comment`
VALUES (4, 1, 1, 'SS', 'http://www.moon.com', '回复消息', '2947003449@qq.com', '0:0:0:0:0:0:0:1', 0, 1,
        0, 0, 'PostmanRuntime/7.26.1', 0, 0, '2020-07-08 21:23:29', '2020-07-08 21:23:29');
INSERT INTO `comment`
VALUES (5, 1, 1, 'SS', 'http://www.moon.com', '回复消息', '2947003449@qq.com', '0:0:0:0:0:0:0:1', 0, 1,
        0, 0, 'PostmanRuntime/7.26.1', 0, 0, '2020-07-08 21:24:06', '2020-07-08 21:24:06');

-- ----------------------------
-- Table structure for journal
-- ----------------------------
DROP TABLE IF EXISTS `journal`;
CREATE TABLE `journal`
(
    `id`          INT(11)    NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `content`     TEXT       NOT NULL COMMENT '内容',
    `status`      TINYINT(1) NOT NULL DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`     TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time` DATETIME   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `likes`       INT(11)             DEFAULT 0 COMMENT '点赞数量',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '日记表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of journal
-- ----------------------------
INSERT INTO `journal`
VALUES (1, '<p>日记01</p>\n', 0, 0, '2020-05-25 16:45:09', '2020-05-25 16:45:09', 11);
INSERT INTO `journal`
VALUES (2, '<p>日记02</p>\n', 0, 0, '2020-06-01 16:45:09', '2020-06-01 16:45:09', 14);
INSERT INTO `journal`
VALUES (3, '<p>日记03</p>\n', 1, 0, '2020-05-14 16:45:09', '2020-05-14 16:45:09', 34);
INSERT INTO `journal`
VALUES (4, '<p>日记04</p>\n', 0, 0, '2020-05-22 16:45:09', '2020-05-22 16:45:09', 22);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`
(
    `id`              INT(11)       NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `icon`            VARCHAR(50)            DEFAULT NULL COMMENT '图标',
    `name`            VARCHAR(50)   NOT NULL COMMENT '名称',
    `desc`            VARCHAR(255)           DEFAULT NULL COMMENT '描述',
    `parent_id`       INT(11)                DEFAULT 0 COMMENT '父ID',
    `priority`        INT(11)       NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `target`          VARCHAR(20)            DEFAULT '_self' COMMENT '打开方式',
    `url`             VARCHAR(1023) NOT NULL COMMENT '地址',
    `status`          TINYINT(1)    NOT NULL DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`         TINYINT(1)    NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `categories_flag` TINYINT(1)             DEFAULT 1 COMMENT '关联文章分类标志:0关联;1不关联',
    `create_time`     DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`     DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `menu_parent_id` (`parent_id`) USING BTREE,
    INDEX `menu_name` (`name`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu`
VALUES (1, NULL, '首页', '首页描述', 0, 1, '_self', '/', 0, 0, 1, '2020-05-17 10:43:01',
        '2020-05-17 10:43:01');
INSERT INTO `menu`
VALUES (2, NULL, '文章分类', '文章分类描述', 0, 2, '_self', '/categories', 0, 0, 0, '2020-05-17 10:43:01',
        '2020-05-17 10:43:01');
INSERT INTO `menu`
VALUES (3, NULL, '时间轴', '时间轴描述', 0, 3, '_self', '/time/line', 0, 1, 1, '2020-06-25 00:14:04',
        '2020-06-25 00:14:06');
INSERT INTO `menu`
VALUES (4, NULL, '随笔', '随笔描述', 0, 4, '_self', '/journals', 0, 0, 1, '2020-06-25 00:16:38',
        '2020-06-25 00:16:41');
INSERT INTO `menu`
VALUES (5, NULL, '相册', '相册描述', 0, 6, '_self', '/album', 0, 0, 1, '2020-06-25 00:17:18',
        '2020-06-25 00:17:23');
INSERT INTO `menu`
VALUES (6, NULL, '标签', '标签描述', 0, 5, '_self', '/tag', 0, 0, 1, '2020-06-25 00:19:06',
        '2020-06-25 00:19:10');
INSERT INTO `menu`
VALUES (7, NULL, '测试1', '测试1描述', 4, 1, '_self', '/ceshi1', 0, 0, 1, '2020-06-25 00:21:29',
        '2020-06-25 00:21:31');
INSERT INTO `menu`
VALUES (8, NULL, '测试2', '测试2描述', 4, 2, '_self', '/ceshi2', 0, 0, 1, '2020-06-25 00:22:04',
        '2020-06-25 00:22:08');
INSERT INTO `menu`
VALUES (9, NULL, '测试3', '测试3描述', 7, 0, '_self', '/ceshi3', 0, 0, 1, '2020-06-29 22:31:46',
        '2020-06-29 22:31:50');

-- ----------------------------
-- Table structure for photo
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo`
(
    `id`          INT(11)       NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `name`        VARCHAR(255)  NOT NULL COMMENT '名称',
    `description` VARCHAR(255)           DEFAULT NULL COMMENT '描述',
    `location`    VARCHAR(255)           DEFAULT 'LOCAL' COMMENT '存储的位置--本地OR远程',
    `url`         VARCHAR(1023) NOT NULL COMMENT '地址',
    `type`        INT(11)                DEFAULT NULL COMMENT '图片分类ID',
    `priority`    INT(11)       NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `status`      TINYINT(1)    NOT NULL DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`     TINYINT(1)    NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time` DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of photo
-- ----------------------------
INSERT INTO `photo`
VALUES (2, '测试图2', '测试图片2', 'LOCAL', '/ceshi2', 1, 0, 0, 0, '2020-06-25 00:39:19',
        '2020-06-25 00:39:22');
INSERT INTO `photo`
VALUES (3, '测试图3', '测试图片3', 'LOCAL', '/ceshi3', 1, 3, 0, 0, '2020-06-25 00:39:19',
        '2020-06-25 00:39:22');
INSERT INTO `photo`
VALUES (4, '测试图4', '测试图片1', 'LOCAL', '/ceshi', 2, 0, 0, 0, '2020-06-17 22:49:26',
        '2020-06-01 22:49:45');
INSERT INTO `photo`
VALUES (5, '测试图5', '测试图片1', 'LOCAL', '/ceshi', 2, 0, 0, 0, '2020-05-01 22:49:26',
        '2020-05-01 22:49:45');
INSERT INTO `photo`
VALUES (47, '测试图6', '测试图片6', 'LOCAL', '/ceshi6', 1, 0, 0, 0, '2020-06-25 00:39:19',
        '2020-06-25 00:39:22');
INSERT INTO `photo`
VALUES (48, '测试图7', '测试图片7', 'LOCAL', '/ceshi7', 2, 0, 0, 0, '2020-06-25 00:39:19',
        '2020-06-25 00:39:22');
INSERT INTO `photo`
VALUES (49, '测试图8', '测试图片8', 'LOCAL', '/ceshi8', 2, 0, 0, 0, '2020-06-26 00:39:19',
        '2020-06-26 00:39:22');

-- ----------------------------
-- Table structure for photo_type
-- ----------------------------
DROP TABLE IF EXISTS `photo_type`;
CREATE TABLE `photo_type`
(
    `id`          INT(11)     NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `name`        VARCHAR(60) NOT NULL COMMENT '分类名称',
    `priority`    INT(11)     NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `status`      TINYINT(1)  NOT NULL DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`     TINYINT(1)  NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time` DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '图片分类表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of photo_type
-- ----------------------------
INSERT INTO `photo_type`
VALUES (1, '测试图片分类1', 1, 0, 0, '2020-05-17 14:05:32', '2020-05-17 14:05:32');
INSERT INTO `photo_type`
VALUES (2, '测试图片分类2', 2, 0, 0, '2020-06-25 00:35:32', '2020-06-25 00:35:34');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`
(
    `id`               INT(11)      NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `format_content`   LONGTEXT     NOT NULL COMMENT '格式化后的文章',
    `original_content` LONGTEXT     NOT NULL COMMENT '原始的文章',
    `show_content`     LONGTEXT COMMENT '缩略展示最多70文字',
    `likes`            INT(11)               DEFAULT 0 COMMENT '点赞数量',
    `priority`         INT(11)      NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `meta_description` VARCHAR(1023)         DEFAULT NULL COMMENT 'SEO优化:meta_description',
    `meta_keywords`    VARCHAR(511)          DEFAULT NULL COMMENT 'SEO优化:meta_keywords',
    `password`         VARCHAR(255)          DEFAULT NULL COMMENT '文章加密密码',
    `title`            VARCHAR(255) NOT NULL COMMENT 'SEO优化:文章标题',
    `export_title`     VARCHAR(120)          DEFAULT NULL COMMENT '导出文章标题',
    `export_priority`  INT(11)               DEFAULT 0 COMMENT '导出文章顺序,按照从小到大排序',
    `visits`           INT(11)      NOT NULL DEFAULT 0 COMMENT '访客数量',
    `top_flag`         INT(1)       NOT NULL DEFAULT 0 COMMENT '是否置顶:0不置顶;1置顶',
    `top_priority`     INT(11)      NOT NULL DEFAULT 0 COMMENT '置顶位置排序，数值越大位置越靠前，0表示不排序',
    `editor_type`      INT(1)                DEFAULT NULL COMMENT '编辑类型:0markdown;1富文本',
    `disallow_comment` INT(1)                DEFAULT 0 COMMENT '不允许评论:0允许;1不允许',
    `status`           TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '状态:0草稿;1发布',
    `deleted`          TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `edit_time`        DATETIME              DEFAULT NULL COMMENT '首次编辑时间',
    `create_time`      DATETIME              DEFAULT NULL COMMENT '创建发布时间',
    `update_time`      DATETIME              DEFAULT NULL COMMENT '最近一次更新修改时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `post_create_time` (`create_time`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post`
VALUES (1,
        '<h2 id=\"hello-halo\">Hello Halo</h2>\n<p>如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 <a href=\"https://halo.run\">Halo</a> 进行创作，希望能够使用愉快。</p>\n<h2 id=\"相关链接\">相关链接</h2>\n<ul>\n<li>官网：<a href=\"https://halo.run\">https://halo.run</a></li>\n<li>社区：<a href=\"https://bbs.halo.run\">https://bbs.halo.run</a></li>\n<li>主题仓库：<a href=\"https://halo.run/s/themes\">https://halo.run/s/themes</a></li>\n<li>开源地址：<a href=\"https://github.com/halo-dev/halo\">https://github.com/halo-dev/halo</a></li>\n</ul>\n<p>在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。</p>\n<blockquote>\n<p>这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！</p>\n</blockquote>\n',
        '## Hello Halo\n\n如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 [Halo](https://halo.run) 进行创作，希望能够使用愉快。\n\n## 相关链接\n\n- 官网：[https://halo.run](https://halo.run)\n- 社区：[https://bbs.halo.run](https://bbs.halo.run)\n- 主题仓库：[https://halo.run/s/themes](https://halo.run/s/themes)\n- 开源地址：[https://github.com/halo-dev/halo](https://github.com/halo-dev/halo)\n\n在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。\n\n> 这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！\n\n',
        '', 20, 0, 'DDDDD', 'KKKKK', NULL, 'HELLO MBG', NULL, 0, 20, 0, 0, 0, 0, 0, 0,
        '2020-06-02 00:33:02', '2020-06-02 00:33:10', '2020-06-02 00:33:17');
INSERT INTO `post`
VALUES (2,
        '<h2 id=\"关于页面\">关于页面</h2>\n<p>这是一个自定义页面，你可以在后台的 <code>页面</code> -&gt; <code>所有页面</code> -&gt; <code>自定义页面</code> 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！</p>\n<blockquote>\n<p>这是一篇自动生成的页面，你可以在后台删除它。</p>\n</blockquote>\n',
        '## 关于页面\n\n这是一个自定义页面，你可以在后台的 `页面` -> `所有页面` -> `自定义页面` 找到它，你可以用于新建关于页面、留言板页面等等。发挥你自己的想象力！\n\n> 这是一篇自动生成的页面，你可以在后台删除它。',
        '最多展示70个字', 0, 0, 'DDDDD', 'KKKKK', NULL, '关于页面', NULL, 0, 1, 0, 0, 0, 0, 0, 0,
        '2020-06-03 00:33:02', '2020-06-03 00:33:10', '2020-06-03 00:33:17');
INSERT INTO `post`
VALUES (3,
        '<h1 id=\"我是一级标题\">我是一级标题</h1>\n<h2 id=\"我是二级标题\">我是二级标题</h2>\n<h3 id=\"我是三级标题\">我是三级标题</h3>\n<h4 id=\"我是四级标题\">我是四级标题</h4>\n',
        '# 我是一级标题\n## 我是二级标题\n### 我是三级标题\n#### 我是四级标题', '最多展示70个字', 0, 0, 'DDDDD', 'KKKKK', NULL,
        '这是小月的第一篇文章', NULL, 0, 2, 1, 2, 0, 0, 0, 0, '2020-06-01 00:33:02', '2020-06-01 00:33:10',
        '2020-06-01 00:33:17');
INSERT INTO `post`
VALUES (4, '<h1 id=\"moon-first-blog\">MOON_FIRST_BLOG</h1>\n<p>123456789</p>\n',
        '# MOON_FIRST_BLOG\n123456789', '最多展示70个字', 0, 0, 'DDDDD', 'KKKKK', NULL, 'MOON_FIRST_BLOG',
        NULL, 0, 3, 0, 0, 0, 0, 0, 0, '2020-06-05 00:33:02', '2020-05-01 00:33:10',
        '2020-05-01 00:33:17');

-- ----------------------------
-- Table structure for post_category
-- ----------------------------
DROP TABLE IF EXISTS `post_category`;
CREATE TABLE `post_category`
(
    `id`          INT(11)  NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `category_id` INT(11)  NOT NULL COMMENT '文章分类ID',
    `post_id`     INT(11)  NOT NULL COMMENT '文章ID',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `post_category_post_id` (`post_id`) USING BTREE,
    INDEX `post_category_category_id` (`category_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单文章关联表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of posts_categories
-- ----------------------------
INSERT INTO `post_category`
VALUES (1, 1, 1, '2020-06-25 00:39:39', '2020-06-25 00:39:43');
INSERT INTO `post_category`
VALUES (2, 1, 2, '2020-06-25 00:40:32', '2020-06-25 00:40:34');

-- ----------------------------
-- Table structure for post_tag
-- ----------------------------
DROP TABLE IF EXISTS `post_tag`;
CREATE TABLE `post_tag`
(
    `id`          INT(11)  NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `post_id`     INT(11)  NOT NULL COMMENT '文章ID',
    `tag_id`      INT(11)  NOT NULL COMMENT '标签ID',
    `priority`    INT(11)  NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `post_tag_post_id` (`post_id`) USING BTREE,
    INDEX `post_tag_tag_id` (`tag_id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '文章标签关联表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post_tag
-- ----------------------------
INSERT INTO `post_tag`
VALUES (1, 1, 1, 1, '2020-05-17 14:05:32', '2020-05-17 14:05:32');
INSERT INTO `post_tag`
VALUES (2, 1, 2, 2, '2020-06-07 15:36:37', '2020-06-07 15:36:37');
INSERT INTO `post_tag`
VALUES (3, 2, 1, 4, '2020-06-07 15:36:37', '2020-06-07 15:36:37');
INSERT INTO `post_tag`
VALUES (4, 1, 1, 3, '2020-07-02 00:10:04', '2020-07-02 00:10:07');

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`
(
    `id`          INT(11)      NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `name`        VARCHAR(255) NOT NULL COMMENT '标签名称',
    `desc`        VARCHAR(255)          DEFAULT NULL COMMENT '描述',
    `priority`    INT(11)      NOT NULL DEFAULT 0 COMMENT '排序，数值越大位置越靠前，0表示不排序',
    `status`      TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '状态:0正常;1停用',
    `deleted`     TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '删除标志:0正常;1删除',
    `create_time` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `tag_name` (`name`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '标签表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tag`
VALUES (1, 'spring', NULL, 0, 0, 0, '2020-05-17 13:42:56', '2020-05-17 13:42:56');
INSERT INTO `tag`
VALUES (2, 'java', NULL, 0, 0, 0, '2020-06-07 15:07:10', '2020-06-07 15:07:10');
INSERT INTO `tag`
VALUES (3, 'netty', NULL, 0, 0, 0, '2020-07-02 00:10:37', '2020-07-02 00:10:40');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`          INT(11)      NOT NULL AUTO_INCREMENT COMMENT 'ID主键自增',
    `avatar`      VARCHAR(1023)         DEFAULT NULL COMMENT '头像地址',
    `description` VARCHAR(1023)         DEFAULT NULL COMMENT '描述',
    `email`       VARCHAR(127)          DEFAULT NULL COMMENT 'email',
    `expire_time` DATETIME(6)           DEFAULT NULL COMMENT '过期时间',
    `nickname`    VARCHAR(255) NOT NULL COMMENT '昵称',
    `password`    VARCHAR(255) NOT NULL COMMENT '密码',
    `username`    VARCHAR(50)  NOT NULL COMMENT '登录名',
    `create_time` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `user`
VALUES (1, '/attachments/2010011600095429.jpg', '今宵酒醒何处杨柳岸晓风残月', '2947003449@qq.com',
        '2020-05-17 10:42:58.319000', '小月',
        '$2a$10$0/nzWRXsgpUzO9uJ45bH4uP7xx7Z10E8KR2yRWXZk67wVTgRpn8ka', 'moon',
        '2020-05-17 10:42:58', '2020-05-18 12:25:46');
