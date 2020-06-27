package com.moon.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
/**
 * 该代码由mybatis-plus-generator-ui自动生成
 *
 * @author moon
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MenusDTO {

    private Integer id;

    private String icon;

    private String name;

    private Integer parentId;

    private Integer priority;

    private String target;

    private String url;

    private Integer status;

    private Integer delFlag;

    private Integer categoriesFlag;

    private Date createTime;

    private Date updateTime;

}
