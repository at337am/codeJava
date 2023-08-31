package com.linyz.a05Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        // 打印集合
        // 默认从小到大进行排序
        System.out.println(ts);// [1, 2, 3, 5]

        // 三种遍历方式:
        // 迭代器遍历
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }

        // 增强for循环遍历
        for (Integer t : ts) {
            System.out.println(t);
        }

        // lambda遍历
        ts.forEach(System.out::println);
    }
}