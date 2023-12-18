package com.linyz.a01CommonMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

//中间方法

// 去重
// 合并两个流
public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "aaa", "ccc", "aaa", "aaa", "aaa", "aaa");

        // 去重, 底层依赖hashcode和equals
        list1.stream().distinct().forEach(System.out::println);

        System.out.println("===========");

        // 合并两个流
        // 最好是同种数据类型
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 1231, 2);
        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
    }
}
