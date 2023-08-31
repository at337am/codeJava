package com.linyz.a08Regex;

/*替换
* 切割
* */

public class demo8 {
    public static void main(String[] args) {
        // 替换
        String str = "小呆呆xiaddfsfdsfoda小诗诗ahdiushadassd";
        String result = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result);

        // 切割
        String[] arr = str.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");// 小呆呆 小诗诗
        }
    }
}
