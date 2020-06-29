package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import lombok.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 描述: MenusVO
 * 创建人: 小月
 * 创建时间: 2020-06-28 23:12:34
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Menus")
public class MenusVO implements Serializable {
    private static final long serialVersionUID = 1L;

    public interface IndexMenusVIew extends SimpleView.ReturnDataView {
    }

    /**
     * ID主键自增
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("ID主键自增")
    private String id;

    /**
     * 图标
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("图标")
    private String icon;

    /**
     * 名称
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("名称")
    private String name;

    /**
     * 父ID
     */
    @ApiModelProperty("父ID")
    private String parentId;

    /**
     * 位置
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("位置")
    private String priority;

    /**
     * 打开方式
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("打开方式")
    private String target;

    /**
     * 地址
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("地址")
    private String url;

    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty("状态:0正常;1停用")
    private String status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private String delFlag;

    /**
     * 关联文章分类标志:0关联;1不关联
     */
    @ApiModelProperty("关联文章分类标志:0关联;1不关联")
    private String categoriesFlag;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private String createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private String updateTime;

    /**
     * 图片名称
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("图片名称")
    private String photoName;

    /**
     * 图片描述
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("图片描述")
    private String photoDesc;

    /**
     * 图片地址
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("图片地址")
    private String photoUrl;

    /**
     * 子菜单
     */
    @JsonView(IndexMenusVIew.class)
    @ApiModelProperty("子菜单")
    private List<MenusVO> subMenusVO;


}
