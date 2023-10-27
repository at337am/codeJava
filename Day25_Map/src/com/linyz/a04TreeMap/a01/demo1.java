package com.linyz.a04TreeMap.a01;

import java.util.TreeMap;

public class demo1 {
    public static void main(String[] args) {
        // 传入学生和籍贯, 学生姓名和年龄一样视为一个人
        // 按照学生年龄升序排列, 再按照姓名排序

        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("xswvsdfd", 12);
        Student s2 = new Student("askdhaksj", 13);
        Student s3 = new Student("sdfoiwe", 13);
        tm.put(s1, "温岭");
        tm.put(s2, "杭州");
        tm.put(s3, "上海");

        tm.forEach((key,value)->{
            System.out.println(key + "->" + value);
        });
    }
}
