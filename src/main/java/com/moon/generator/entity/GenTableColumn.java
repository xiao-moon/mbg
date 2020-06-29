package com.moon.generator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020/6/28 3:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@TableName("INFORMATION_SCHEMA.COLUMNS")
public class GenTableColumn implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 字段值永远是def
     */
//    @TableId
//    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    /**
     * 表格所属的库
     */
//    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    /**
     * 表名
     */
//    @TableField("TABLE_NAME")
    private String tableName;

    /**
     * 字段名
     */
//    @TableField("COLUMN_NAME")
    private String columnName;

    /**
     * 字段标识
     * 其实就是字段编号，从1开始往后排。
     */
//    @TableField("ORDINAL_POSITION")
    private String ordinalPosition;

    /**
     * 列的默认值
     */
//    @TableField("COLUMN_DEFAULT")
    private String columnDefault;

    /**
     * 字段标识
     */
//    @TableField("IS_NULLABLE")
    private String isNullable;

    /**
     * 字段标识
     */
//    @TableField("DATA_TYPE")
    private String dataType;

    /**
     * 字段的最大字符数
     */
//    @TableField("CHARACTER_MAXIMUM_LENGTH")
    private String characterMaximumLength;

    /**
     * 对于字符串列，最大长度（以字节为单位）。
     */
//    @TableField("CHARACTER_OCTET_LENGTH")
    private String characterOctetLength;

    /**
     * 对于数字列，数字精度
     */
//    @TableField("NUMERIC_PRECISION")
    private String numericPrecision;

    /**
     * 对于数字列，数字刻度。
     */
//    @TableField("NUMERIC_SCALE")
    private String numericScale;

    /**
     * 对于时间列，分数秒精度。
     */
//    @TableField("DATETIME_PRECISION")
    private String datetimePrecision;

    /**
     * 对于字符串列，字符集名称。
     */
//    @TableField("CHARACTER_SET_NAME")
    private String characterSetName;

    /**
     * 对于字符串列，归类名称。
     */
//    @TableField("COLLATION_NAME")
    private String collationName;

    /**
     * 列数据类型。
     */
//    @TableField("COLUMN_TYPE")
    private String columnType;

    /**
     * 列是否被索引
     */
//    @TableField("COLUMN_KEY")
    private String columnKey;

    /**
     * 列是否被索引
     */
//    @TableField("EXTRA")
    private String extra;


    /**
     * 自增列
     */
//    @TableField("COLUMN_COMMENT")
    private String columnComment;

    /**
     * 组合字段的公式
     */
//    @TableField("GENERATION_EXPRESSION")
    private String generationExpression;

    /**
     * 权限
     * 多个权限用逗号隔开，比如 select,insert,update,references
     */
//    @TableField("PRIVILEGES")
    private String privileges;

    /**
     * 变量名
     */
    private String fieldName;

    /**
     * 首字母大写
     */
    private String fieldNameUpper;

    /**
     * 变量类型
     */
    private String fieldType;

    /**
     * 变量类型import
     */
    private String fieldImport;

    /**
     * 查询方式 like = 不等于...
     */
    private String queryType;

}