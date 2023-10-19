package com.linyz.a01Map;

/*Map遍历方式1 键找值*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hhh", "xswl");
        map.put("iii", "asfcdas");
        map.put("uuu", "ooo");

        Set<String> keys = map.keySet();
        // 增强for循环
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "->" + value);
        }

        System.out.println("------------");

        // 迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "->" + value);
        }

        System.out.println("------------");

        // forEach的lambda表达式
        keys.forEach(key -> {
            String value = map.get(key);
            System.out.println(key + "->" + value);
        });

    }
}
