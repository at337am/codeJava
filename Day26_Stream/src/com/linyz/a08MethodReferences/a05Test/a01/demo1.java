package com.linyz.a08MethodReferences.a05Test.a01;

import com.linyz.a08MethodReferences.a03ConstructorMethod.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "y,16", "zpy,13", "xss,12", "ls,11");
        // 需求: 将集合中的元素封装成Student对象, 并收集到Student类型的数组中

        Student[] arr = list.stream()
                .map(Student::new)
                .toArray(Student[]::new);

        // 遍历
        System.out.println(Arrays.toString(arr));
    }
}
