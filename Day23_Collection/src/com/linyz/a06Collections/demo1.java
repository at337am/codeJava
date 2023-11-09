package com.linyz.a06Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Collections单列集合工具类

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 批量添加元素
        Collections.addAll(list, "sdas", "sadsasda", "aa", "asdasd");

        // 排序, 按照字符串长度倒序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        list.forEach(System.out::println);

        System.out.println("---------");

        // 打乱
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
}
