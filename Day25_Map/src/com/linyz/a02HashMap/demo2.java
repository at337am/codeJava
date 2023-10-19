package com.linyz.a02HashMap;

// 练习2
// 八十名学生, 四个景点A,B,C,D, 每个学生选一个景点, 计算出哪个景点去的人数最多

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> hm = new HashMap<>();

        for (String name : list) {
            if (hm.containsKey(name)) {
                // 景点存在
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                // 景点不存在
                hm.put(name, 1);
            }
        }

        // 统计最多人数
        int max = 0;

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        // 用max和value比较求出对应的景点名字
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println("人数最多的景点为: " + entry.getKey() + ", 人数为: " + max);
            }
        }

        // 遍历hm集合
        hm.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}

