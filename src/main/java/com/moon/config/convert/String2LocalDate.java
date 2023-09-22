package com.moon.config.convert;

import com.moon.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

/**
 * 字符串 转 LocalDate
 */
@Slf4j
public final class String2LocalDate implements Converter<String, LocalDate> {
    /**
     * 支持 日期字符串 "2022-01-23" <br>
     * 支持 时间戳字符串 如 "1642867200000"
     */
    @Override
    public LocalDate convert(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        LocalDate dt = convert1(str);
        if (dt == null) {
            dt = convert2(str);
        }
        if (dt == null) {
            log.error("failed: {} => LocalDate", str);
        }
        return dt;
    }

    private static LocalDate convert1(String str) {
        try {
            return LocalDate.parse(str);
        } catch (DateTimeParseException ex) {
            ignore(ex);
        }
        return null;
    }

    private static LocalDate convert2(String str) {
        try {
            long milli = Long.parseLong(str);
            LocalDateTime ldt = DateUtil.epochMilli2LocalDateTime(milli);
            return ldt.toLocalDate();
        } catch (NumberFormatException ex) {
            ignore(ex);
        }
        return null;
    }

    public static void ignore(Throwable ex) {
        if (log.isDebugEnabled()) {
            log.debug("do not worry, ignore this exception {}", ex.getMessage());
        }
    }
}

