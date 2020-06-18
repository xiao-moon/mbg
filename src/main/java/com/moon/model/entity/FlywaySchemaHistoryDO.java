//package com.moon.model.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import javax.persistence.Table;
//import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Entity;
//import javax.persistence.Column;
//import javax.persistence.Id;
//import java.io.Serializable;
//import java.sql.Date;
//import java.sql.Time;
//import java.sql.Timestamp;
//import java.math.BigDecimal;
//import java.lang.Double;
//import java.lang.Float;
//import java.lang.Boolean;
//import java.lang.Integer;
//import java.lang.Long;
//
///**
// * 描述: FlywaySchemaHistoryDO实体类
// * 创建人: 小月
// * 创建时间: 2020-06-17 02:00:33
// */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "flyway_schema_history")
//public class FlywaySchemaHistoryDO implements Serializable {
//
//    /**
//     *
//     */
//    @Column(name ="installed_rank")
//    private Long installedRank;
//
//    /**
//     *
//     */
//    @Column(name ="version")
//    private String version;
//
//    /**
//     *
//     */
//    @Column(name ="description")
//    private String description;
//
//    /**
//     *
//     */
//    @Column(name ="type")
//    private String type;
//
//    /**
//     *
//     */
//    @Column(name ="script")
//    private String script;
//
//    /**
//     *
//     */
//    @Column(name ="checksum")
//    private Long checksum;
//
//    /**
//     *
//     */
//    @Column(name ="installed_by")
//    private String installedBy;
//
//    /**
//     *
//     */
//    @Column(name ="installed_on")
//    private Timestamp installedOn;
//
//    /**
//     *
//     */
//    @Column(name ="execution_time")
//    private Long executionTime;
//
//    /**
//     *
//     */
//    @Column(name ="success")
//    private Integer success;
//
//
//}
