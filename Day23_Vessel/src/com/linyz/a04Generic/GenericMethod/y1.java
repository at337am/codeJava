package com.linyz.a04Generic.GenericMethod;

import java.util.ArrayList;

public class y1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list, "2", "3", "4", "5", "6");
        System.out.println(list);// [2, 3, 4, 5, 6]
    }
}
