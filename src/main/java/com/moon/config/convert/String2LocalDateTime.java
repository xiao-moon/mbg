package com.moon.config.convert;

import com.moon.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author moon
 * @date 2023-09-22 16:34
 * @description 字符串 转 LocalDateTime
 */
@Slf4j
public class String2LocalDateTime implements Converter<String, LocalDateTime> {

    private static final DateTimeFormatter FORMATTER4
            = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter FORMATTER3
            = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    /**
     * 支持下列时间格式 <br>
     * 支持 "2022-01-23T05:16:39" <br>
     * 支持 "2022-01-23T05:16:39.123" <br>
     * 支持 "2022-01-23T05:16:39.123456789"
     * <p>
     * 支持 "2022-01-23 05:16:39" <br>
     * 支持 "2022-01-23 05:16:39.123"
     * <p>
     * 支持 时间戳字符串 如 "1642867200000"
     */
    @Override
    public LocalDateTime convert(String str) {
        return tryConvert(str);
    }

    public static LocalDateTime tryConvert(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        LocalDateTime dt = convert1(str);
        if (dt == null) {
            dt = convert2(str);
        }
        if (dt == null) {
            dt = convert3(str);
        }
        if (dt == null) {
            dt = convert4(str);
        }
        if (dt == null) {
            dt = convert5(str);
        }
        if (dt == null) {
            log.error("failed: {} => LocalDateTime", str);
        }
        return dt;
    }

    /**
     * ISO_LOCAL_DATE_TIME
     * 2021-08-20T13:22:36.123456789
     */
    private static LocalDateTime convert1(String str) {
        try {
            return LocalDateTime.parse(str);
        } catch (Exception ex) {
            String2LocalDate.ignore(ex);
        }
        return null;
    }

    private static LocalDateTime convert5(String str) {
        try {
            return LocalDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME);
        } catch (Exception ex) {
            String2LocalDate.ignore(ex);
        }
        return null;
    }

    private static LocalDateTime convert4(String str) {
        try {
            return LocalDateTime.parse(str, FORMATTER4);
        } catch (Exception ex) {
            String2LocalDate.ignore(ex);
        }
        return null;
    }

    private static LocalDateTime convert3(String str) {
        try {
            return LocalDateTime.parse(str, FORMATTER3);
        } catch (Exception ex) {
            String2LocalDate.ignore(ex);
        }
        return null;
    }

    private static LocalDateTime convert2(String str) {
        try {
            long milli = Long.parseLong(str);
            return DateUtil.epochMilli2LocalDateTime(milli);
        } catch (NumberFormatException ex) {
            String2LocalDate.ignore(ex);
        }
        return null;
    }


}
