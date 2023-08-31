package com.linyz.a05Set.TreeSet.demo4;

import java.util.TreeSet;

// 案例

public class demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("xo", 12, 90, 98, 50);
        Student s2 = new Student("xs", 11, 91, 97, 50);
        Student s3 = new Student("le", 14, 95, 100, 30);
        Student s4 = new Student("oq", 11, 60, 99, 70);
        Student s5 = new Student("to", 15, 70, 80, 70);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        ts.forEach(System.out::println);
        //Student{name = to, age = 15, chinese_score = 70, math_score = 80, english_score = 70}
        //Student{name = le, age = 14, chinese_score = 95, math_score = 100, english_score = 30}
        //Student{name = oq, age = 11, chinese_score = 60, math_score = 99, english_score = 70}
        //Student{name = xo, age = 12, chinese_score = 90, math_score = 98, english_score = 50}
        //Student{name = xs, age = 11, chinese_score = 91, math_score = 97, english_score = 50}
    }

}
