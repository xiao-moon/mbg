package com.moon.generator.utils;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
    public static String firstUpper(String name) {
        String[] s = name.split("_");
        String firstUpper = "";
        for (int i = 0; i < s.length; i++) {
            firstUpper = firstUpper + s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()).toLowerCase();
        }
        return firstUpper;
    }

    /**
     * 首字母小写
     */
    public static String firstLower(String name) {
        String[] s = name.split("_");
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
                return "Integer";
            case "INTEGER":
                return "Integer";
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

    /**
     * 将mysql类型转换为对应的java类型的import
     */
    public static String matchDataTypeImport(String dataType) {

        switch (dataType.toUpperCase()) {
            case "VARCHAR":
                return null;
            case "CHAR":
                return null;
            case "TEXT":
                return null;
            case "LONGTEXT":
                return null;
            case "INT":
                return null;
            case "INTEGER":
                return null;
            case "TINYINT":
                return null;
            case "SMALLINT":
                return null;
            case "MEDIUMINT":
                return null;
            case "BIT":
                return null;
            case "BIGINT":
                return null;
            case "FLOAT":
                return null;
            case "DOUBLE":
                return null;
            case "DECIMAL":
                return "java.math.BigDecimal";
            case "BOOLEAN":
                return null;
            case "ID":
                return null;//主键，long大一点
            case "DATE":
                return "java.util.Date";
            case "TIME":
                return "java.sql.Time";
            case "DATETIME":
                return "java.util.Date";
            case "TIMESTAMP":
                return "java.util.Date";
            case "YEAR":
                return "java.util.Date";
        }
        return null;
    }

    public static String getNowTime() {
        //获取当前时间
        LocalDateTime time = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai")));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowTime = time.format(formatter);
        return nowTime;
    }

}
