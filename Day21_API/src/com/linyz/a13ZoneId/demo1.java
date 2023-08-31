package com.linyz.a13ZoneId;

/*ZoneId时区类*/

import java.time.ZoneId;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {

        // 获取所有时区
        Set<String> zoneid = ZoneId.getAvailableZoneIds();
        System.out.println(zoneid.size());// 603 表示有603个时区
        System.out.println(zoneid);// 603 表示有603个时区

        // 获取默认时区
        ZoneId zone1 = ZoneId.systemDefault();
        System.out.println(zone1);// Asia/Taipei

        // 指定一个时区
        ZoneId zone2 = ZoneId.of("America/El_Salvador");
        System.out.println(zone2);// America/El_Salvador

    }
}
