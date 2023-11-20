package com.linyz.a01;

import java.util.ArrayList;
import java.util.Collections;

// 过滤以a开头 再过滤长度为3 遍历
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "asa", "aouoi", "aip", "aas", "yiquwyqi", "aosfhca");
        list.stream().filter(name -> name.startsWith("a")).filter(name -> name.length() == 3).forEach(System.out::println);
    }
}
