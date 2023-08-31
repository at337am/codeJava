package com.linyz.a18ChronoUnit;

/*ChronoUnit计算时间工具类*/

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class demo1 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2025, 2, 6, 0, 0, 0);

        System.out.println(ChronoUnit.YEARS.between(ldt1, ldt2));// 年数
        System.out.println(ChronoUnit.MONTHS.between(ldt1, ldt2));// 月数
        System.out.println(ChronoUnit.WEEKS.between(ldt1, ldt2));// 周数
        System.out.println(ChronoUnit.DAYS.between(ldt1, ldt2));// 天数
        System.out.println(ChronoUnit.HOURS.between(ldt1, ldt2));// 小时
        System.out.println(ChronoUnit.MINUTES.between(ldt1, ldt2));// 秒数
        System.out.println(ChronoUnit.MILLIS.between(ldt1, ldt2));// 毫秒
    }
}
