package com.linyz.a05Set.TreeSet.demo2;

import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("xswl", 12);
        Student s2 = new Student("ooaa", 13);
        Student s3 = new Student("xswp", 9);

        // 泛型是自定义的对象时, 要给Student实现一个Comparable接口, 并重新compareTo方法
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s2);
        ts.add(s3);
        ts.add(s1);

        // 遍历
        for (Student t : ts) {
            System.out.println(t);
        }

        // 运行结果: 按年龄从小到大排序
        // Student{name='xswp', age=9}
        // Student{name='xswl', age=12}
        // Student{name='ooaa', age=13}
    }
}
