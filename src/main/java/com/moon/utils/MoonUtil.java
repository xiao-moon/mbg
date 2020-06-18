package com.moon.utils;

import java.util.Collection;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-15 00:45
 */
public class MoonUtil {

    /**
     * 判断集合是否为空
     */
    public static boolean isNotNullList(Collection c) {
        if (c != null && c.size() > 0) {
            return true;
        }
        return false;
    }

}
