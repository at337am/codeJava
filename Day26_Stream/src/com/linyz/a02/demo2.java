package com.linyz.a02;

import java.util.HashMap;

// 双列集合获取Stream流

public class demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("asda", 1);
        hm.put("asasd", 2);
        hm.put("asdasda", 3);

        // 获取所有键
        hm.keySet().stream().forEach(System.out::println);

        // 获取所有键值对
        hm.entrySet().stream().forEach(System.out::println);
    }
}
