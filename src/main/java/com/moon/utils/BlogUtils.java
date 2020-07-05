package com.moon.utils;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 00:08
 */
public class BlogUtils {

    /**
     * 将HTML转换为TXT
     */
    public static String htmlToTxt(String html) {
        String content = html.replaceAll("\\<.*?\\>", "");
        content = content.replace("\n", "");
        content = StringEscapeUtils.unescapeHtml(content);
        return content;
    }

}
