package com.linyz.a08MethodReferences.a02MemberMethod;

import java.util.ArrayList;
import java.util.Collections;

// 成员方法引用
// 其它类: 对象::method
// 本类: this::method
// 父类: super::method
public class demo1 {
    public static void main(String[] args) {
        // 需求: 只要c开头且age大于10的
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-12", "c-13", "c-6", "d-5");

        // 原来的写法
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split("-")[0].startsWith("c") && Integer.parseInt(s.split("-")[1]) >= 10;
            }
        }).forEach(System.out::println);*/

        // 使用方法引用
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
    }
}

