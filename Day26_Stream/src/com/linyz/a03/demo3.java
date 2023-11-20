package com.linyz.a03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

// 中间方法
// 类型转换
public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "asa-12", "ada-21", "sds-12", "ssd-19", "ery-17");
        // 第一个参数 流中原本的数据类型
        // 第二个参数 转换后的数据类型 (返回值类型)

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                // 切割 转换成数组
                String[] arr = s.split("-");
                // asa-12   获取数组中第二个元素 并转换成int类型
                return Integer.parseInt(arr[1]);
            }
        }).forEach(System.out::println);

        System.out.println("=========");

        // 写成一行
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }
}
