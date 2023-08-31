package com.linyz.a05Set.HashSet;

import java.util.HashSet;

// 有序

public class demo1 {
    public static void main(String[] args) {
        Student stu1 = new Student("苏", 11);
        Student stu2 = new Student("蔡", 14);
        Student stu3 = new Student("林", 12);
        Student stu4 = new Student("苏", 11);

        HashSet<Student> hashSet = new HashSet<>();

        // 重写了hashcode方法和equals方法之后, 集合中无法添加重复元素
        System.out.println(hashSet.add(stu1));// true
        System.out.println(hashSet.add(stu2));// true
        System.out.println(hashSet.add(stu3));// true
        System.out.println(hashSet.add(stu4));// false

        System.out.println(hashSet);

    }
}
