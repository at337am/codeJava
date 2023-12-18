package com.linyz.a04MethodReferences.a04Other;

import java.util.ArrayList;
import java.util.Collections;

// 类名::成员方法

// 独有的方法引用规则:
//
// 1. 需要是函数式接口
// 2. 被引用的方法必须已经存在
// 3. 引用处方法的第一个形参决定了可以被引用的类
// 4. 引用处方法的第二个形参到最后一个形参要和被引用的方法形参相同, 返回值也要相同
// 5. 被引用的功能需要满足当前的需求
//
// 局限性:
// 不能引用所有类中的成员方法
// 和引用处方法的第一个形参有关, 这个形参是什么类型的, 那么只能引用这个类中的方法
public class demo1 {
    public static void main(String[] args) {
        // 需求: 将集合中的元素转换成大写
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc");

        // 原来的写法
        /*list.stream().map(new Function<String, String>() {
            @Override
            // 第一个形参是String 只能引用String类中的方法
            // 第二个形参是无参 那么被引用的方法的形参必须也是无参
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/

        // 使用方法引用
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
