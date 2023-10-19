package com.linyz.a02Iterator;

/*使用lambda表达式进行遍历forEach方法*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class demo3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("xsl");
        collection.add("swl");
        collection.add("xwl");
        collection.add("xsw");

        // 匿名内部类
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // lambda表达式
        collection.forEach(s -> System.out.println(s));
        // * 方法引用, 如果只是为了打印元素, 可以用这个方法
        collection.forEach(System.out::println);
    }
}
