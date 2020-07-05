package com.moon.utils;

import com.moon.exception.BeanCopierException;
import com.moon.model.entity.Photos;
import com.moon.model.vo.PhotosVO;
import org.springframework.cglib.beans.BeanCopier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述: 领域模型转换
 * 创建人: 小月
 * 创建时间: 2020/6/1 1:38
 */
public class BeanCopierUtil {

    public static void transDOToVO(Object DO, Object DTO) {
        // 构造转换器对象，最后的参数表示是否需要自定义转换器
        BeanCopier beanCopier = BeanCopier.create(DO.getClass(), DTO.getClass(), true);
        // 转换对象，自定义转换器处理特殊字段
        beanCopier.copy(DO, DTO, (value, target, context) -> {
            // 原始数据value是Date类型，目标类型target是String
            if (value == null) {
                return "";
            }
            System.out.println("----------:" + value);
            if (value instanceof Date) {
                return dateToString(value, target);
            }
            if (value instanceof Long) {
                return longToString(value, target);
            }
            if (value instanceof Integer) {
                return integerToString(value, target);
            }
            if (value instanceof Boolean) {
                return booleanToString(value, target);
            }
//            if (value instanceof Photos) {
//                PhotosVO photosVO = new PhotosVO();
//                transDOToVO(value, photosVO);
//                return photosVO;
//            }
            if (value instanceof List) {
                return dealList(value, target);
            }

            // 未匹配上的字段，原值返回
            return value;

        });
    }


    private static String dateToString(Object value, Class<?> target) {
        if ("String".equals(target.getSimpleName())) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(value);
        }
        try {
            throw new BeanCopierException("timestampToString:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String longToString(Object value, Class<?> target) {
        if ("String".equals(target.getSimpleName())) {
            return value + "";
        }
        try {
            throw new BeanCopierException("longToString:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String integerToString(Object value, Class<?> target) {
        if ("String".equals(target.getSimpleName())) {
            return value + "";
        }
        try {
            throw new BeanCopierException("integerToString:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String booleanToString(Object value, Class<?> target) {
        if ("String".equals(target.getSimpleName())) {
            return Boolean.toString((Boolean) value);
        }
        try {
            throw new BeanCopierException("booleanToString:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 转换list
     */
    public static List dealList(Object value, Class<?> target) {
        List v = (List) value;
        if (v.size() <= 0) {
            return null;
        }
        Object o = v.get(0);
        if (o instanceof Photos) {
            if ("List".equals(target.getSimpleName())) {
                List<Photos> ps = (List<Photos>) value;
                List<PhotosVO> pvos = new ArrayList<>();
                for (Photos p : ps) {
                    PhotosVO photosVO = new PhotosVO();
                    transDOToVO(p, photosVO);
                    pvos.add(photosVO);
                }
                return pvos;
            }
        }
        try {
            throw new BeanCopierException("dealList:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;

    }


}
