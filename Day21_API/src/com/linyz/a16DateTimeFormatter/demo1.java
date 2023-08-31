package com.linyz.a16DateTimeFormatter;

/*DateTimeFormatter时间格式化类*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class demo1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EE a");
        String str = dtf.format(LocalDateTime.now());
        System.out.println(str);
    }
}
