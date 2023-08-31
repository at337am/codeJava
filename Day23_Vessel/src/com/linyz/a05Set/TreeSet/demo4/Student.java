package com.linyz.a05Set.TreeSet.demo4;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int chinese_score;
    private int math_score;
    private int english_score;

    public Student() {
    }

    public Student(String name, int age, int chinese_score, int math_score, int english_score) {
        this.name = name;
        this.age = age;
        this.chinese_score = chinese_score;
        this.math_score = math_score;
        this.english_score = english_score;
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

    public int getChinese_score() {
        return chinese_score;
    }

    public void setChinese_score(int chinese_score) {
        this.chinese_score = chinese_score;
    }

    public int getMath_score() {
        return math_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public int getEnglish_score() {
        return english_score;
    }

    public void setEnglish_score(int english_score) {
        this.english_score = english_score;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese_score = " + chinese_score + ", math_score = " + math_score + ", english_score = " + english_score + "}";
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = this.getChinese_score() + this.getMath_score() + this.getEnglish_score();
        int sum2 = o.getChinese_score() + o.getMath_score() + o.getEnglish_score();
        int i = sum1 - sum2;
        i = i == 0 ? this.getChinese_score() - o.getChinese_score() : i;
        i = i == 0 ? this.getMath_score() - o.getMath_score() : i;
        // 这里不比较英语, 因为执行到这里的话, 英语肯定一样
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
