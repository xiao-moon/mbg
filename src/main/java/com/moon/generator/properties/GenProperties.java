package com.moon.generator.properties;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 创建人：小月
 * 创建时间：2020-06-27 17:52
 */
@Component
public class GenProperties {
    @Value("${spring.datasource.url}")
    public String dataSourceURL;


    public String parseUrl() {
        if (StringUtils.isBlank(dataSourceURL)) {
            throw new RuntimeException("没获取到数据库URL");
        }
        String[] split = dataSourceURL.split(":");
        String ps = split[3];
        String[] split1 = ps.split("/");
        String sm = split1[1];
        String schema = sm.substring(0, sm.indexOf("?"));
        return schema;
    }

}
