package com.moon.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 描述: Menus
 * 创建人: 小月
 * 创建时间: 2020-06-29 20:23:44
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联文章分类标志:0关联;1不关联
     */
    private Integer categoriesFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标志:0正常;1删除
     */
    private Integer delFlag;

    /**
     * 图标
     */
    private String icon;

    /**
     * ID主键自增
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 位置
     */
    private Integer priority;

    /**
     * 状态:0正常;1停用
     */
    private Integer status;

    /**
     * 打开方式
     */
    private String target;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 地址
     */
    private String url;

    /**
     * 关联图片表
     */
    private Photos photos;

    /**
     * 关联子菜单
     */
    private List<Menus> subMenus;


}
