package com.linyz.a03Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {

        // 只保留姓名长度为3的前两个元素
        ArrayList<String> list1 = new ArrayList<>();

        // 只保留i开头的且不要第一个
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list1, "xsl,12", "lak,13", "plo,10", "uiu,12");
        Collections.addAll(list2, "xl,10", "lk,11", "io,11", "iu,15");

        Stream<String> stream1 = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("i"))
                .skip(1);

        // 将两个流合并到一起, 将演员信息封装成Actor对象, 将所有Actor对象存入到list中
        List<Actor> actorList = Stream.concat(stream1, stream2)
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        Actor actor = new Actor();
                        actor.setName(s.split(",")[0]);
                        actor.setAge(Integer.parseInt(s.split(",")[1]));
                        return actor;
                    }
                })
                .collect(Collectors.toList());

        // lambda表达式
        /*List<Actor> actorList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());*/

        // 遍历
        actorList.forEach(System.out::println);
    }
}

class Actor{
    private String name;
    private int age;

    public Actor() {
    }

    public Actor(String name, int age) {
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
    public String
    toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
