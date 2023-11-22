package com.linyz.a04Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        // 过滤奇数 保留偶数 并将结果保存起来

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> collectList = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());

        // 改写成lambda表达式
        // list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        collectList.forEach(System.out::println);
    }
}
