package com.moon.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

/**
 * @author moon
 * @date 2023-09-22 16:28
 * @description
 */
public final class DateUtil {

    public static final String ASIA_SHANGHAI = "Asia/Shanghai";
    public static final ZoneId ZONE_ID_SHANGHAI = ZoneId.of(ASIA_SHANGHAI);

    public static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZONE_ID_SHANGHAI);

    public static final LocalDateTime DEFAULT_REMIND_TIME =
            LocalDateTime.parse("1970-01-01T00:00:00");

    public static final DateTimeFormatter FORMATTER_DATE =
            DateTimeFormatter.ofPattern("yyyy-MM-dd").withZone(ZONE_ID_SHANGHAI);

    public static final DateTimeFormatter FORMATTER_YEAR_MONTH =
            DateTimeFormatter.ofPattern("yyyy-MM").withZone(ZONE_ID_SHANGHAI);


    private DateUtil() {
    }

    public static Date to(LocalDateTime ldt) {
        return to(ldt, ZONE_ID_SHANGHAI);
    }

    public static Date to(LocalDateTime datetime, ZoneId zoneId) {
        Instant instant = datetime.atZone(zoneId).toInstant();
        return Date.from(instant);
    }

    public static LocalDateTime to(Date date) {
        return to(date, ZONE_ID_SHANGHAI);
    }

    public static LocalDateTime to(Date date, ZoneId zoneId) {
        Instant instant = date.toInstant();
        return instant.atZone(zoneId).toLocalDateTime();
    }

    /**
     * 长格式 时长
     *
     * @param duration 区间
     * @return 1天2时3分4秒
     */
    public static String longFormatDuration(Duration duration) {
        return String.format("%d天%d时%d分%d秒", duration.toDays(),
                duration.toHours() % 24,
                duration.toMinutes() % 60,
                duration.getSeconds() % 60);
    }

    public static String longFormatDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return longFormatDuration(duration);
    }

    public static String longFormatDuration(Date start, Date end) {
        return longFormatDuration(to(start), to(end));
    }

    private static String fillZero(long value, boolean fill) {
        if (fill) {
            return String.format("%02d", value);
        }
        return String.valueOf(value);
    }

    /**
     * 短格式 时长
     *
     * @param du 区间
     * @return 2时4秒
     */
    public static String formatDuration2(Duration du, boolean fillZero) {
        StringBuilder sb = new StringBuilder(32);
        if (Duration.ZERO.compareTo(du) == 0) {
            return sb.append("0秒").toString();
        }
        long seconds = du.getSeconds() % 60;
        if (seconds > 0) {
            sb.insert(0, "秒");
            sb.insert(0, fillZero(seconds, fillZero));
        }
        long minute = du.toMinutes() % 60;
        if (minute > 0) {
            sb.insert(0, "分");
            sb.insert(0, fillZero(minute, fillZero));
        }
        long hour = du.toHours() % 24;
        if (hour > 0) {
            sb.insert(0, "时");
            sb.insert(0, fillZero(hour, fillZero));
        }
        long day = du.toDays();
        if (day > 0) {
            sb.insert(0, "天");
            sb.insert(0, fillZero(day, fillZero));
        }
        return sb.toString();
    }

    public static String formatDuration(Duration du) {
        return formatDuration2(du, false);
    }

    public static String formatDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return formatDuration(duration);
    }

    public static String formatDuration(Date start, Date end) {
        return formatDuration(to(start), to(end));
    }

    /**
     * 将秒数转换为时分秒 例  68秒  转为1分8秒
     *
     * @param time 秒数
     * @return 转换后的时间
     */
    public static String formatDuration(long time) {
        Duration duration = Duration.ofSeconds(time);
        return formatDuration(duration);
    }

    public static String formatDuration2(Long time, boolean fillZero) {
        if (Objects.isNull(time) || Objects.equals(0, time)) {
            return "-";
        }
        Duration duration = Duration.ofSeconds(time);
        return formatDuration2(duration, fillZero);
    }

    /**
     * 将日期转换为 N 天前的格式
     */
    public static String daysBefore(LocalDateTime dateTime) {
        if (null == dateTime) {
            return "";
        }
        long days = LocalDate.now().toEpochDay() - dateTime.toLocalDate().toEpochDay();
        return (days == 0) ? "当天" : (days + "天前");
    }

    /**
     * 时间戳转为LocalDateTime (东八区，北京时间)
     *
     * @param milli 毫秒
     * @return LocalDateTime
     */
    public static LocalDateTime epochMilli2LocalDateTime(long milli) {
        Instant instant = Instant.ofEpochMilli(milli);
        return LocalDateTime.ofInstant(instant, ZONE_ID_SHANGHAI);
    }

    /**
     * 当前时间是否在开始结束时间之内,包含等于
     *
     * @param start 开始时间
     * @param end   结束时间
     */
    public static boolean between(LocalDate start, LocalDate end) {
        return between(start, end, LocalDate.now());
    }

    /**
     * 当前时间是否在开始结束时间之内,包含等于
     *
     * @param start 开始时间
     * @param end   结束时间
     * @param date  比较时间
     */
    public static boolean between(LocalDate start, LocalDate end, LocalDate date) {
        long epochDay = date.toEpochDay();
        return start.toEpochDay() <= epochDay && epochDay <= end.toEpochDay();
    }

    /**
     * 当前时间是否在开始结束时间之内,包含等于
     *
     * @param start 开始时间
     * @param end   结束时间
     */
    public static boolean between(LocalDateTime start, LocalDateTime end) {
        return between(start, end, LocalDateTime.now());
    }

    /**
     * 当前时间是否在开始结束时间之内,包含等于
     *
     * @param start    开始时间
     * @param end      结束时间
     * @param datetime 比较时间
     */
    public static boolean between(LocalDateTime start, LocalDateTime end, LocalDateTime datetime) {
        long startMilli = start.toInstant(ZoneOffset.UTC).toEpochMilli();
        long endMilli = end.toInstant(ZoneOffset.UTC).toEpochMilli();
        long datetimeMilli = datetime.toInstant(ZoneOffset.UTC).toEpochMilli();
        return startMilli <= datetimeMilli && datetimeMilli <= endMilli;
    }


}
