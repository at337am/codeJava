package com.linyz.a02HashMap;

/*HashMap 无序, 不重复, 无索引*/

// 练习1
// HashMap存储 键:学生对象Student, 值: 籍贯String
// 同姓名和年龄认为是一个学生

import java.util.HashMap;
import java.util.Objects;

public class demo1 {
    public static void main(String[] args) {
        Student lwf = new Student("lwf", 12);
        Student xss = new Student("xss", 13);
        Student xsx = new Student("xss", 13);

        HashMap<Student, String> hm = new HashMap<>();

        hm.put(lwf, "浙江");
        hm.put(xss, "江苏");
        hm.put(xsx, "台湾");

        // 遍历hm集合
        hm.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
