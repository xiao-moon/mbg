package com.moon.config.convert;

import com.moon.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;

/**
 * 毫秒 时间戳 转 LocalDateTime
 */
public final class Long2LocalDateTime implements Converter<Long, LocalDateTime> {
    @Override
    public LocalDateTime convert(Long milli) {
        return DateUtil.epochMilli2LocalDateTime(milli);
    }
}