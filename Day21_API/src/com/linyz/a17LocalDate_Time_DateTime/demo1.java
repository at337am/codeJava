package com.linyz.a17LocalDate_Time_DateTime;

/*LocalDate
* LocalTime
* LocalDateTime
* 日历类*/

import java.time.*;

public class demo1 {
    public static void main(String[] args) {
        // 获取当前时间的对象
        LocalDate localdate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println(localdate);// 2023-07-17
        System.out.println(localtime);// 12:34:38.930866
        System.out.println(localdatetime);// 2023-07-17T12:34:38.931866700

        // 获取指定时间的对象
        LocalDateTime ldt1 = LocalDateTime.of(localdate, localtime);
        System.out.println(ldt1);
        LocalDate ld1 = LocalDate.of(2024, 02, 06);
        System.out.println(ld1);
        LocalTime lt1 = LocalTime.of(23, 59, 59, 1);
        System.out.println(lt1);

        // 获取周几
        DayOfWeek dayOfWeek = ld1.getDayOfWeek();
        System.out.println(dayOfWeek);// TUESDAY
        // 获取小时
        int hour = lt1.getHour();
        System.out.println(hour);// 23
        // 获取一年中的第几天
        int dayOfYear = ldt1.getDayOfYear();
        System.out.println(dayOfYear);// 198

        // 比较日期先后 三者通用
        boolean after = ldt1.isAfter(localdatetime);
        System.out.println(after);

        // 修改日期 三者通用
        System.out.println(LocalTime.now().withHour(14));
        System.out.println(LocalDate.now().withMonth(9));
        System.out.println(LocalDateTime.now().withDayOfYear(364));

        // 减少两周
        System.out.println(LocalDate.now().minusWeeks(2));
        // 减少两天
        System.out.println(LocalDateTime.now().minusDays(12));
        // 减少一小时
        System.out.println(LocalTime.now().minusHours(1));

        // 增加204天 同上
        System.out.println(LocalDateTime.now().plusDays(204));
    }
}
