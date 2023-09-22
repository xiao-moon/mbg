package com.moon.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.moon.config.convert.String2LocalDateTime;
import com.moon.exception.ServiceException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;

/**
 * @author moon
 * @date 2023-09-22 16:27
 * @description 基于 jackson 封装的 Json 工具
 * LocalDate, LocalDateTime 序列化反序列化均为 UTC+8 时间戳
 */
public final class JsonUtil {
    private static final int MAX_LENGTH = 1024;
    private static final ObjectMapper mapper;
    private static final TypeReference<Map<String, Object>> MAP_TYPE;

    private JsonUtil() {
    }

    static {
        JavaTimeModule timeModule = new JavaTimeModule();
        timeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        timeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        timeModule.addSerializer(LocalDate.class, new LocalDateSerializer());
        timeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        timeModule.addSerializer(LocalTime.class, new LocalTimeSerializer());
        timeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer());

        mapper = JsonMapper.builder()
                .addModule(timeModule)
                .findAndAddModules()
                .build();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setTimeZone(TimeZone.getTimeZone(DateUtil.ZONE_ID_SHANGHAI));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature(), true);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        mapper.addMixIn(MultipartFile.class, JsonIgnoreClass.class);

        MAP_TYPE = new TypeReference<Map<String, Object>>() {
        };
    }

    public static ObjectMapper getMapper() {
        return mapper;
    }

    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            throw new ServiceException(ex);
        }
    }

    public static Map<String, Object> toMap(Object obj) {
        if (obj == null) {
            return Collections.emptyMap();
        }
        String json = toJson(obj);
        return toMap(json);
    }

    public static Map<String, Object> toMap(String json) {
        if (json == null) {
            return Collections.emptyMap();
        }
        return fromJson(json, MAP_TYPE);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        if (json == null || clazz == null) {
            return null;
        }
        try {

            return mapper.readValue(json, clazz);
        } catch (JsonProcessingException ex) {
            int len = json.length() > MAX_LENGTH ? MAX_LENGTH : json.length();
            String msg = json.substring(0, len) + " => " + clazz.getName();
            throw new ServiceException(msg, ex);
        }
    }

    public static <T> T fromJson(String json, TypeReference<T> type) {
        if (json == null || type == null) {
            return null;
        }
        try {
            return mapper.readValue(json, type);
        } catch (JsonProcessingException ex) {
            String msg = json + " => " + type.getType();
            throw new ServiceException(msg, ex);
        }
    }

    private static class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator gen,
                              SerializerProvider provider) throws IOException {

            Instant instant = value.atZone(DateUtil.ZONE_ID_SHANGHAI).toInstant();
            long milli = instant.toEpochMilli();
            gen.writeNumber(milli);
        }
    }

    private static class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser parser,
                                         DeserializationContext context) throws IOException {
            long milli = parser.getValueAsLong();
            if (milli > 0) {
                return DateUtil.epochMilli2LocalDateTime(milli);
            }
            String str = parser.getValueAsString();
            return String2LocalDateTime.tryConvert(str);
        }
    }

    private static class LocalDateSerializer extends JsonSerializer<LocalDate> {
        @Override
        public void serialize(LocalDate date, JsonGenerator gen,
                              SerializerProvider provider) throws IOException {
            LocalDateTime dt = date.atStartOfDay();
            Instant instant = dt.atZone(DateUtil.ZONE_ID_SHANGHAI).toInstant();
            long milli = instant.toEpochMilli();
            gen.writeNumber(milli);
        }
    }

    private static class LocalDateDeserializer extends JsonDeserializer<LocalDate> {
        @Override
        public LocalDate deserialize(JsonParser parser,
                                     DeserializationContext context) throws IOException {
            long milli = parser.getValueAsLong();
            LocalDateTime dt = DateUtil.epochMilli2LocalDateTime(milli);
            return dt.toLocalDate();
        }
    }

    private static class LocalTimeSerializer extends JsonSerializer<LocalTime> {
        @Override
        public void serialize(LocalTime value, JsonGenerator gen,
                              SerializerProvider provider) throws IOException {
            gen.writeString(value.toString());
        }
    }

    private static class LocalTimeDeserializer extends JsonDeserializer<LocalTime> {
        @Override
        public LocalTime deserialize(JsonParser parser,
                                     DeserializationContext context) throws IOException {
            String timeStr = parser.getValueAsString();
            return LocalTime.parse(timeStr);
        }
    }

    @JsonIgnoreType
    private static class JsonIgnoreClass {
    }

}
