package com.linyz.a04TreeMap.a02;

import java.util.*;

public class dmeo1 {
    public static void main(String[] args) {
        String str = "eaababcabcdabcde";
        // 统计字符出现次数, 按照字符降序进行排序
        TreeMap<Character, Integer> tm = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1) ;
            }
        });

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 将c存入tm中并进行统计
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            }else {
                tm.put(c, 1);
            }
        }

        // 遍历集合. 并按照指定的格式进行遍历
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> {
            sb.append(key).append("(").append(value).append(")");
        });

        System.out.println(sb.toString());
    }
}
