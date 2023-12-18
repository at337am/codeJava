package com.linyz.a04MethodReferences.a03ConstructorMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

// 构造方法引用
// 类名::new
public class demo1 {
    public static void main(String[] args) {
        // 需求: 将集合中的元素(name和age)封装成Student对象 并保存到list集合中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "xl,10", "lk,11", "io,11", "iu,15");

        // 原来的写法
        /*list.stream()
                .map(new Function<String, Student>() {
                    @Override
                    public Student apply(String s) {
                        return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
                    }
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);*/


        // 使用方法引用
        // 因为函数式接口的返回值是Student对象 形参是String. 所以在Student类中定义一个符合要求的构造方法
        list.stream()
                .map(Student::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

