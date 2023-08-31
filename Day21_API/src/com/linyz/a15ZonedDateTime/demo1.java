package com.linyz.a15ZonedDateTime;

/*ZoneIdDateTime带有时区的时间*/

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class demo1 {
    public static void main(String[] args) {
        // 返回当前时区的对象
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);// 2023-07-17T11:51:56.756781300+08:00[Asia/Taipei]

        // 获取指定时间的对象
        ZonedDateTime zdt2 = ZonedDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println(zdt2);// 2023-07-17T11:51:56.756781300+08:00[Asia/Taipei]

        // 修改时间
        ZonedDateTime zdt3 = ZonedDateTime.now();// 2023-07-17T11:51:56.757781100+08:00[Asia/Taipei]
        // 将小时修改为2
        ZonedDateTime new_zdt3 = zdt3.withHour(2);
        System.out.println(new_zdt3);// 2023-07-17T02:51:56.757781100+08:00[Asia/Taipei]
        // 将天数修改为364天
        ZonedDateTime zdt4 = zdt3.withDayOfYear(364);
        System.out.println(zdt4);// 2023-12-30T11:51:56.757781100+08:00[Asia/Taipei]

        // 减少时间
        ZonedDateTime zdt5 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(2000L), ZoneId.systemDefault());// 1970-01-01T08:00:02+08:00[Asia/Taipei]
        ZonedDateTime new_zdt5 = zdt5.minusSeconds(1);
        System.out.println(new_zdt5);// 1970-01-01T08:00:01+08:00[Asia/Taipei]

        // 增加时间
        ZonedDateTime new_new_zdt5 = new_zdt5.plusSeconds(5);
        System.out.println(new_new_zdt5);// 1970-01-01T08:00:06+08:00[Asia/Taipei]

    }
}
