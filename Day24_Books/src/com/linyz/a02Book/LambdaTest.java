package com.linyz.a02Book;

import java.util.Arrays;

/*var 语法糖*/

public class LambdaTest {
    public static void main(String[] args) {
        var arr = new String[]{"xswl", "xsads", "ashfdoas", "cashds"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 底层, sort()接收了一个实现了Comparator接口的类的对象,
        // 这个对象调用compare方法会执行lambda表达式这个体
        Arrays.sort(arr, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(arr));

    }
}
