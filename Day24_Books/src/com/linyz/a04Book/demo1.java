package com.linyz.a04Book;

import java.util.ArrayList;
import java.util.Random;

// 题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，到小集合当中。
// 要求使用自定义的方法来实现筛选
public class demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }

        // 遍历当前集合
        list.forEach(System.out::print);

        System.out.println("\n结果是：");

        ArrayList<Integer> new_list = toList(list);
        new_list.forEach(System.out::print);
    }

    static ArrayList<Integer> toList(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
