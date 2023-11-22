package com.linyz.a08MethodReferences.a01StaticMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

// 静态方法引用
public class demo2 {
    public static void main(String[] args) {
        // 需求: 将集合中的元素转成int类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 原来的写法
        /*list.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .forEach(System.out::println);*/

        // 使用方法引用
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);

    }
}

