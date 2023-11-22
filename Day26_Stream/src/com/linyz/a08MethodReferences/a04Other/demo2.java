package com.linyz.a08MethodReferences.a04Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;
import java.util.stream.Stream;

// 数组类型[]::new
// 目的就是为了创建指定类型的数组
//
// 细节:
// 创建的数组的类型要和流中的类型一致

public class demo2 {
    public static void main(String[] args) {
        // 需求: 集合中有一些整数, 收集到数组中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 3, 2);

        // 原来的写法
        /*Integer[] arr = list.stream()
                  .toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int value) {
                        return new Integer[value];
                    }
                });*/

        // 使用方法引用
        Integer[] arr = list.stream().toArray(Integer[]::new);

        // 遍历
        System.out.println(Arrays.toString(arr));
    }
}
