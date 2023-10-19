package com.linyz.a01Map;

/*Map遍历方式3 forEach的lambda表达式*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class demo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hhh", "xswl");
        map.put("iii", "asfcdas");
        map.put("uuu", "ooo");

        // 匿名内部类
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "->" + value);
            }
        });

        System.out.println("------------");

        // lambda表达式
        map.forEach((String key, String value) -> {
            System.out.println(key + "->" + value);
        });

        System.out.println("------------");

        // 最简单的lambda表达式
        map.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}
