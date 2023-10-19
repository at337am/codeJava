package com.linyz.a05Set.TreeSet;

import java.util.TreeSet;

public class demo3 {
    public static void main(String[] args) {
        // 先按照长度进行排序, 如果长度相等, 就按照默认的compareTo方法进行排序
        // 和Arrays.sort()排序类似

        // lambda表达式的写法
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add("xswlo");
        ts.add("wd");
        ts.add("xsasca");
        ts.add("xswao");

        ts.forEach(System.out::println);
        // wd
        // xswao
        // xswlo
        // xsasca
    }
}
