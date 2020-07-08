package com.moon.generator.config;

/**
 * 描述: 配置
 * 创建人：小月
 * 创建时间：2020-06-27 17:34
 */
public class GenConfig {
    /*自定义配置*/
    public static String iAuthor = "小月";//作者
    public static String doReference = "com.moon.model.entity";//DO包路径
    public static String dtoReference = "com.moon.model.dto";//DTO包路径
    public static String voReference = "com.moon.model.vo";//DTO包路径
    public static String mapperReference = "com.moon.mapper";//mapper包路径
    public static String serviceReference = "com.moon.service";//service包路径
    public static String serviceImplReference = "com.moon.service.impl";//serviceImpl包路径
    public static String controllerReference = "com.moon.controller.content";//controller包路径
    public static String mapperXMLPath = "mybatis/mapper/";//mapper.xml包路径


    /*全局配置*/
    public static boolean isMybatisPlus = false;//是否使用mybatis-plus 否表示使用原生mybatis
    public static String[] excludeTable = {
            "flyway_schema_history",
            "attachments",
            "attachments_categories",
            "attachments_menus",
            "attachments_posts",
            "categories",
            "comments",
            "journals",
            "menus",
            "photos",
            "photos_type",
            "posts_categories",
            "posts_tags",
            "posts",
            "tags",
            "users"
            };//排除的表

    /*DO配置*/
    public static boolean genDo = true;//是否生成DO层
    public static boolean lombokData = true;//是否生成lombok data all no 三个注解
    public static boolean lombokBuilder = true;//是否生成lombok builder注解
    public static boolean coverDo = true;//是否覆盖原DO层

    /*Mapper配置*/
    public static boolean genMapper = true;//是否生成Mapper层
    public static boolean coverMapper = true;//是否覆盖原Mapper层

    /*DTO配置*/
    public static boolean genDto = false;//是否生成DTO层
    public static boolean coverDto = false;//是否覆盖原DTO层

    /*VO配置*/
    public static boolean genVo = true;//是否生成VO层
    public static boolean swagger2 = true;//是否生成swagger2注解
    public static boolean coverVo = true;//是否覆盖原VO层

    /*Service配置*/
    public static boolean genService = false;//是否生成Service层
    public static boolean coverService = false;//是否覆盖原DTO层

    /*Controller配置*/
    public static boolean genController = false;//是否生成Controller层
    public static boolean isRestController = false;//是否生成RestController
    public static boolean coverController = false;//是否覆盖原DTO层

    /*Mapper.xml配置*/
    public static boolean genMapperXML = true;//是否生成mapper.xml
    public static boolean coverMapperXML = true;//是否覆盖原Mapper.xml

    /*其他配置*/
    private static String rootPath = System.getProperty("user.dir").replace("\\\\", "/");
    public static String baseJavaPath = rootPath + "/src/main/" + "java/";//获取项目java根路径
    public static String baseResourcesPath = rootPath + "/src/main/" + "static/";//获取项目resources根路径
}
