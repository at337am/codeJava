package com.linyz.a03Lambda;

/*练习*/

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "aaaa", "aaaaa", "aa", "a"};

        // 完整的lambda表达式
        Arrays.sort(arr, (String o1, String o2) -> {
            return o1.length() - o2.length();
        });

        // 使用最简lambda表达式
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }

}
