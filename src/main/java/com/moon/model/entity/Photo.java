package com.moon.model.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


/**
 * @description 图片表
 * @author moon
 * @date 2023-09-21 17:28:01
 */
@Getter
@Setter
@ApiModel("图片表")
public class Photo {

    /**
     * ID主键自增
     */
    @ApiModelProperty("ID主键自增")
    private Integer id;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;

    /**
     * 存储的位置--本地OR远程
     */
    @ApiModelProperty("存储的位置--本地OR远程")
    private String location;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String url;

    /**
     * 图片分类ID
     */
    @ApiModelProperty("图片分类ID")
    private Integer type;

    /**
     * 排序，数值越大位置越靠前，0表示不排序
     */
    @ApiModelProperty("排序，数值越大位置越靠前，0表示不排序")
    private Integer priority;

    /**
     * 状态:0正常;1停用
     */
    @ApiModelProperty("状态:0正常;1停用")
    private Integer status;

    /**
     * 删除标志:0正常;1删除
     */
    @ApiModelProperty("删除标志:0正常;1删除")
    private Integer delFlag;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;













}
