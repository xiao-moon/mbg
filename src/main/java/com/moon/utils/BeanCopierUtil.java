package com.moon.utils;

import com.moon.exception.BeanCopierException;
import com.moon.model.entity.Comments;
import com.moon.model.entity.Photos;
import com.moon.model.entity.Tags;
import com.moon.model.vo.CommentsVO;
import com.moon.model.vo.PhotosVO;
import com.moon.model.vo.TagsVO;
import org.springframework.cglib.beans.BeanCopier;

import java.text.ParseException;
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

    public static void transDOToVO(Object DO, Object VO) {
        // 构造转换器对象，最后的参数表示是否需要自定义转换器
        BeanCopier beanCopier = BeanCopier.create(DO.getClass(), VO.getClass(), true);
        try {
            // 转换对象，自定义转换器处理特殊字段
            beanCopier.copy(DO, VO, (value, target, context) -> {
                // 原始数据value是Date类型，目标类型target是String
                if (value instanceof String) {
                    if (value == null || value.equals("")) {
                        return "";
                    }
                } else if (value == null) {
                    return null;
                }
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void transVOToDO(Object VO, Object DO) {
        // 构造转换器对象，最后的参数表示是否需要自定义转换器
        BeanCopier beanCopier = BeanCopier.create(VO.getClass(), DO.getClass(), true);
        beanCopier.copy(VO, DO, (value, target, context) -> {
            if (value == null || value.equals("")) {
                return null;
            }
            if (target.getSimpleName().equalsIgnoreCase("Date")) {
                return stringToDate(value,target);
            }
            if(target.getSimpleName().equalsIgnoreCase("Long")){
                return stringToLong(value,target);
            }
            if(target.getSimpleName().equalsIgnoreCase("Integer")
                || target.getSimpleName().equalsIgnoreCase("int")){
                return stringToInteger(value,target);
            }
            if(target.getSimpleName().equalsIgnoreCase("Boolean")){
                return stringToBoolean(value, target);
            }
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
    private static List dealList(Object value, Class<?> target) {
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
        if (o instanceof Tags) {
            if ("List".equals(target.getSimpleName())) {
                List<Tags> ts = (List<Tags>) value;
                List<TagsVO> tsvo = new ArrayList<>();
                for (Tags t : ts) {
                    TagsVO tagsVO = new TagsVO();
                    transDOToVO(t, tagsVO);
                    tsvo.add(tagsVO);
                }
                return tsvo;
            }
        }
        if (o instanceof Comments) {
            if ("List".equals(target.getSimpleName())) {
                List<Comments> cList = (List<Comments>) value;
                List<CommentsVO> cvoList = new ArrayList<>();
                for (Comments c : cList) {
                    CommentsVO commentsVO = new CommentsVO();
                    transDOToVO(c, commentsVO);
                    cvoList.add(commentsVO);
                }
                return cvoList;
            }
        }

        try {
            throw new BeanCopierException("dealList:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;

    }

    /*#############################VO_TO_DO######################################*/

    private static Date stringToDate(Object value, Class<?> target) {
        if ("Date".equals(target.getSimpleName())) {
            Date parse = null;
            try {
                parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) value);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse;
        }
        try {
            throw new BeanCopierException("StringToDate:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static Long stringToLong(Object value, Class<?> target) {
        if ("Long".equalsIgnoreCase(target.getSimpleName())) {
            return Long.parseLong((String) value);
        }
        try {
            throw new BeanCopierException("stringToLong:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static Integer stringToInteger(Object value, Class<?> target) {
        if ("Integer".equals(target.getSimpleName())
                || "int".equalsIgnoreCase(target.getSimpleName())) {
            return Integer.parseInt((String) value);
        }
        try {
            throw new BeanCopierException("stringToInteger:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Boolean stringToBoolean(Object value, Class<?> target) {
        if (target.getSimpleName().equalsIgnoreCase("Boolean")) {
            return Boolean.parseBoolean((String) value);
        }
        try {
            throw new BeanCopierException("stringToBoolean:转换异常");
        } catch (BeanCopierException e) {
            e.printStackTrace();
        }
        return null;
    }


}
