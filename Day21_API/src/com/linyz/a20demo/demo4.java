package com.linyz.a20demo;

/*练习4*/

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class demo4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2003, 2, 6, 0, 0, 0);
        long days = ChronoUnit.DAYS.between(birthday, ldt);
        System.out.println(days);
    }
}
