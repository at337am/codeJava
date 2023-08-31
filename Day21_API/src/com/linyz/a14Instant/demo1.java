package com.linyz.a14Instant;

/*Instant时间戳*/

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class demo1 {
    public static void main(String[] args) {
        // 获取对象  标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //根据毫秒获取对象
        Instant instant1 = Instant.ofEpochMilli(20000L);
        System.out.println(instant1);

        // 指定时区 返回带有时区的时间戳对象
        ZoneId zoneid = ZoneId.systemDefault();
        ZonedDateTime time = Instant.now().atZone(zoneid);// 返回带有时区的时间戳对象
        System.out.println(time);// 2023-07-17T11:23:44.261141900+08:00[Asia/Taipei]

        // 用于时间的判断
        // 判断时间是否在一个时间的前面和后面
        Instant instant2 = Instant.ofEpochMilli(1000L);
        Instant instant3 = Instant.ofEpochMilli(2000L);
        boolean result1 = instant2.isBefore(instant3);
        System.out.println(result1);
        boolean result2 = instant2.isAfter(instant3);
        System.out.println(result2);

        //  减少时间系列的方法
        Instant instant4 = Instant.ofEpochMilli(5000L);// instant4: 1970-01-01T00:00:05Z
        Instant new_instant4 = instant4.minusSeconds(1); // 减少一秒
        System.out.println(new_instant4);// 1970-01-01T00:00:04Z


        // 增加时间系列的方法
        Instant instant5 = Instant.ofEpochMilli(30000L);// instant5: 1970-01-01T00:00:30Z
        Instant new_instant5 = instant5.plusSeconds(30);// 增加30秒
        System.out.println(new_instant5);// 1970-01-01T00:01:00Z


    }
}
