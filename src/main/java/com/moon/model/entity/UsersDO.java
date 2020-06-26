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
import java.sql.Time;
import java.util.Date;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;

/**
 * 描述: UsersDO实体类
 * 创建人: 小月
 * 创建时间: 2020-06-26 01:28:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UsersDO implements Serializable {

    /**
     * 头像地址
     */
    @Column(name ="avatar")
    private String avatar;

    /**
     * 创建时间
     */
    @Column(name ="create_time")
    private Date createTime;

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
    private Date expireTime;

    /**
     * ID主键自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

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
     * 更新时间
     */
    @Column(name ="update_time")
    private Date updateTime;

    /**
     * 登录名
     */
    @Column(name ="username")
    private String username;


}
