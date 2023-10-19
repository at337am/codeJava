package com.linyz.a01Collection;

/*contains()方法*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class demo1 {
    public static void main(String[] args) {
        // 这里运用了多态
        // 此时collection只能调用Collection里面的方法, 但是方法的内容是ArrayList里的
        Collection<Student> collection = new ArrayList<>();
        Student stu1 = new Student(12, "xs");
        Student stu2 = new Student(11, "xs");
        Student stu3 = new Student(12, "xs");
        collection.add(stu1);
        collection.add(stu2);

        // contains()方法底层使用equals来判断对象是否存在的
        // 如果想根据数据来判断存在性的话, 需要在Student类中重写
        boolean contains = collection.contains(stu3);
        System.out.println(contains);

    }
}


class Student{
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
