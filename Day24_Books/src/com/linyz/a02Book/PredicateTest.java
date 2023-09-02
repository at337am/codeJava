package com.linyz.a02Book;

import java.util.ArrayList;

public class PredicateTest {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("xswl");
        list.add("xl");
        list.add("xsl");

        // 参数是Predicate接口, 这个接口专门用来传递lambda表达式
        list.removeIf(e -> e.equals("xsl"));

        for (String s : list) {
            System.out.println(s);
        }

    }
}
