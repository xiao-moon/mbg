//package com.moon.generator.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.io.Serializable;
//import java.util.List;
//
///**
// * 业务表 gen_table
// *
// * @author moon
// */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "INFORMATION_SCHEMA.TABLES")
//public class GenTable implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    /**
//     * 编号
//     */
//    private Long tableId;
//
//    /**
//     * 表名称
//     */
//    private String tableName;
//
//    /**
//     * 表描述
//     */
////    @NotBlank(message = "表描述不能为空")
//    private String tableComment;
//
//    /**
//     *表的数据列数
//     */
//    private Long tableRows;
//
//    /**
//     *数据库名称
//     */
//    private String tableSchema;
//
//
//    /**
//     * 实体类名称(首字母大写)
//     */
//    private String className;
//
//    /**
//     * 使用的模板（crud单表操作 tree树表操作）
//     */
//    private String tplCategory;
//
//    /**
//     * 表创建的时间
//     */
//    private String createTableTime;
//
//    /**
//     * 生成包路径
//     */
//    private String packageName;
//
//    /**
//     * 生成模块名
//     */
////    @NotBlank(message = "生成模块名不能为空")
//    private String moduleName;
//
//    /**
//     * 生成业务名
//     */
////    @NotBlank(message = "生成业务名不能为空")
//    private String businessName;
//
//    /**
//     * 生成功能名
//     */
//    private String functionName;
//
//    /**
//     * 生成作者
//     */
//    private String functionAuthor;
//
//    /**
//     * 主键信息
//     */
//    private GenTableColumn pkColumn;
//
//    /**
//     * 表列信息
//     */
//    private List<GenTableColumn> columns;
//
//    /**
//     * 其它生成选项
//     */
//    private String options;
//
//    /**
//     * 树编码字段
//     */
//    private String treeCode;
//
//    /**
//     * 树父编码字段
//     */
//    private String treeParentCode;
//
//    /**
//     * 树名称字段
//     */
//    private String treeName;
//
//}