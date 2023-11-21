package com.linyz.a03API;

// 中间方法
// 对数据本身无影响
// stream流用完就消失, 建议链式编程

// 过滤
// 获取前面几个元素
// 跳过前面几个元素
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "as", "sads", "asa", "asdasd","opaso");

        // 过滤元素
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // 如果是true, 则留下
                // false  舍弃

                // 是a开头的吗
                return s.startsWith("s");
            }
        }).forEach(System.out::println);

        System.out.println("=================");

        //获取流前面几个元素
        list.stream().limit(3)
                .forEach(System.out::println);

        System.out.println("=================");

        // 跳过前面几个元素
        list.stream().skip(3)
                .forEach(System.out::println);


    }
}
