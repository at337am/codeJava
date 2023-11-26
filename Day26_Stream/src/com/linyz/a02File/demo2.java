package com.linyz.a02File;

import java.util.HashMap;

// 双列map集合获取Stream流

public class demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("asda", 1);
        hm.put("asasd", 2);
        hm.put("asdasda", 3);

        // 将键转成流
        hm.keySet().stream().forEach(System.out::println);

        // 将键值对转成流
        hm.entrySet().stream().forEach(System.out::println);
    }
}
