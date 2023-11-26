package com.linyz.a02File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Stream;

// 单列list和set集合获取Stream流

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "p", "r", "d", "c");
        Stream<String> stream1 = list.stream();

        //遍历
        stream1.forEach(System.out::println);

        System.out.println("==========");

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "as", "sas", "sas", "as");
        Stream<String> stream2 = set.stream();

        // 遍历 自动去重
        stream2.forEach(System.out::println);
    }
}
