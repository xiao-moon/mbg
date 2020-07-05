package com.moon.model.supports;

/**
 * 描述: 定义基础的JsonView
 * 创建人: 小月
 * 创建时间: 2020-06-25 20:50
 */
public class SimpleView {

    public interface CommonView {
    }

    public interface ReturnDataView extends CommonView {
    }

    /**
     * 首页返回展示
     */
    public interface IndexVIew extends ReturnDataView {
    }

    /**
     * 时间轴
     */
    public interface TimeAxisView extends ReturnDataView {
    }

    /**
     * 日记随笔
     */
    public interface JournalsView extends ReturnDataView {
    }

    /**
     * 标签
     */
    public interface TagsView extends ReturnDataView {
    }

    /**
     * 图片及分类
     */
    public interface PhotosView extends ReturnDataView {
    }

}
