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
 * 描述: UsersDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-17 02:00:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UsersDO implements Serializable {

    /**
     * ID主键自增
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
     * 更新时间
     */
    @Column(name ="update_time")
    private Timestamp updateTime;

    /**
     * 头像
     */
    @Column(name ="avatar")
    private String avatar;

    /**
     * 描述
     */
    @Column(name ="description")
    private String description;

    /**
     * email
     */
    @Column(name ="email")
    private String email;

    /**
     * 过期时间
     */
    @Column(name ="expire_time")
    private Timestamp expireTime;

    /**
     * mfa_key
     */
    @Column(name ="mfa_key")
    private String mfaKey;

    /**
     * mfa_type
     */
    @Column(name ="mfa_type")
    private Long mfaType;

    /**
     * 昵称
     */
    @Column(name ="nickname")
    private String nickname;

    /**
     * 密码
     */
    @Column(name ="password")
    private String password;

    /**
     * 登录名
     */
    @Column(name ="username")
    private String username;

    /**
     * 当前连接
     */
    @Column(name ="current_connections")
    private Long currentConnections;

    /**
     * 总连接
     */
    @Column(name ="total_connections")
    private Long totalConnections;

    /**
     * user
     */
    @Column(name ="user")
    private String user;


}
