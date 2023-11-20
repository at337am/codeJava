package com.linyz.a02;

import java.util.Arrays;

// 数组获取Stream流

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
