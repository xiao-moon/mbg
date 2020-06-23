package com.moon.generator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 代码生成业务字段表 gen_table_column
 *
 * @author moon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "INFORMATION_SCHEMA.COLUMNS")
public class GenTableColumn implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 字段值永远是def
     */
    @Id
    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    /**
     * 表格所属的库
     */
    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    /**
     * 表名
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * 字段名
     */
    @Column(name = "COLUMN_NAME")
    private String columnName;

    /**
     * 字段标识
     * 其实就是字段编号，从1开始往后排。
     */
    @Column(name = "ORDINAL_POSITION")
    private String ordinalPosition;

    /**
     * 列的默认值
     */
    @Column(name = "COLUMN_DEFAULT")
    private String columnDefault;

    /**
     * 字段标识
     */
    @Column(name = "IS_NULLABLE")
    private String isNullable;

    /**
     * 字段标识
     */
    @Column(name = "DATA_TYPE")
    private String dataType;

    /**
     * 字段的最大字符数
     */
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    private String characterMaximumLength;

    /**
     * 对于字符串列，最大长度（以字节为单位）。
     */
    @Column(name = "CHARACTER_OCTET_LENGTH")
    private String characterOctetLength;

    /**
     * 对于数字列，数字精度
     */
    @Column(name = "NUMERIC_PRECISION")
    private String numericPrecision;

    /**
     * 对于数字列，数字刻度。
     */
    @Column(name = "NUMERIC_SCALE")
    private String numericScale;

    /**
     * 对于时间列，分数秒精度。
     */
    @Column(name = "DATETIME_PRECISION")
    private String datetimePrecision;

    /**
     * 对于字符串列，字符集名称。
     */
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    /**
     * 对于字符串列，归类名称。
     */
    @Column(name = "COLLATION_NAME")
    private String collationName;

    /**
     * 列数据类型。
     */
    @Column(name = "COLUMN_TYPE")
    private String columnType;

    /**
     * 列是否被索引
     */
    @Column(name = "COLUMN_KEY")
    private String columnKey;

    /**
     * 列是否被索引
     */
    @Column(name = "EXTRA")
    private String extra;


    /**
     * 自增列
     */
    @Column(name = "COLUMN_COMMENT")
    private String columnComment;

    /**
     * 组合字段的公式
     */
    @Column(name = "GENERATION_EXPRESSION")
    private String generationExpression;

    /**
     * 权限
     * 多个权限用逗号隔开，比如 select,insert,update,references
     */
    @Column(name = "PRIVILEGES")
    private String privileges;


}