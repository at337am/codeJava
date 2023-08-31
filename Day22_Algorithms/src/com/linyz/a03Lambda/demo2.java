package com.linyz.a03Lambda;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        Integer[] arr = {11, 34, 24, 15, 69, 27};

        // 用lambda表达式最省略的方式写降序sort()方法:
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
