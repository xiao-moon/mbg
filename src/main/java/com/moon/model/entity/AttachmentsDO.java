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
 * 创建时间: 2020-06-24 00:45:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attachments")
public class AttachmentsDO implements Serializable {

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    /**
     * 名称
     */
    @Column(name ="name")
    private String name;

    /**
     * 媒体类型
     */
    @Column(name ="media_type")
    private String mediaType;

    /**
     * 后缀
     */
    @Column(name ="suffix")
    private String suffix;

    /**
     * 文件绝对路径
     */
    @Column(name ="absolute_file_path")
    private String absoluteFilePath;

    /**
     * 文件相对路径--访问路径
     */
    @Column(name ="relative_file_path")
    private String relativeFilePath;

    /**
     * 文件大小;单位KB
     */
    @Column(name ="size")
    private Long size;

    /**
     * 高度:只有图片才有
     */
    @Column(name ="height")
    private Long height;

    /**
     * 宽度:只有图片才有
     */
    @Column(name ="width")
    private Long width;

    /**
     * 文件类型:0图片,1其他
     */
    @Column(name ="type")
    private Long type;

    /**
     * 状态:0正常;1停用
     */
    @Column(name ="status")
    private Long status;

    /**
     * 删除标志:0正常;1删除
     */
    @Column(name ="del_flag")
    private Long delFlag;

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @Column(name ="update_time")
    private Timestamp updateTime;


}
