package com.linyz.a06Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

// 按指定格式输出 bbb=ba,asa,as,asa

public class Test3 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "b", "s", "aa");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "ba", "asa", "as", "asa");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "sa", "lin", "as", "pin");

        hm.put("aaa", list1);
        hm.put("bbb", list2);
        hm.put("ccc", list3);

        // 指定格式遍历
        hm.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String s, ArrayList<String> strings) {
                StringJoiner sj = new StringJoiner(",");
                for (String str : strings) {
                    sj.add(str);
                }
                System.out.println(s + "=" + sj);
            }
        });
    }
}
