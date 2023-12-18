package com.linyz.a04MethodReferences.a05Test.a01;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    // 自定义构造方法
    public Student(String str){
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
