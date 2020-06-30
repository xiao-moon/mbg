package com.moon.model.supports;

/**
 * 描述: 定义基础的JsonView
 * 创建人: 小月
 * 创建时间: 2020-06-25 20:50
 */
public class SimpleView {

    public interface CommonView{}
    public interface ReturnDataView extends CommonView{}
    /**
     * 首页返回展示
     */
    public interface IndexMenusVIew extends ReturnDataView{}
}
