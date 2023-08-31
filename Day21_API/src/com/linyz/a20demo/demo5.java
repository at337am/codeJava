package com.linyz.a20demo;

/*练习5*/

import java.time.LocalDate;

public class demo5 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2003, 03, 01);
        LocalDate ld1 = ld.minusDays(1);
        if (ld1.getDayOfMonth() == 29) {
            System.out.println("该年是润年");
        } else {
            System.out.println("该年是平年");
        }
    }
}
