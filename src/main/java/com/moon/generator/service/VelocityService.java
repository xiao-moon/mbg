package com.moon.generator.service;

import com.moon.generator.config.GenConfig;
import com.moon.generator.entity.GenTableColumn;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
    private void gen(Map<String, List<GenTableColumn>> genTables) throws Exception {
        String replace = GenConfig.doReference.replace(".", "/");
        String parentFilePath = GenConfig.baseJavaPath + replace;
        //初始化Velocity
        VelocityEngine ve = initVE();

        //遍历模板列表
        List<String> templates = templatesList();
        for (String template : templates) {
            for (String tableName : genTables.keySet()) {
                Template t = ve.getTemplate(template);
                //存入变量
                VelocityContext vc = velocityContext(tableName, genTables.get(tableName));
                StringWriter writer = new StringWriter();
                t.merge(vc, writer);
                String attachContent = writer.toString();
                saveAsFile("", attachContent);
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
    public VelocityContext velocityContext(String tableName, List<GenTableColumn> columns) {
        VelocityContext vc = new VelocityContext();
        vc.put("", "");
        return vc;
    }

    /**
     * 获取模板列表
     */
    public List<String> templatesList() {
        List<String> templates = new ArrayList<String>();
        if (GenConfig.genDo) {
            templates.add("vm/entity.vm");
        }
        if (GenConfig.genDto) {
            templates.add("vm/dto.vm");
        }
        if (GenConfig.genMapper) {
            templates.add("vm/dto.vm");
        }
        if (GenConfig.genService) {
            templates.add("vm/service.vm");
            templates.add("vm/serviceImpl.vm");
        }
        if (GenConfig.genController) {
            templates.add("vm/controller.vm");
        }
        if (GenConfig.genMapperXML) {
            templates.add("vm/mapper.xml.vm");
        }
        return templates;
    }


    public void saveAsFile(String file, String content) {

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


    private boolean createFile(File file) {
        //是否继续往下执行
        boolean icontinue = true;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        //覆盖
        if (GenConfig.coverDo) {
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
