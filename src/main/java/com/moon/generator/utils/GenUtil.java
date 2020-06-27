package com.moon.generator.utils;

import java.util.Collection;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-04 23:44
 */
public class GenUtil {

    /**
     * 首字母大写
     */
    public static String firstUpper(String[] s) {
        String firstUpper = "";
        for (int i = 0; i < s.length; i++) {
            firstUpper = firstUpper + s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()).toLowerCase();
        }
        return firstUpper;
    }

    /**
     * 首字母小写
     */
    public static String firstLower(String[] s) {
        String firstLower = "";
        for (int i = 0; i < s.length; i++) {
            if (i == 0) {
                firstLower = firstLower + s[i].substring(0, 1).toLowerCase() + s[i].substring(1, s[i].length()).toLowerCase();
            } else {
                firstLower = firstLower + s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()).toLowerCase();
            }
        }
        return firstLower;
    }

    /**
     * 判断集合是否为空
     */
    public static boolean isNotNullList(Collection c) {
        if (c != null && c.size() > 0) {
            return true;
        }
        return false;
    }


    /**
     * 将mysql类型转换为对应的java类型的字符串
     */
    public static String matchDataType(String dataType) {
        switch (dataType.toUpperCase()) {
            case "VARCHAR":
                return "String";
            case "CHAR":
                return "String";
            case "TEXT":
                return "String";
            case "LONGTEXT":
                return "String";
            case "INT":
                return "Long";
            case "INTEGER":
                return "Long";
            case "TINYINT":
                return "Integer";
            case "SMALLINT":
                return "Integer";
            case "MEDIUMINT":
                return "Integer";
            case "BIT":
                return "Boolean";
            case "BIGINT":
                return "Long";
            case "FLOAT":
                return "Float";
            case "DOUBLE":
                return "Double";
            case "DECIMAL":
                return "BigDecimal";
            case "BOOLEAN":
                return "Integer";
            case "ID":
                return "Long";//主键，long大一点
            case "DATE":
                return "Date";
            case "TIME":
                return "Time";
            case "DATETIME":
                return "Date";
            case "TIMESTAMP":
                return "Date";
            case "YEAR":
                return "Date";
        }
        return null;
    }

}
