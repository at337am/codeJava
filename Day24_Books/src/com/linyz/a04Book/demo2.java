package com.linyz.a04Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.function.BiConsumer;

// 有一百个数据, 统计每个数据出现了多少次

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        list.forEach(System.out::println);

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer i : list) {
            if (hm.get(i) == null) {
                hm.put(i, 1);
            } else {
                int count = hm.get(i);
                hm.put(i, count + 1);
            }
        }

        hm.forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println("数据:" + integer + "出现了:" + integer2);
            }
        });

    }
}
