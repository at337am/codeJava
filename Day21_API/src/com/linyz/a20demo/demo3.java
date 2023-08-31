package com.linyz.a20demo;

/*练习3*/

import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(100));
    }

    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        int yu = 0;
        while (num != 0) {
            yu = num     % 2;
            num /= 2;
            sb.insert(0, yu);
        }
        return sb.toString();
    }
}
