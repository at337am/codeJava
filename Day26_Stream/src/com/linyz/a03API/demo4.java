package com.linyz.a03API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

// 终结方法

// 遍历方法
// 统计个数
// 将流放进新的数组中
public class demo4 {
    public static void main(String[] args) {

        // 遍历方法 和list单列集合的遍历方法类似
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "asa", "sads", "asdas");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 统计个数
        long count = list.stream().count();
        System.out.println(count);

        // 收集流中的数据, 存放到数组中
        // 会产生一个新的数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        // 改写成lambda表达式
        String[] arr1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr1));

    }
}
