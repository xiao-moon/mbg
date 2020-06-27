//package com.moon.utils;
//
//import com.moon.exception.BeanCopierException;
//import com.moon.model.dto.PhotosDTO;
//import com.moon.model.entity.PhotosDO;
//import org.springframework.cglib.beans.BeanCopier;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * 描述: 领域模型转换
// * 创建人: 小月
// * 创建时间: 2020/6/1 1:38
// */
//public class BeanCopierUtil {
//
//    public static void transDOToDTO(Object DO, Object DTO) {
//        // 构造转换器对象，最后的参数表示是否需要自定义转换器
//        BeanCopier beanCopier = BeanCopier.create(DO.getClass(), DTO.getClass(), true);
//        // 转换对象，自定义转换器处理特殊字段
//        beanCopier.copy(DO, DTO, (value, target, context) -> {
//            // 原始数据value是Date类型，目标类型target是String
//            if (value instanceof Date) {
//                return dateToString(value, target);
//            }
//            if (value instanceof Long) {
//                return longToString(value, target);
//            }
//            if (value instanceof Integer) {
//                return integerToString(value, target);
//            }
//            if (value instanceof Boolean) {
//                return booleanToString(value, target);
//            }
//            if (value instanceof PhotosDO) {
//                PhotosDTO photosDTO = new PhotosDTO();
//                transDOToDTO(value, photosDTO);
//                return photosDTO;
//            }
//
//            // 未匹配上的字段，原值返回
//            return value;
//
//        });
//    }
//
//
//    private static String dateToString(Object value, Class<?> target) {
//        if ("String".equals(target.getSimpleName())) {
//            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(value);
//        }
//        try {
//            throw new BeanCopierException("timestampToString:转换异常");
//        } catch (BeanCopierException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static String longToString(Object value, Class<?> target) {
//        if ("String".equals(target.getSimpleName())) {
//            return value + "";
//        }
//        try {
//            throw new BeanCopierException("longToString:转换异常");
//        } catch (BeanCopierException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static String integerToString(Object value, Class<?> target) {
//        if ("String".equals(target.getSimpleName())) {
//            return value + "";
//        }
//        try {
//            throw new BeanCopierException("integerToString:转换异常");
//        } catch (BeanCopierException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static String booleanToString(Object value, Class<?> target) {
//        if ("String".equals(target.getSimpleName())) {
//            return Boolean.toString((Boolean) value);
//        }
//        try {
//            throw new BeanCopierException("integerToString:转换异常");
//        } catch (BeanCopierException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
////    public static Object objToEntity(Object value, Class target) {
////        if ("AttachmentsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "CategoriesDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "CommentBlackListDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "CommentsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "JournalsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "LinksDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "LogsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "MenusDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "MetasDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "OptionsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "PhotosDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "PostCategoriesDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "PostsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "PostTagsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "TagsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "ThemeSettingsDO".equalsIgnoreCase(target.getSimpleName()) ||
////                "UsersDO".equalsIgnoreCase(target.getSimpleName())) {
////        }
////        return null;
////    }
//
//}
