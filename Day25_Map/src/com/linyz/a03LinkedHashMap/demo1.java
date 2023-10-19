package com.linyz.a03LinkedHashMap;

/*LinkedHashMap 有序, 不重复, 无索引*/

import java.util.LinkedHashMap;

public class demo1 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("c", 63453);
        lhm.put("a", 111);
        lhm.put("a", 4534);
        lhm.put("b", 1234);

        // 按存储的顺序
        lhm.forEach((key, value) -> System.out.println(key + "-> " + value));
    }
}
