package com.moon.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;

/**
 * 描述: AttachmentsDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attachments")
public class AttachmentsDO implements Serializable {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Timestamp createTime;

    /**
     * 修改时间
     */
    @Column(name ="update_time")
    private Timestamp updateTime;

    /**
     * 文件KEY
     */
    @Column(name ="file_key")
    private String fileKey;

    /**
     * 高度
     */
    @Column(name ="height")
    private Long height;

    /**
     * 类型
     */
    @Column(name ="media_type")
    private String mediaType;

    /**
     * 名称
     */
    @Column(name ="name")
    private String name;

    /**
     * 路径
     */
    @Column(name ="path")
    private String path;

    /**
     * 尺寸
     */
    @Column(name ="size")
    private Long size;

    /**
     * 前缀
     */
    @Column(name ="suffix")
    private String suffix;

    /**
     * 路径
     */
    @Column(name ="thumb_path")
    private String thumbPath;

    /**
     * 类型
     */
    @Column(name ="type")
    private Long type;

    /**
     * 宽度
     */
    @Column(name ="width")
    private Long width;


}
