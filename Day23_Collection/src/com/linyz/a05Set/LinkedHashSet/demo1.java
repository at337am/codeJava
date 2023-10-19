package com.linyz.a05Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class demo1 {
    public static void main(String[] args) {
        Student stu1 = new Student("苏", 11);
        Student stu2 = new Student("蔡", 14);
        Student stu3 = new Student("林", 12);
        Student stu4 = new Student("苏", 11);

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(stu1));
        System.out.println(linkedHashSet.add(stu2));
        System.out.println(linkedHashSet.add(stu3));
        System.out.println(linkedHashSet.add(stu4));

        // 输出是有序的
        System.out.println(linkedHashSet);
    }
}
