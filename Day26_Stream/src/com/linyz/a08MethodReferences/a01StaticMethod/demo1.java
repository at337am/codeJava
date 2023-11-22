package com.linyz.a08MethodReferences.a01StaticMethod;

import java.util.Arrays;

// 方法引用初识
public class demo1 {
    public static void main(String[] args) {
        // 需求: 给数组排序 倒序
        Integer[] arr = {5, 3, 2, 7, 4, 3, 1};

        // 匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        // lambda表达式
        // 因为new Comparator是函数式接口 所以才能使用lambda表达式
        // Arrays.sort(arr, (o1, o2) -> o2 - o1);

        // 方法引用
        Arrays.sort(arr, demo1::method);

        // 遍历
        System.out.println(Arrays.toString(arr));

    }

    // 方法引用
    // 条件: 形参和返回值和引用处的要相同
    // 可以是java已经存在的方法
    // 也可以是第三方或者自己编写的方法
    public static int method(int num1, int num2){
        return num2 - num1;
    }
}
