package com.linyz.a01CommonMethods;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

// 终结方法

// 将流收集到集合中
public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "pa-boy-12", "as-boy-12", "op-girl-10", "osds-boy-18", "s-girl-14", "asa-boy-7", "ojo-boy-19");

        // 将流收集到list中
        List<String> collectList = list.stream()
                .filter(s -> "boy".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        // 将流收集到set中
        // 会自动去除重复的元素
        Set<String> collectSet = list.stream()
                .filter(s -> "girl".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        // 将流收集到map中
        // 键不能重复
        Map<String, String> collectMap = list.stream()
                .filter(s -> "boy".equals(s.split("-")[1]))
                // 第一个匿名内部类, 键的规则
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                return s.split("-")[0];
                            }
                        },
                        // 第二个匿名内部类, 值的规则
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                return s.split("-")[2];
                            }
                        }));

        // 改写成lambda表达式 toMap
        Map<String, String> collectMap2 = list.stream()
                .filter(s -> "boy".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> s.split("-")[2]));

        // 遍历
        collectMap2.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "-" + s2);
            }
        });
    }
}