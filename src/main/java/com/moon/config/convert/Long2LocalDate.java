package com.moon.config.convert;

import com.moon.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 毫秒 时间戳 转 LocalDate
 */
public final class Long2LocalDate implements Converter<Long, LocalDate> {
    @Override
    public LocalDate convert(Long milli) {
        LocalDateTime dt = DateUtil.epochMilli2LocalDateTime(milli);
        return dt.toLocalDate();
    }
}