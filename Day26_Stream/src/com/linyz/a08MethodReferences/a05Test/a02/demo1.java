package com.linyz.a08MethodReferences.a05Test.a02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        // 需求1: 将姓名放到数组中, 使用方法引用
        // 需求2: 将年龄放到数组中, 使用方法引用
        // 需求3: 将姓名和年龄拼接成"aaa-12"的格式放到数组中, 使用方法引用

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("aaa", 12);
        Student stu2 = new Student("bbb", 13);
        Student stu3 = new Student("ccc", 14);

        Collections.addAll(list, stu1, stu2, stu3);

        // 需求1:
        String[] arrName = list.stream()
                .map(Student::getName)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arrName));

        // 需求2:
        Integer[] arrAge = list.stream()
                .map(Student::getAge)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arrAge));

        // 需求3:
        String[] arrString = list.stream()
                .map(Student::toString)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arrString));

        /*使用了 类名::成员方法 的方法引用*/
    }
}
