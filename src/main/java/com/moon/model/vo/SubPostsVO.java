package com.moon.model.vo;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 描述: PostsVO
 * 创建人: 小月
 * 创建时间: 2020-07-01 01:56:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("Posts")
public class SubPostsVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonView(SimpleView.TimeAxisView.class)
    private String id;

    @JsonView(SimpleView.TimeAxisView.class)
    private String title;

    @JsonView(SimpleView.TimeAxisView.class)
    private String createTime;


    /**
     * 临时使用
     */
    private Object temp;

}
