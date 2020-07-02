package com.moon.model.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.*;

import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
 * 描述: Comments
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 允许通知:0允许;1不允许
     */
    private Integer allowNotification;

    /**
     * 评价人
     */
    private String author;

    /**
     * 评价人个人站点URL
     */
    private String authorUrl;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * email
     */
    private String email;

    /**
     * ID
     */
    private Integer id;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 是否管理员:0是;1不是
     */
    private Integer isAdmin;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 文章ID
     */
    private Integer postId;

    /**
     * 回复给的人的ID
     */
    private Integer responseId;

    /**
     * 是否置顶:0不置顶;1置顶
     */
    private Integer topFlag;

    /**
     * 置顶位置排序，数值越小位置越靠前，0表示不排序
     */
    private Integer topPriority;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 浏览器信息
     */
    private String userAgent;

    /**
     * 评价数量
     */
    private Integer count;


}
