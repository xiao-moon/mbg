package com.moon.generator.service;

import com.moon.generator.config.GenConfig;
import com.moon.generator.entity.GenTableColumn;
import com.moon.generator.utils.GenUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

/**
 * 描述: 生成代码
 * 创建人: 小月
 * 创建时间: 2020-06-27 23:15
 */
@Service
public class VelocityService {

    /**
     * 生成
     */
    public void velocity(Map<String, List<GenTableColumn>> genTables) {
        //初始化Velocity
        VelocityEngine ve = initVE();

        //遍历模板列表
        List<Map<String, String>> maps = templatesList();
        for (Map<String, String> map : maps) {
            for (String tableName : genTables.keySet()) {
                String clazzName = GenUtil.firstUpper(tableName);
                String path = map.get("prefixPath") + clazzName + map.get("suffixPath");
                //判断是否需要往下执行
                boolean type = booleanCover(new File(path), map.get("type"));
                if (!type) {
                    break;
                }
                Template t = ve.getTemplate(map.get("template"));
                //存入变量
                VelocityContext vc = velocityContext(tableName, genTables.get(tableName));
                StringWriter writer = new StringWriter();
                t.merge(vc, writer);
                String attachContent = writer.toString();
                saveAsFile(path, attachContent);
            }

        }
    }

    private VelocityEngine initVE() {
        VelocityEngine ve = new VelocityEngine();
        Properties prop = new Properties();
        // 加载classpath目录下的vm文件
        prop.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 定义字符集
        prop.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        // 初始化Velocity引擎，指定配置Properties
        ve.init(prop);
        return ve;
    }

    /**
     * 存入变量
     */
    private VelocityContext velocityContext(String tableName, List<GenTableColumn> columns) {
        VelocityContext vc = new VelocityContext();
        vc.put("nowTime", GenUtil.getNowTime());
        vc.put("iAuthor", GenConfig.iAuthor);
        vc.put("doReference", GenConfig.doReference);
        vc.put("dtoReference", GenConfig.dtoReference);
        vc.put("mapperReference", GenConfig.mapperReference);
        vc.put("serviceReference", GenConfig.serviceReference);
        vc.put("serviceImplReference", GenConfig.serviceImplReference);
        vc.put("controllerReference", GenConfig.controllerReference);
        vc.put("mapperXMLPath", GenConfig.mapperXMLPath);
        vc.put("baseJavaPath", GenConfig.baseJavaPath);
        vc.put("baseResourcesPath", GenConfig.baseResourcesPath);
        vc.put("isMybatisPlus", GenConfig.isMybatisPlus);
        vc.put("genDo", GenConfig.genDo);
        vc.put("lombokBuilder", GenConfig.lombokBuilder);
        vc.put("lombokData", GenConfig.lombokData);
        vc.put("coverDo", GenConfig.coverDo);
        vc.put("genMapper", GenConfig.genMapper);
        vc.put("coverMapper", GenConfig.coverMapper);
        vc.put("genDto", GenConfig.genDto);
        vc.put("swagger2", GenConfig.swagger2);
        vc.put("coverDto", GenConfig.coverDto);
        vc.put("genService", GenConfig.genService);
        vc.put("coverService", GenConfig.coverService);
        vc.put("genController", GenConfig.genController);
        vc.put("isRestController", GenConfig.isRestController);
        vc.put("coverController", GenConfig.coverController);
        vc.put("genMapperXML", GenConfig.genMapperXML);
        vc.put("coverMapperXML", GenConfig.coverMapperXML);
        vc.put("tableName", tableName);
        vc.put("clazzName", GenUtil.firstUpper(tableName));
        for (GenTableColumn column : columns) {
            column.setFieldName(GenUtil.firstLower(column.getColumnName()));
            column.setFieldNameUpper(GenUtil.firstUpper(column.getColumnName()));
            column.setFieldType(GenUtil.matchDataType(column.getDataType()));
            column.setFieldImport(GenUtil.matchDataTypeImport(column.getDataType()));

        }
        vc.put("columns", columns);
        return vc;
    }

    /**
     * 获取模板列表
     */
    private List<Map<String, String>> templatesList() {
        List<Map<String, String>> templates = new ArrayList<>();
        if (GenConfig.genDo) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/entity.vm");
            map.put("prefixPath", GenConfig.baseJavaPath + GenConfig.doReference.replace(".", "/") + "/");
            map.put("suffixPath", ".java");
            map.put("type", "DO");
            templates.add(map);
        }
        if (GenConfig.genDto) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/dto.vm");
            map.put("prefixPath", GenConfig.baseJavaPath + GenConfig.dtoReference.replace(".", "/") + "/");
            map.put("suffixPath", "DTO.java");
            map.put("type", "DTO");
            templates.add(map);
        }
        if (GenConfig.genMapper) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/mapper.vm");
            map.put("prefixPath", GenConfig.baseJavaPath + GenConfig.mapperReference.replace(".", "/") + "/");
            map.put("suffixPath", "Mapper.java");
            map.put("type", "MAPPER");
            templates.add(map);
        }
        if (GenConfig.genService) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/service.vm");
            map.put("prefixPath", GenConfig.baseJavaPath + GenConfig.serviceReference.replace(".", "/") + "/");
            map.put("suffixPath", "Service.java");
            map.put("type", "SERVICE");
            templates.add(map);

            Map<String, String> map1 = new HashMap<>();
            map1.put("template", "vm/serviceImpl.vm");
            map1.put("prefixPath", GenConfig.baseJavaPath + GenConfig.serviceImplReference.replace(".", "/") + "/");
            map1.put("suffixPath", "ServiceImpl.java");
            map1.put("type", "SERVICEIMPL");
            templates.add(map1);
        }
        if (GenConfig.genController) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/controller.vm");
            map.put("prefixPath", GenConfig.baseJavaPath + GenConfig.controllerReference.replace(".", "/") + "/");
            map.put("suffixPath", "Controller.java");
            map.put("type", "CONTROLLER");
            templates.add(map);
        }
        if (GenConfig.genMapperXML) {
            Map<String, String> map = new HashMap<>();
            map.put("template", "vm/mapper.xml.vm");
            map.put("prefixPath", GenConfig.baseResourcesPath + GenConfig.mapperXMLPath);
            map.put("suffixPath", "Mapper.xml");
            map.put("type", "MAPPERXML");
            templates.add(map);
        }
        return templates;
    }


    private void saveAsFile(String file, String content) {

        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(file);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    /**
     * true:覆盖
     * false:不覆盖
     */
    private boolean booleanCover(File file, String type) {
        //是否继续往下执行
        boolean icontinue = true;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        Map<String, Boolean> map = new HashMap<>();
        map.put("DO", GenConfig.coverDo);
        map.put("DTO", GenConfig.coverDto);
        map.put("MAPPER", GenConfig.coverMapper);
        map.put("SERVICE", GenConfig.coverService);
        map.put("SERVICEIMPL", GenConfig.coverService);
        map.put("CONTROLLER", GenConfig.coverController);
        map.put("MAPPERXML", GenConfig.coverMapperXML);
        for (String key : map.keySet()) {
            if (type.equalsIgnoreCase(key)) {
                //覆盖
                if (map.get(key)) {
                    if (file.exists()) {
                        //如果存在,删除原来的
                        file.delete();
                    }
                    return icontinue;
                } else {//不覆盖
                    //如果存在，不继续往下执行
                    if (file.exists()) {
                        icontinue = false;
                        return icontinue;
                    } else {//否则，继续往下执行
                        return icontinue;
                    }
                }
            }
        }
        throw new RuntimeException("booleanFile报错");

    }

}
