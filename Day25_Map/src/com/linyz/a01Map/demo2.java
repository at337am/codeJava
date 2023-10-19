package com.linyz.a01Map;

/*Map遍历方式2 键值对*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hhh", "xswl");
        map.put("iii", "asfcdas");
        map.put("uuu", "ooo");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 增强for循环
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }

        System.out.println("------------");

        // 迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        }

        System.out.println("------------");

        // forEach的lambda表达式
        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "->" + value);
        });



    }
}
