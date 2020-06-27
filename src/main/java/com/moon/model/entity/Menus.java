package com.moon.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * @author moon
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menus")
@Builder
@ApiModel(value="Menus对象", description="菜单表")
public class Menus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID主键自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "父ID")
    private Integer parentId;

    @ApiModelProperty(value = "位置")
    private Integer priority;

    @ApiModelProperty(value = "打开方式")
    private String target;

    @ApiModelProperty(value = "地址")
    private String url;

    @ApiModelProperty(value = "状态:0正常;1停用")
    private Integer status;

    @ApiModelProperty(value = "删除标志:0正常;1删除")
    private Integer delFlag;

    @ApiModelProperty(value = "关联文章分类标志:0关联;1不关联")
    private Integer categoriesFlag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
