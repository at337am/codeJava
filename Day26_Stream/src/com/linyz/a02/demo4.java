package com.linyz.a02;

// 零散数据获取Stream流

import java.util.stream.Stream;

public class demo4 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
        Stream.of("无语", "笑死", "哈哈").forEach(System.out::println);

        int[] arrInt = {5, 3, 3, 2};
        String[] arrStr = {"as", "sas"};
        /*注意:
         * Stream的静态方法of中, 可以传递零散数据和数组. 但是是不能传递基本数据类型的数组*/
        Stream.of(arrInt).forEach(System.out::println);// [I@3d075dc0
        Stream.of(arrStr).forEach(System.out::println);// 正常
    }
}
