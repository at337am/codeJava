package com.linyz.a01Book;

import java.util.ArrayList;

// 使用var动态类型

public class demo1 {
    public static void main(String[] args) {
        Student stu1 = new Student("xswl", 12);
        Student stu2 = new Student("xswl", 12);
        Student stu3 = new Student("xsl", 13);
        Student stu4 = new Student("xswl", 12);

        var list = new ArrayList<Student>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        list.forEach(System.out::println);

    }
}
