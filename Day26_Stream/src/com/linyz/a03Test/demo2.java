package com.linyz.a03Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        // 将年龄大于10的收集到map集合中
        // 姓名为键, 年龄为值

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-12", "b-13", "c-6", "d-5");

        Map<String, String> collectMap = list.stream()
                .filter(s -> Integer.parseInt(s.split("-")[1]) >= 10)
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> s.split("-")[1]));

        // 遍历
        collectMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + ": " + s2);
            }
        });
    }
}
