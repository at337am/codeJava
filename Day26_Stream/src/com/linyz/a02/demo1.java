package com.linyz.a02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

// 单列集合获取Stream流

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "p", "r", "d", "c");
        Stream<String> stream1 = list.stream();

        //使用终结方法 遍历
        stream1.forEach(System.out::println);
    }
}
